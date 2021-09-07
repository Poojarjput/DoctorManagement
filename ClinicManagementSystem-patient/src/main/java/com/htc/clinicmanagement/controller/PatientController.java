package com.htc.clinicmanagement.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.htc.clinicmanagement.dao.IPatient;
import com.htc.clinicmanagement.model.Patient;


@RestController
@RequestMapping("/api")
public class PatientController {
	
	@Autowired
	private IPatient repo;

	
	 @GetMapping("/patients")
	  public List<Patient> getAllPatientdetails() {
	   
	    List<Patient> list = new ArrayList<>();
	    Iterable<Patient> customers = repo.findAll();
	 
	    customers.forEach(list::add);
	    return list;
	  }
	 
	
	@GetMapping("/patients/{patientId}")
	Patient getPatientbyId(@PathVariable Long patientId)
	{
		Patient patient=null;
		patient=repo.getById(patientId);//Due to lazy loading in JPA instead of repo.getOne(id)
		return patient;
		
	}
	
	@GetMapping("/patients/{appointmentId}")
	Patient getPatientbyAppointmentId(@PathVariable Long appointmentId)
	{
		Patient patient=null;
		patient=repo.getById(appointmentId);//Due to lazy loading in JPA instead of repo.getOne(id)
		return patient;
		
	}
	
	@PutMapping("/patients/{patientId}")
	public boolean updatePatient(@RequestBody Patient newpatient, @PathVariable long patientId) {
		return repo.findById(patientId)
				.map(patient ->{
					patient.setHealthIssue(newpatient.getHealthIssue());
					
					return repo.save(patient);
				})
				.orElseGet(() -> {
					newpatient.setPatientId(patientId);
			     return repo.save(newpatient);
			      }) != null;
	}
	
	@PostMapping("/patients")
	Patient createPatientdetails(@RequestBody Patient patient)
	{
		return repo.save(patient);
		
	}

	
}
