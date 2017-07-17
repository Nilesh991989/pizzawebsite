package com.lm.pizza.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lm.pizza.entity.Menu;
import com.lm.pizza.entity.SubMenu;
import com.lm.pizza.repository.MenuRepository;
import com.lm.pizza.repository.SubMenuRepository;

@Service
public class MenuService {
	
	@Autowired
	MenuRepository menuRepository;

	@Autowired
	SubMenuRepository subMenuRepository;
	
	public List<Menu> getMenu() {
		return menuRepository.findAll();
		
	}

	public List<SubMenu> getSubMenu(String menu) {
		
		// TODO Auto-generated method stub
		return subMenuRepository.findByMenu(menu);
	}


}
