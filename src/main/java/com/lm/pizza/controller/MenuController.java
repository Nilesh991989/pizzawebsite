package com.lm.pizza.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lm.pizza.entity.Menu;
import com.lm.pizza.service.MenuService;

@RestController
public class MenuController {
	@Autowired
	MenuService menuService;
	
	@RequestMapping(value="/menus",method=RequestMethod.GET)
	public List<Menu> getMainMenu(){
		return menuService.getMenu();
	}
	
	
}
