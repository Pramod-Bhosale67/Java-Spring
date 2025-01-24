package com.codegreedy.SpringJDBC.services;

import com.codegreedy.SpringJDBC.model.Student;
import com.codegreedy.SpringJDBC.repo.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServices {

    StudentRepository repo;

    public StudentRepository repo() {
        return repo;
    }

    @Autowired
    public void setRepo(StudentRepository repo) {
        this.repo = repo;
    }

    public void addStudent(Student stud){
        //System.out.println("Added the students");
        repo.save(stud);
    }

    public List<Student> getStudents(){
        return repo.findAll();
    }
}
