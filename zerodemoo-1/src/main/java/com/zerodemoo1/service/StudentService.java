package com.zerodemoo1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zerodemoo1.entity.StudentEntity;
import com.zerodemoo1.repository.StudentRepository;

@Service
public class StudentService {
	@Autowired
	StudentRepository sr;
	public List<StudentEntity> getAll()
	{
		return sr.findAll();
	}
	
	public StudentEntity saveInfo(StudentEntity s)
	{
		return sr.save(s);
	}
	
}
