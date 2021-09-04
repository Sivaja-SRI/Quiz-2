package com.example.uni.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.uni.Model.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer>{

}
