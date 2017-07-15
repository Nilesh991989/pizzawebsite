package com.lm.pizza.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lm.pizza.entity.Pincodes;
import com.lm.pizza.repository.PincodeRepository;

@Service
public class PincodesService {
	@Autowired
	PincodeRepository pincodeRepository;

	public List<Pincodes> getPincodes() {
		return pincodeRepository.findAll();
		
	}

}
