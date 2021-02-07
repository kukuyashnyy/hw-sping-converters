package org.itstep.domain.dao;

import org.itstep.domain.enitity.Student;

import java.util.List;

public interface StudentDao {
    void save(Student student);
    Student update(Student student);
    Student findById(int id);
    List<Student> findAll();
    void delete(Student student);
}
