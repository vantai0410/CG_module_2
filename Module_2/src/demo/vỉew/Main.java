package demo.view;


import demo.controller.StudentController;

public class Main {
    public static void main(String[] args) {
        StudentController sc = new StudentController();
        sc.showStudentMenu();
    }
}
