package com.arh.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.arh.api.entity.Student;

// extnd from JpaRepository has all the required query methos,- just  pass entity name and primary key type to it
 
@Repository
public interface StudentRepository extends JpaRepository<Student, Long>  {

}
