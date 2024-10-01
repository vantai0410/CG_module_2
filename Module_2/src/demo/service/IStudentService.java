package demo.service;

import demo.model.Student;

import java.util.List;

public interface IStudentService {
    // quy dinh method CRUD
    List<Student> findAll();
    void add(Student student);
    void delete(int id);
}
