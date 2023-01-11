package org.sid.companyservice;

import org.sid.companyservice.entities.Company;
import org.sid.companyservice.model.CompanyModel;
import org.sid.companyservice.services.ClientrestService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication

@EnableDiscoveryClient
public class CompanyServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CompanyServiceApplication.class, args);
    }

}
