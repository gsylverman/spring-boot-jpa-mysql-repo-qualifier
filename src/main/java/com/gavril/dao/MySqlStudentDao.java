package com.gavril.dao;

import com.gavril.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
@Qualifier("mySqlStudent")
public class MySqlStudentDao implements StudentDao {

    StudentMySqlRepoI studentMySqlRepoI;

    @Autowired
    public MySqlStudentDao(StudentMySqlRepoI studentMySqlRepoI) {
        this.studentMySqlRepoI = studentMySqlRepoI;
    }


    @Override
    public Collection<Student> getAllStudents() {
        return studentMySqlRepoI.findAll();
    }

    @Override
    public Student getStudentById(int id) {
        System.out.println(id);
        return studentMySqlRepoI.findById(id).get();
    }

    @Override
    public Student addStudent(Student student) {
        return studentMySqlRepoI.save(student);
    }

    @Override
    public Student updateStudent(Student student) {
        return studentMySqlRepoI.save(student);
    }

    @Override
    public Student deleteStudentById(int id) {
        studentMySqlRepoI.deleteById(id);
        return null;
    }
}
