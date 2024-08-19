package com.stud.studangular.controller;


import com.stud.studangular.model.StudentModel;
import com.stud.studangular.service.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/stud")
public class StudentController {

    @Autowired
    StudentServiceImpl studentController;

    public void setStudentController(StudentServiceImpl studentController) {
        this.studentController = studentController;
    }

    @GetMapping
    public ResponseEntity<List<StudentModel>> getStudents(){
        return studentController.getStudents();
    }



}
