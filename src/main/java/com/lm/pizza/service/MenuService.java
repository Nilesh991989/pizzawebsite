package com.lm.pizza.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lm.pizza.entity.Menu;
import com.lm.pizza.repository.MenuRepository;

@Service
public class MenuService {
	
	@Autowired
	MenuRepository menuRepository;

	public List<Menu> getMenu() {
		return menuRepository.findAll();
		
	}


}
