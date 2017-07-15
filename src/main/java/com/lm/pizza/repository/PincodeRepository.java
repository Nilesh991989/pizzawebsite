package com.lm.pizza.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lm.pizza.entity.Pincodes;

public interface PincodeRepository extends JpaRepository<Pincodes,String>{

}
