package com.htc.clinicmanagement.externalservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.htc.clinicmanagement.model.Doctor;


@FeignClient(url = "http://localhost:8084",name="ClinicManagementSystem")
public interface DoctorService {
	
	@GetMapping("/api/doctors/{doctorId}")
	Doctor getDoctorById(@PathVariable("doctorId") Long doctorId);
	

}
