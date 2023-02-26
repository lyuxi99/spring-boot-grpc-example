package com.xi.grpcserver;

import com.xi.demo.grpc.lib.*;
import com.xi.grpclib.StatusCode;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(properties = {
        "grpc.server.inProcessName=test", // Enable inProcess server
        "grpc.server.port=-1", // Disable external server
        "grpc.client.inProcess.address=in-process:test" // Configure the client to connect to the inProcess server
})
@ActiveProfiles("testing")
@SpringJUnitConfig(classes = {DemoGrpcServiceTestConfiguration.class})
@DirtiesContext // Ensures that the grpc-server is properly shutdown after each test
@EnableAutoConfiguration
@TestMethodOrder(MethodOrderer.MethodName.class)
public class DemoGrpcServiceTest {
    Logger logger = LoggerFactory.getLogger(getClass());

    @GrpcClient("inProcess")
    private DemoGrpcServiceGrpc.DemoGrpcServiceBlockingStub grpcService;

    /**
     * Test creating hospitals will succeed.
     */
    @Test
    @DirtiesContext
    public void test1CreateHospitals() {
        for (CreateHospitalReq request : new CreateHospitalReq[]{
                CreateHospitalReq.newBuilder()
                        .setName("A Hospital").setPhone("+49 01111111111")
                        .setEmail("a.hospital@example.com").setAddress("43686 Lotheville Plaza")
                        .build(),
                CreateHospitalReq.newBuilder()
                        .setName("B Hospital").setPhone("+49 01111111112")
                        .setEmail("b.hospital@example.com").setAddress("54 Cordelia Road")
                        .build(),
        }
        ) {
            // Create the hospital.
            CreateHospitalResp response = grpcService.createHospital(request);
            assertNotNull(response);
            assertEquals(StatusCode.OK, response.getStatusCode());

            // Get the hospital and check.
            GetHospitalReq getHospitalReq = GetHospitalReq.newBuilder().setId(response.getHospital().getId()).build();
            GetHospitalResp getHospitalResp = grpcService.getHospital(getHospitalReq);
            assertEquals(request.getName(), getHospitalResp.getHospital().getName());
            assertEquals(request.getPhone(), getHospitalResp.getHospital().getPhone());
            assertEquals(request.getEmail(), getHospitalResp.getHospital().getEmail());
            assertEquals(request.getAddress(), getHospitalResp.getHospital().getAddress());
        }
    }

    /**
     * Test creating patients will succeed.
     */
    @Test
    @DirtiesContext
    public void test2CreatePatients() {
        for (CreatePatientReq request : new CreatePatientReq[]{
                CreatePatientReq.newBuilder()
                        .setName("Alice").setPhone("+49 02221111111").setHealthInsuranceNumber("Y111111111")
                        .setEmail("alice@example.com").setAddress("4458 Corry Road")
                        .build(),
                CreatePatientReq.newBuilder()
                        .setName("Bob").setPhone("+49 02221111112").setHealthInsuranceNumber("Y222222222")
                        .setEmail("bob@example.com").setAddress("33 Ryan Plaza")
                        .build(),
        }
        ) {
            // Create the patient.
            CreatePatientResp response = grpcService.createPatient(request);
            assertNotNull(response);
            assertEquals(StatusCode.OK, response.getStatusCode());

            // Get the patient and check.
            GetPatientReq getPatientReq = GetPatientReq.newBuilder().setId(response.getPatient().getId()).build();
            GetPatientResp getPatientResp = grpcService.getPatient(getPatientReq);
            assertEquals(request.getName(), getPatientResp.getPatient().getName());
            assertEquals(request.getHealthInsuranceNumber(), getPatientResp.getPatient().getHealthInsuranceNumber());
            assertEquals(request.getPhone(), getPatientResp.getPatient().getPhone());
            assertEquals(request.getEmail(), getPatientResp.getPatient().getEmail());
            assertEquals(request.getAddress(), getPatientResp.getPatient().getAddress());
        }
    }

    /**
     * Test updating a existing hospital will succeed.
     */
    @Test
    @DirtiesContext
    public void test3UpdateHospital() {
        UpdateHospitalReq request = UpdateHospitalReq.newBuilder().setHospital(
                HospitalType.newBuilder().setId(1).setName("A Hospital").setPhone("+49 01111110001")
                        .setEmail("a.hospital@example111.com").setAddress("1111 Lotheville Plaza")
                        .build()
        ).build();
        // Update the hospital.
        UpdateHospitalResp response = grpcService.updateHospital(request);
        assertNotNull(response);
        assertEquals(StatusCode.OK, response.getStatusCode());
        logger.warn(response.toString());

        // Get the hospital and check.
        GetHospitalReq getHospitalReq = GetHospitalReq.newBuilder().setId(response.getHospital().getId()).build();
        GetHospitalResp getHospitalResp = grpcService.getHospital(getHospitalReq);
        assertEquals(request.getHospital().getName(), getHospitalResp.getHospital().getName());
        assertEquals(request.getHospital().getPhone(), getHospitalResp.getHospital().getPhone());
        assertEquals(request.getHospital().getEmail(), getHospitalResp.getHospital().getEmail());
        assertEquals(request.getHospital().getAddress(), getHospitalResp.getHospital().getAddress());
    }

