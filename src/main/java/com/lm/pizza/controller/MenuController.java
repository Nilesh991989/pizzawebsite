package com.lm.pizza.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lm.pizza.entity.Menu;
import com.lm.pizza.service.MenuService;

@RestController
public class MenuController {
	@Autowired
	MenuService menuService;
	
	@RequestMapping(value="/menu/{menu}",method=RequestMethod.GET)
	public Menu getMainMenu(@PathVariable(value="menu") String menu){
		return menuService.getMenu(menu);
	}
}
