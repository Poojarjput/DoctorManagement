package com.htc.clinicmanagement.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.htc.clinicmanagement.entity.Appointment;

public interface IAppointment extends JpaRepository<Appointment, Long> {

}
