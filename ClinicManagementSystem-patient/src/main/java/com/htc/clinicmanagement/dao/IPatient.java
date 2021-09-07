package com.htc.clinicmanagement.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.htc.clinicmanagement.model.Patient;

public interface IPatient extends JpaRepository<Patient, Long> {

}
