package demo.repository;

import demo.model.Student;

import java.util.ArrayList;
import java.util.List;


public class StudentRepository implements IStudentRepository {
        // ddojc ghi file hoac ket noi db

    private static List<Student> studentList = new ArrayList<>();
    static {
        studentList.add(new Student(1,"tai"));
        studentList.add(new Student(2,"shi"));
        studentList.add(new Student(3,"shi"));
    }


    @Override
    public List<Student> findAll() {
        return studentList;
    }

    @Override
    public void add(Student student) {
        studentList.add(student);
    }

    @Override
    public void delete(int Id) {
        for (Student student : studentList) {
            if (student.getId() == Id) {
                studentList.remove(student);
            }
            break;
        }
    }


}
