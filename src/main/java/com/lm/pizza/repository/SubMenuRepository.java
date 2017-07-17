package com.lm.pizza.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lm.pizza.entity.Menu;
import com.lm.pizza.entity.SubMenu;

public interface SubMenuRepository  extends JpaRepository<SubMenu,String>{

	List<SubMenu> findByMenu(String menu);
 

}
