package com.gavril.dao;

import com.gavril.entity.Student;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
@Qualifier("fakeData")
public class StudentDaoImpl implements StudentDao {
    private static final Map<Integer, Student> students;

    static {
        students = new HashMap<>(){
            {
                put(1, new Student(1, "Andrei", "NodeJs"));
                put(2, new Student(2, "Bogdanel", "C#"));
                put(3, new Student(3, "Flaviu", "C++"));
                put(4, new Student(4, "Bogdanel", "JavasScript"));
            }
        };
    }
    @Override
    public Collection<Student> getAllStudents() {
        return students.values();
    }

    @Override
    public Student getStudentById(int id){
        return students.get(id);
    }

    @Override
    public Student addStudent(Student student){
       return students.put(student.getId(), student);
    }

    @Override
    public Student updateStudent(Student student){
        int id = student.getId();
        return students.replace(id, student);
    }

    @Override
    public Student deleteStudentById(int id) {
        return students.remove(id);
    }
}
