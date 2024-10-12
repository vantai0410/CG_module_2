package ss16_io_text_file.manage_student_iofile.repository;

import ss16_io_text_file.manage_student_iofile.model.Student;

import java.util.List;

public interface IStudentRepository {
    List<Student> readFromFile();
    boolean addStudent(Student student);
    boolean deleteStudent(int id);
    boolean updateStudent(Student student);
    Student getStudentById(int id);
}
