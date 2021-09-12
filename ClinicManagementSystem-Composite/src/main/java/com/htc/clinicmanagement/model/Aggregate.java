package com.htc.clinicmanagement.model;

import java.util.List;


public class Aggregate {
	
	private long appointmentId;
	private List<Doctor>doctors;
	private List<Patient>patients;
	private List<Appointment>appointments;
	public Aggregate() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Aggregate(long appointmentId, List<Doctor> doctors, List<Patient> patients, List<Appointment> appointments) {
		super();
		this.appointmentId = appointmentId;
		this.doctors = doctors;
		this.patients = patients;
		this.appointments = appointments;
	}
	public long getAppointmentId() {
		return appointmentId;
	}
	public void setAppointmentId(long appointmentId) {
		this.appointmentId = appointmentId;
	}
	public List<Doctor> getDoctors() {
		return doctors;
	}
	public void setDoctors(List<Doctor> doctors) {
		this.doctors = doctors;
	}
	public List<Patient> getPatients() {
		return patients;
	}
	public void setPatients(List<Patient> patients) {
		this.patients = patients;
	}
	public List<Appointment> getAppointments() {
		return appointments;
	}
	public void setAppointments(List<Appointment> appointments) {
		this.appointments = appointments;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (appointmentId ^ (appointmentId >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aggregate other = (Aggregate) obj;
		if (appointmentId != other.appointmentId)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Aggregate [appointmentId=" + appointmentId + ", doctors=" + doctors + ", patients=" + patients
				+ ", appointments=" + appointments + "]";
	}
	
	
	

}
