package demo.repository;

import demo.model.Student;

import java.util.List;

public interface IStudentRepository {
    List<Student> findAll();
    void add(Student student);
    void delete(int Id);
}
