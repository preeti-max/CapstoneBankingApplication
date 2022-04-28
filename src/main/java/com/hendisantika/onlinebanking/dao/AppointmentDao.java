package com.hendisantika.onlinebanking.dao;

import com.hendisantika.onlinebanking.model.Appointment;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface AppointmentDao extends CrudRepository<Appointment, Long> {

    List<Appointment> findAll();
}
