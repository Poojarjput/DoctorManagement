package com.htc.clinicmanagement.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.htc.clinicmanagement.dao.AppointmentImplementation;
import com.htc.clinicmanagement.dao.IAppointment;
import com.htc.clinicmanagement.entity.Appointment;


@RestController
@RequestMapping("/api")
public class AppointmentController {
	
	@Autowired
	private IAppointment repo;
	
	@Autowired
	private AppointmentImplementation appointmentImplementation;
	
	 @GetMapping("/appointments")
	  public List<Appointment> getAllAppointmentsdetails() {
	   
	    List<Appointment> list = new ArrayList<>();
	    Iterable<Appointment> appointments = repo.findAll();
	 
	    appointments.forEach(list::add);
	    return list;
	  }
	 
	
	
	@GetMapping("/appointments/{appointmentDate}")
	Appointment getDoctorbyAppointmentId(@PathVariable Long appointmentId)
	{
		Appointment appointment=null;
		appointment=repo.findById(appointmentId).get();//Due to lazy loading in JPA instead of repo.getOne(id)
		return appointment;
		
	}
	
	@GetMapping("/appointmentbypatient/{patientId}")
	Appointment getDoctorbypatientId(@PathVariable Long patientId)
	{
		Appointment appointment=null;
		appointment=appointmentImplementation.getdetailsByPatientId(patientId);
		return appointment;
		
	}
	
	@PostMapping("/appointments")
	Appointment createDoctordetails(@RequestBody Appointment appointment)
	{
		return repo.save(appointment);
		
	}

}
