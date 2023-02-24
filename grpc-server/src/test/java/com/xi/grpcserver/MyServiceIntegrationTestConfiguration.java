package com.xi.grpcserver;

import com.xi.grpcserver.controller.DemoGrpcServiceImpl;
import com.xi.grpcserver.repository.HospitalRepository;
import com.xi.grpcserver.repository.PatientRepository;
import com.xi.grpcserver.service.DemoService;
import com.xi.grpcserver.service.DemoServiceImpl;
import lombok.AllArgsConstructor;
import net.devh.boot.grpc.client.autoconfigure.GrpcClientAutoConfiguration;
import net.devh.boot.grpc.server.autoconfigure.GrpcServerAutoConfiguration;
import net.devh.boot.grpc.server.autoconfigure.GrpcServerFactoryAutoConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
@ImportAutoConfiguration({
        GrpcServerAutoConfiguration.class, // Create required server beans
        GrpcServerFactoryAutoConfiguration.class, // Select server implementation
        GrpcClientAutoConfiguration.class}) // Support @GrpcClient annotation
public class MyServiceIntegrationTestConfiguration {

    @Bean
    public DataSource dataSource() {
        return new DriverManagerDataSource("jdbc:h2:mem:testdb;DB_CLOSE_DELAY=-1", "h2", "h2");
    }

    @Bean
    DemoServiceImpl demoService() {
        return new DemoServiceImpl();
    }

    @Bean
    DemoGrpcServiceImpl myServiceImpl() {
        return new DemoGrpcServiceImpl();
    }
}
