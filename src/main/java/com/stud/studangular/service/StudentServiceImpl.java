package com.stud.studangular.service;

import com.stud.studangular.model.StudentModel;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface StudentServiceImpl {

    ResponseEntity<List<StudentModel>> getStudents();
}
