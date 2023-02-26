package com.xi.grpcserver.controller;

import com.xi.demo.grpc.lib.*;
import com.xi.grpclib.StatusCode;
import com.xi.grpcserver.entity.Hospital;
import com.xi.grpcserver.entity.Patient;
import com.xi.grpcserver.service.DemoService;
import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

/**
 * Grpc service routing rpc requests to business logic.
 */
@GrpcService
public class DemoGrpcServiceImpl extends DemoGrpcServiceGrpc.DemoGrpcServiceImplBase {
    Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private DemoService demoService;

    /**
     * <pre>
     * Create a hospital.
     * </pre>
     */
    @Override
    @Transactional
    public void createHospital(CreateHospitalReq request, StreamObserver<CreateHospitalResp> responseObserver) {
        CreateHospitalResp.Builder reply = CreateHospitalResp.newBuilder().setStatusCode(StatusCode.UNKNOWN);
        try {
            if (request.getName().isEmpty()) {
                reply.setStatusCode(StatusCode.INVALID_ARGUMENT);
                return;
            }
            Hospital hospital = demoService.createHospital(Hospital.fromGrpcType(request));
            reply.setStatusCode(StatusCode.OK).setHospital(hospital.toGrpcType());
        } catch (Exception e) {
            logger.warn("Exception: " + e);
            reply.setStatusCode(StatusCode.INTERNAL);
        } finally {
            responseObserver.onNext(reply.build());
            responseObserver.onCompleted();
        }
    }

    /**
     * <pre>
     * Update the hospital.
     * </pre>
     */
    @Override
    @Transactional
    public void updateHospital(UpdateHospitalReq request, StreamObserver<UpdateHospitalResp> responseObserver) {
        UpdateHospitalResp.Builder reply = UpdateHospitalResp.newBuilder().setStatusCode(StatusCode.UNKNOWN);
        try {
            if (request.getHospital().getName().isEmpty() || request.getHospital().getId() == 0) {
                reply.setStatusCode(StatusCode.INVALID_ARGUMENT);
                return;
            }
            Optional<Hospital> hospital = demoService.updateHospital(request.getHospital());
            if (hospital.isEmpty()) {
                reply.setStatusCode(StatusCode.NOT_FOUND);
                return;
            }
            reply.setStatusCode(StatusCode.OK).setHospital(hospital.get().toGrpcType());
        } catch (Exception e) {
            logger.warn("Exception: " + e);
            reply.setStatusCode(StatusCode.INTERNAL);
        } finally {
            responseObserver.onNext(reply.build());
            responseObserver.onCompleted();
        }
    }

    /**
     * <pre>
     * Delete the hospital.
     * </pre>
     */
    @Override
    @Transactional
    public void deleteHospital(DeleteHospitalReq request, StreamObserver<DeleteHospitalResp> responseObserver) {
        DeleteHospitalResp.Builder reply = DeleteHospitalResp.newBuilder().setStatusCode(StatusCode.UNKNOWN);
        try {
            if (request.getId() == 0) {
                reply.setStatusCode(StatusCode.INVALID_ARGUMENT);
                return;
            }
            demoService.deleteHospital(request.getId());
            reply.setStatusCode(StatusCode.OK);
        } catch (Exception e) {
            logger.warn("Exception: " + e);
            reply.setStatusCode(StatusCode.INTERNAL);
        } finally {
            responseObserver.onNext(reply.build());
            responseObserver.onCompleted();
        }
    }

    /**
     * <pre>
     * Create a patient.
     * </pre>
     */
    @Override
    @Transactional
    public void createPatient(CreatePatientReq request, StreamObserver<CreatePatientResp> responseObserver) {
        CreatePatientResp.Builder reply = CreatePatientResp.newBuilder().setStatusCode(StatusCode.UNKNOWN);
        try {
            if (request.getName().isEmpty() || request.getHealthInsuranceNumber().isEmpty()) {
                reply.setStatusCode(StatusCode.INVALID_ARGUMENT);
                return;
            }
            Patient patient = demoService.createPatient(Patient.fromGrpcType(request));
            reply.setStatusCode(StatusCode.OK).setPatient(patient.toGrpcType());
        } catch (Exception e) {
            logger.warn("Exception: " + e);
            reply.setStatusCode(StatusCode.INTERNAL);
        } finally {
            responseObserver.onNext(reply.build());
            responseObserver.onCompleted();
        }
    }

    /**
     * <pre>
     * Update the patient.
     * </pre>
     */
    @Override
    @Transactional
    public void updatePatient(UpdatePatientReq request, StreamObserver<UpdatePatientResp> responseObserver) {
        UpdatePatientResp.Builder reply = UpdatePatientResp.newBuilder().setStatusCode(StatusCode.UNKNOWN);
        try {
            if (request.getPatient().getId() == 0
                    || request.getPatient().getName().isEmpty()
                    || request.getPatient().getHealthInsuranceNumber().isEmpty()) {
                reply.setStatusCode(StatusCode.INVALID_ARGUMENT);
                return;
            }
            Optional<Patient> optionalPatient = demoService.updatePatient(request.getPatient());
            if (optionalPatient.isEmpty()) {
                reply.setStatusCode(StatusCode.NOT_FOUND);
                return;
            }
            reply.setStatusCode(StatusCode.OK).setPatient(optionalPatient.get().toGrpcType());
        } catch (Exception e) {
            logger.warn("Exception: " + e);
            reply.setStatusCode(StatusCode.INTERNAL);
        } finally {
            responseObserver.onNext(reply.build());
            responseObserver.onCompleted();
        }
    }