    /**
     * Test updating a non-existing hospital will fail.
     */
    @Test
    @DirtiesContext
    public void test4UpdateHospitalNotExists() {
        UpdateHospitalReq request = UpdateHospitalReq.newBuilder().setHospital(
                HospitalType.newBuilder().setId(999).setName("A Hospital").setPhone("+49 01111110001")
                        .setEmail("a.hospital@example111.com").setAddress("1111 Lotheville Plaza")
                        .build()
        ).build();
        UpdateHospitalResp response = grpcService.updateHospital(request);
        assertNotNull(response);
        assertEquals(StatusCode.NOT_FOUND, response.getStatusCode());
    }

    /**
     * Test registering a patient in hospitals will succeed.
     */
    @Test
    @DirtiesContext
    public void test5RegisterPatient() {
        // Register patient 1 in hospital 1 and 2.
        RegisterPatientResp response = grpcService.registerPatient(
                RegisterPatientReq.newBuilder().setPatientId(1).setHospitalId(1).build()
        );
        assertNotNull(response);
        assertEquals(StatusCode.OK, response.getStatusCode());

        response = grpcService.registerPatient(
                RegisterPatientReq.newBuilder().setPatientId(1).setHospitalId(2).build()
        );
        assertNotNull(response);
        assertEquals(StatusCode.OK, response.getStatusCode());

        // Check patient
        GetPatientResp getPatientResp = grpcService.getPatient(
                GetPatientReq.newBuilder().setId(1).build()
        );
        assertNotNull(getPatientResp);
        assertEquals(StatusCode.OK, getPatientResp.getStatusCode());
        assertEquals(2, getPatientResp.getHospitalsCount());

        // Check hospital
        GetHospitalResp getHospitalResp = grpcService.getHospital(
                GetHospitalReq.newBuilder().setId(1).build()
        );
        assertNotNull(getHospitalResp);
        assertEquals(StatusCode.OK, getHospitalResp.getStatusCode());
        assertEquals(1, getHospitalResp.getPatientsCount());
        assertEquals(1, getHospitalResp.getPatients(0).getId());
    }

    /**
     * Test unregistering a patient from hospitals will succeed.
     */
    @Test
    @DirtiesContext
    public void test6UnregisterPatient() {
        // Unregister patient 1 from hospital 1
        UnregisterPatientResp response = grpcService.unregisterPatient(
                UnregisterPatientReq.newBuilder().setPatientId(1).setHospitalId(1).build()
        );
        assertNotNull(response);
        assertEquals(StatusCode.OK, response.getStatusCode());

        // Check patient
        GetPatientResp getPatientResp = grpcService.getPatient(
                GetPatientReq.newBuilder().setId(1).build()
        );
        assertNotNull(getPatientResp);
        assertEquals(StatusCode.OK, getPatientResp.getStatusCode());
        assertEquals(1, getPatientResp.getHospitalsCount());
        assertEquals(2, getPatientResp.getHospitals(0).getId());

        // Check hospital
        GetHospitalResp getHospitalResp = grpcService.getHospital(
                GetHospitalReq.newBuilder().setId(1).build()
        );
        assertNotNull(getHospitalResp);
        assertEquals(StatusCode.OK, getHospitalResp.getStatusCode());
        assertEquals(0, getHospitalResp.getPatientsCount());
    }

    /**
     * Test deleting a existing patient will succeed.
     */
    @Test
    @DirtiesContext
    public void test7DeletePatient() {
        // Delete the patient.
        DeletePatientResp response = grpcService.deletePatient(
                DeletePatientReq.newBuilder().setId(1).build()
        );
        assertNotNull(response);
        assertEquals(StatusCode.OK, response.getStatusCode());

        // Get the deleted patient.
        GetPatientResp getPatientResp = grpcService.getPatient(
                GetPatientReq.newBuilder().setId(1).build()
        );
        assertNotNull(getPatientResp);
        assertEquals(StatusCode.NOT_FOUND, getPatientResp.getStatusCode());

        // Get the hospital where previously the patient registered.
        GetHospitalResp getHospitalResp = grpcService.getHospital(
                GetHospitalReq.newBuilder().setId(1).build()
        );
        assertNotNull(getHospitalResp);
        assertEquals(StatusCode.OK, getHospitalResp.getStatusCode());
        assertEquals(0, getHospitalResp.getPatientsCount());
    }
}
