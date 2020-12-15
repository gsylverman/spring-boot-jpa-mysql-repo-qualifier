package com.gavril.service;

import com.gavril.dao.StudentDao;
import com.gavril.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class StudentService {

    private StudentDao studentDao;

    @Autowired
    public StudentService(@Qualifier("mySqlStudent") StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    public Collection<Student> getAllStudents() {
        return studentDao.getAllStudents();
    }

    public Student getStudentById(int id) {
        return studentDao.getStudentById(id);
    }

    public Student addStudent(Student student) {
        return studentDao.addStudent(student);
    }

    public Student updateStudent(Student student) {
        return studentDao.updateStudent(student);
    }

    public Student deleteStudentById(int id) {
        return studentDao.deleteStudentById(id);
    }
}
