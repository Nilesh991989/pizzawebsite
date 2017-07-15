package com.lm.pizza.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lm.pizza.entity.Menu;
import com.lm.pizza.repository.MenuRepository;

@Service
public class MenuService {
	
	@Autowired
	MenuRepository menuRepository;

	public Menu getMenu(String menu) {
		return menuRepository.findByMenuid(menu);
		
	}


}
