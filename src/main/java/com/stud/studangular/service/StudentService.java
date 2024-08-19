package com.stud.studangular.service;


import com.stud.studangular.model.StudentModel;
import com.stud.studangular.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class  StudentService implements StudentServiceImpl {

    StudentRepository Repository;

    @Autowired
    public StudentService(StudentRepository Repository){
        this.Repository = Repository;
    }

    @Override
    public ResponseEntity<List<StudentModel>> getStudents(){
        return new ResponseEntity<>(Repository.findAll(), HttpStatus.OK);
    }
}
