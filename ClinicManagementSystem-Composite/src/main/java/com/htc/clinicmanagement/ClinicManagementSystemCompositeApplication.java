package com.htc.clinicmanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("com.htc.clinicmanagement.externalservice")

public class ClinicManagementSystemCompositeApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClinicManagementSystemCompositeApplication.class, args);
	}

}
