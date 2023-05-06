package com.whatsapp.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.whatsapp.demo.model.student;

@Repository
public interface studentrepository extends JpaRepository<student,Integer>{
	
}
