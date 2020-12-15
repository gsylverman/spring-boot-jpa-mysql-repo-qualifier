package com.gavril.dao;

import com.gavril.model.Student;

import java.util.Collection;

public interface StudentDao {
    Collection<Student> getAllStudents();

    Student getStudentById(int id);

    Student addStudent(Student student);

    Student updateStudent(Student student);

    Student deleteStudentById(int id);

}
