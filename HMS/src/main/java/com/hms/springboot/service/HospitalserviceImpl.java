package com.hms.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hms.springboot.dao.RegistrationDAO;
import com.hms.springboot.model.Registration;


@Service
public class HospitalserviceImpl implements HospitalService{
	
	@Autowired
	RegistrationDAO registrationDAO;

	@Override
	public String createRegistration(Registration registration) {

    registrationDAO.save(registration);
		
		
		return "Registration done";
	}
	
	

}
