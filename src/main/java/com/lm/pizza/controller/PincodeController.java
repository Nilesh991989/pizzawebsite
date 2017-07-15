package com.lm.pizza.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lm.pizza.entity.Pincodes;
import com.lm.pizza.service.MenuService;
import com.lm.pizza.service.PincodesService;

@RestController
public class PincodeController {

	@Autowired
	PincodesService pincodeService;
	
	@RequestMapping(value="/pincodes",method=RequestMethod.GET)
	public List<Pincodes> getallPincodes()
	{
		return pincodeService.getPincodes();     
	}
}
