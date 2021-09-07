package com.htc.clinicmanagement.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "patientdetails")
public class Patient implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1409949521774509773L;
	@Id
	@GeneratedValue
	private long patientId;
	private String patientName;
	private long appointmentId;
	private String healthIssue;
	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Patient(long patientId, String patientName, long appointmentId, String healthIssue) {
		super();
		this.patientId = patientId;
		this.patientName = patientName;
		this.appointmentId = appointmentId;
		this.healthIssue = healthIssue;
	}
	public long getPatientId() {
		return patientId;
	}
	public void setPatientId(long patientId) {
		this.patientId = patientId;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public long getAppointmentId() {
		return appointmentId;
	}
	public void setAppointmentId(long appointmentId) {
		this.appointmentId = appointmentId;
	}
	public String getHealthIssue() {
		return healthIssue;
	}
	public void setHealthIssue(String healthIssue) {
		this.healthIssue = healthIssue;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (appointmentId ^ (appointmentId >>> 32));
		result = prime * result + (int) (patientId ^ (patientId >>> 32));
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
		Patient other = (Patient) obj;
		if (appointmentId != other.appointmentId)
			return false;
		if (patientId != other.patientId)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Patient [patientId=" + patientId + ", patientName=" + patientName + ", appointmentId=" + appointmentId
				+ ", healthIssue=" + healthIssue + "]";
	}
	
	
	

}
