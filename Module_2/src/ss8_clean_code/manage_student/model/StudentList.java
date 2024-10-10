package ss8_clean_code.manage_student.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentList {
    List<Student> students = new ArrayList<Student>();
    Scanner scanner = new Scanner(System.in);

    public StudentList(List<Student> students) {
        this.students = students;
    }
    public boolean addStudent(Student student) {
        for(Student s : students) {
            if(s.getId() == student.getId()) {
                System.out.println("student already exists");
                return false;
            }
        }
        students.add(student);
        System.out.println("Student added successfully");
        return true;
    }
    public boolean removeStudent(int id) {
        for(Student s : students) {
            if(s.getId() == id) {
                students.remove(s);
                System.out.println("student removed");
                return true;
            }
        }
        return false;
    }
    public List<Student> getStudents() {
        return students;
    }
    public boolean updateStudent(int id, String name, String className, String subject) {
        boolean found = false;
        for(Student s : students) {
            if(s.getId() == id) {
                found = true;
                if(!name.isEmpty()){
                    s.setName(name);
                }
                if(!className.isEmpty()){
                    s.setClassName(className);
                }
                if(!subject.isEmpty()){
                    s.setSubject(subject);
                }
                System.out.println("student updated");
                break;
            }
        }
        if(!found) {
            System.out.println("student not found");
        }
        return found;
    }
    public Student searchStudentById(int id) {
        for(Student s : students) {
            if(s.getId() == id) {
                return s;
            }
        }
        return null;
    }

}
