package com.samco.springbootcruddemo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.samco.springbootcruddemo.model.Student;


@Repository
public interface StudentRepositry extends CrudRepository<Student, Integer> {

}
