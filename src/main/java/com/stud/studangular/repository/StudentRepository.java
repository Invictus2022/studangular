package com.stud.studangular.repository;

import com.stud.studangular.model.StudentModel;
import org.springframework.data.jpa.repository.JpaRepository;



public interface StudentRepository extends JpaRepository<StudentModel ,Long> {

}
