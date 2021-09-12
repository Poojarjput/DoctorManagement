package com.htc.clinicmanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.htc.clinicmanagement.externalservice.DoctorService;
import com.htc.clinicmanagement.externalservice.PatientService;
import com.htc.clinicmanagement.model.Doctor;


@RestController("/api")
public class AggregateController {


	@Autowired
	DoctorService doctorservice;
	
	
	

	
	@GetMapping("/aggregate/doctors/{doctorId}")
	Doctor getDoctor(@PathVariable Long doctorId)
	{
		Doctor doctor=null;
		doctor=doctorservice.getDoctorById(doctorId);
		return doctor;
		
	}
	

	
}
