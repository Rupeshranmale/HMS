 package com.hms.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.hms.springboot.model.Registration;
import com.hms.springboot.service.HospitalserviceImpl;

@RestController
@RequestMapping("/HMS")
public class HospitalController {
	
	
	@Autowired
	HospitalserviceImpl hospitalserviceImpl;
	
	@PostMapping("/registration")
	@ResponseStatus(value = HttpStatus.OK)
	public String addRegistration(@RequestBody Registration registration) {
		return hospitalserviceImpl.createRegistration(registration);
		
		
		
	}
	@Getmapping()
}
