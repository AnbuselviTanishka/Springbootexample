package com.example.MyFirstApplication;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository1 extends JpaRepository<StudentEntity1, Integer> {

}
 