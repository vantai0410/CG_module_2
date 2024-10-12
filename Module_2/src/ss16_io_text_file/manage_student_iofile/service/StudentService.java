package ss16_io_text_file.manage_student_iofile.service;


import ss16_io_text_file.manage_student_iofile.model.Student;
import ss16_io_text_file.manage_student_iofile.repository.IStudentRepository;
import ss16_io_text_file.manage_student_iofile.repository.StudentRepository;

import java.util.List;

public class StudentService implements IStudentService {
    private IStudentRepository studentRepository = new StudentRepository();
    @Override
    public List<Student> readFromFile() {
        return studentRepository.readFromFile();
    }

    @Override
    public boolean addStudent(Student student) {
        return studentRepository.addStudent(student);
    }

    @Override
    public boolean deleteStudent(int id) {
        return studentRepository.deleteStudent(id);
    }

    @Override
    public boolean updateStudent(Student student) {
        return studentRepository.updateStudent(student);
    }

    @Override
    public Student getStudentById(int id) {
        return studentRepository.getStudentById(id);
    }
}
