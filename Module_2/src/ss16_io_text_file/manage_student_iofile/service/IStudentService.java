package ss16_io_text_file.manage_student_iofile.service;

import ss16_io_text_file.manage_student_iofile.model.Student;

import java.util.List;

public interface IStudentService {
    //quyddinh method crud
    List<Student> readFromFile();
    boolean addStudent(Student student);
    boolean deleteStudent(int id);
    boolean updateStudent(Student student);
    Student getStudentById(int id);
}
