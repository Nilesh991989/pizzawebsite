package com.lm.pizza.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lm.pizza.entity.Menu;

public interface MenuRepository extends JpaRepository<Menu,String>{

	Menu findByMenuid(String menuid);

}
