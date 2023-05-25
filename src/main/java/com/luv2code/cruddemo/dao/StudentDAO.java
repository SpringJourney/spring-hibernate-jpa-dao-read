package com.luv2code.cruddemo.dao;

import com.luv2code.cruddemo.entity.Student;

import java.util.Optional;

public interface StudentDAO {

    void save(Student theStudent);
    Optional<Student> findById(Integer id);
}
