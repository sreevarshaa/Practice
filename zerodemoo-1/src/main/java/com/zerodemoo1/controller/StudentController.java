package com.zerodemoo1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.zerodemoo1.entity.StudentEntity;
import com.zerodemoo1.service.StudentService;

@Controller
public class StudentController {
	@Autowired
	StudentService ss;
	
	@GetMapping("/info")
	public List<StudentEntity> getAll()
	{
		return ss.getAll();
	}
	@PostMapping("/save")
    public StudentEntity saveInfo(@RequestBody StudentEntity s)
    {
    	return ss.saveInfo(s);
    }
    	
}
