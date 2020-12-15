package com.gavril.dao;

import com.gavril.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentMySqlRepoI extends JpaRepository<Student, Integer> {
}
