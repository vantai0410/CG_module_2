package demo.controller;

import demo.model.Student;
import demo.service.IStudentService;
import demo.service.StudentService;

import java.util.List;
import java.util.Scanner;

public class StudentController {
    private IStudentService studentService = new StudentService();
    Scanner scanner = new Scanner(System.in);

    public void showStudentMenu() {

        while (true) {
            System.out.println("chon chuc nang \n" +
                    "1. Hien thi danh sach\n" +
                    "2.Them moi \n" +
                    "3.Xoá \n" +
                    "4.Thoat");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("danh sach hoc sinh");
                    List<Student> studentList = studentService.findAll();
                    for (Student student : studentList) {
                        System.out.println(student);
                    }
                    break;
                case 2:
                    System.out.println("them  moi");
                    System.out.println("nhap id");
                    int id = Integer.parseInt(scanner.nextLine());
                    System.out.println("nhap ten");
                    String ten = scanner.nextLine();
                    Student student = new Student(id, ten);
                    studentService.add(student);
                    System.out.println("them thanh cong");

                    break;
                case 3:
                    System.out.println("xoa");
                    System.out.println("nhap id can xoa");
                    int xoa = Integer.parseInt(scanner.nextLine());
                    studentService.delete(xoa);
                    break;
                default:
                    System.exit(0);
            }
        }
    }
    }

