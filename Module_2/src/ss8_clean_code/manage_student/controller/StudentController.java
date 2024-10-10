package ss8_clean_code.manage_student.controller;

import ss8_clean_code.manage_student.model.Student;
import ss8_clean_code.manage_student.model.StudentList;
import ss8_clean_code.manage_student.view.StudentView;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentController {
    StudentView view;
    StudentList list;
    Scanner scanner = new Scanner(System.in);

    public StudentController(StudentView view, StudentList list) {
        this.view = view;
        this.list = list;
    }

    public void start() {
        while (true) {
            int choice = view.showMenu();
            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    updateStudent();
                    break;
                case 3:
                    deleteStudent();
                    break;
                case 4:
                    searchStudent();
                    break;
                case 5:
                    displayStudents();
                    break;
                default:
                    System.out.println("invalid choice");
                    break;
            }
        }
    }

    public void addStudent() {
        System.out.println("enter id: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("enter name: ");
        String name = scanner.nextLine();
        System.out.println("enter class name: ");
        String className = scanner.nextLine();
        System.out.println("enter subject: ");
        String subject = scanner.nextLine();
        list.addStudent(new Student(id, name, className, subject));
    }

    public void updateStudent() {
        System.out.println("Enter student ID to update: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter new name (leave blank if no change): ");
        String name = scanner.nextLine();
        System.out.println("Enter new class name (leave blank if no change): ");
        String className = scanner.nextLine();
        System.out.println("Enter new subject (leave blank if no change): ");
        String subject = scanner.nextLine();
        list.updateStudent(id, name, className, subject);
    }

    public void deleteStudent() {
        System.out.println("Enter student ID to delete: ");
        int id = Integer.parseInt(scanner.nextLine());
        if (!list.removeStudent(id)) {
            System.out.println("Student not found.");
        }
    }

    public void searchStudent() {
        System.out.println("Enter student ID to search: ");
        int id = Integer.parseInt(scanner.nextLine());
        Student student = list.searchStudentById(id);
        if (student != null) {
            System.out.println(student);
        } else {
            System.out.println("Student not found.");
        }
    }

    public void displayStudents() {
        view.displayStudent(list.getStudents());
    }


    public static void main(String[] args) {
        StudentView view = new StudentView();
        StudentList studentList = new StudentList(new ArrayList<>());
        StudentController controller = new StudentController(view, studentList);
        controller.start();
    }
}
