package com.demo.student.resources;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.student.entity.Student;

public interface StudentRepo extends JpaRepository<Student, Integer> {

}
