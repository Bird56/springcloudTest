package com.southwind.repository;

import com.southwind.entity.Student;

import java.util.Collection;
import java.util.Collections;

public interface StudentRepository {
    public Collection<Student> findAll();
    public Student findById(long id);
    public void saveOrUpdate(Student student);
    public void deleteById(long id);
}
