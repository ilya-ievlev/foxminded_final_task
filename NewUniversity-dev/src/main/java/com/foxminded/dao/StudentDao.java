package com.foxminded.dao;

import java.util.List;

import com.foxminded.domain.Student;

public interface StudentDao {

    Student create(Student student);

    List<Student> findAll();

    Student findById(int id);

    List<Student> findByGroupId(int groupId);

    Student update(Student student);

    void delete(int id);

}
