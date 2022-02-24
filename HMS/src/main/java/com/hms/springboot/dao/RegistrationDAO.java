package com.hms.springboot.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hms.springboot.model.Registration;
@Repository
public interface RegistrationDAO extends JpaRepository<Registration, Long> {

}
