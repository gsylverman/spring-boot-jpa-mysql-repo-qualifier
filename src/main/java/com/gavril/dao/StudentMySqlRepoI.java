package com.gavril.dao;

import com.gavril.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentMySqlRepoI extends JpaRepository<Student, Integer> {
}