    /**
     * <pre>
     * Delete the patient.
     * </pre>
     */
    @Override
    @Transactional
    public void deletePatient(DeletePatientReq request, StreamObserver<DeletePatientResp> responseObserver) {
        DeletePatientResp.Builder reply = DeletePatientResp.newBuilder().setStatusCode(StatusCode.UNKNOWN);
        try {
            if (request.getId() == 0) {
                reply.setStatusCode(StatusCode.INVALID_ARGUMENT);
                return;
            }
            demoService.deletePatient(request.getId());
            reply.setStatusCode(StatusCode.OK);
        } catch (Exception e) {
            logger.warn("Exception: " + e);
            reply.setStatusCode(StatusCode.INTERNAL);
        } finally {
            responseObserver.onNext(reply.build());
            responseObserver.onCompleted();
        }
    }

    /**
     * <pre>
     * Get the patient with all hospitals registered.
     * </pre>
     */
    @Override
    @Transactional
    public void getPatient(GetPatientReq request, StreamObserver<GetPatientResp> responseObserver) {
        GetPatientResp.Builder reply = GetPatientResp.newBuilder().setStatusCode(StatusCode.UNKNOWN);
        try {
            if (request.getId() == 0) {
                reply.setStatusCode(StatusCode.INVALID_ARGUMENT);
                return;
            }
            Optional<Patient> optionalPatient = demoService.getPatient(request.getId());
            if (optionalPatient.isEmpty()) {
                reply.setStatusCode(StatusCode.NOT_FOUND);
                return;
            }
            Patient patient = optionalPatient.get();
            for (Hospital hospital : patient.getHospitals()) {
                reply.addHospitals(hospital.toGrpcType());
            }
            reply.setStatusCode(StatusCode.OK).setPatient(patient.toGrpcType());
        } catch (Exception e) {
            logger.warn("Exception: " + e);
            reply.setStatusCode(StatusCode.INTERNAL);
        } finally {
            responseObserver.onNext(reply.build());
            responseObserver.onCompleted();
            logger.warn(reply.build().toString());
        }
    }

    /**
     * <pre>
     * Get the hospital with all registered patients.
     * </pre>
     */
    @Override
    @Transactional
    public void getHospital(GetHospitalReq request, StreamObserver<GetHospitalResp> responseObserver) {
        GetHospitalResp.Builder reply = GetHospitalResp.newBuilder().setStatusCode(StatusCode.UNKNOWN);
        try {
            if (request.getId() == 0) {
                reply.setStatusCode(StatusCode.INVALID_ARGUMENT);
                return;
            }
            Optional<Hospital> optionalHospital = demoService.getHospital(request.getId());
            if (optionalHospital.isEmpty()) {
                reply.setStatusCode(StatusCode.NOT_FOUND);
                return;
            }
            Hospital hospital = optionalHospital.get();
            for (Patient patient : hospital.getPatients()) {
                reply.addPatients(patient.toGrpcType());
            }
            reply.setStatusCode(StatusCode.OK).setHospital(hospital.toGrpcType());
        } catch (Exception e) {
            logger.warn("Exception: " + e);
            reply.setStatusCode(StatusCode.INTERNAL);
        } finally {
            responseObserver.onNext(reply.build());
            responseObserver.onCompleted();
        }
    }

    /**
     * <pre>
     * Register the patient in the hospital.
     * </pre>
     */
    @Override
    @Transactional
    public void registerPatient(RegisterPatientReq request, StreamObserver<RegisterPatientResp> responseObserver) {
        RegisterPatientResp.Builder reply = RegisterPatientResp.newBuilder().setStatusCode(StatusCode.UNKNOWN);
        try {
            if (request.getPatientId() == 0 || request.getHospitalId() == 0) {
                reply.setStatusCode(StatusCode.INVALID_ARGUMENT);
                return;
            }
            if (!demoService.registerPatient(request.getPatientId(), request.getHospitalId())) {
                reply.setStatusCode(StatusCode.NOT_FOUND);
                return;
            }
            reply.setStatusCode(StatusCode.OK);
        } catch (Exception e) {
            logger.warn("Exception: " + e);
            reply.setStatusCode(StatusCode.INTERNAL);
        } finally {
            responseObserver.onNext(reply.build());
            responseObserver.onCompleted();
        }
    }

    /**
     * <pre>
     * Unregister the patient from the hospital.
     * </pre>
     */
    @Override
    @Transactional
    public void unregisterPatient(UnregisterPatientReq request, StreamObserver<UnregisterPatientResp> responseObserver) {
        UnregisterPatientResp.Builder reply = UnregisterPatientResp.newBuilder().setStatusCode(StatusCode.UNKNOWN);
        try {
            if (request.getPatientId() == 0 || request.getHospitalId() == 0) {
                reply.setStatusCode(StatusCode.INVALID_ARGUMENT);
                return;
            }
            if (!demoService.unregisterPatient(request.getPatientId(), request.getHospitalId())) {
                reply.setStatusCode(StatusCode.NOT_FOUND);
                return;
            }
            reply.setStatusCode(StatusCode.OK);
        } catch (Exception e) {
            logger.warn("Exception: " + e);
            reply.setStatusCode(StatusCode.INTERNAL);
        } finally {
            responseObserver.onNext(reply.build());
            responseObserver.onCompleted();
        }
    }
}
