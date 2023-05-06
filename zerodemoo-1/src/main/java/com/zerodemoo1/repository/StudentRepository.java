package com.zerodemoo1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zerodemoo1.entity.StudentEntity;

public interface StudentRepository extends JpaRepository<StudentEntity,Integer>{

}
