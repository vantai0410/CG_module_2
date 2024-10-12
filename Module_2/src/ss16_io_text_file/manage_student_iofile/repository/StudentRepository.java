package ss16_io_text_file.manage_student_iofile.repository;


import ss16_io_text_file.manage_student_iofile.model.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class StudentRepository implements IStudentRepository{
    private static final String PATH= "src/ss16_io_text_file/manage_student_iofile/student.csv";
    @Override
    public List<Student> readFromFile() {
        List<Student> students = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(PATH);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                students.add(Student.covertToLine(line));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
           e.printStackTrace();
        }
        return students;
    }

    @Override
    public boolean addStudent(Student student) {
        List<Student> students = readFromFile();
        for(Student s : students){
            if(s.getId() == student.getId()){
                return false;
            }
        }
        students.add(student);
        saveToFile(students);
        return true;
    }

    @Override
    public boolean deleteStudent(int id) {
        List<Student> students = readFromFile();
        for(Student s : students){
            if(s.getId() == id){
                students.remove(s);
                saveToFile(students);
            }
        }
        return false;
    }

    @Override
    public boolean updateStudent(Student student) {
        List<Student> students = readFromFile();
        for(Student s : students){
            if(s.getId() == student.getId()){
                if(student.getName() != null && !student.getName().isEmpty()){
                    s.setName(student.getName());
                }
                if(student.getClassName() != null && !student.getClassName().isEmpty()){
                    s.setClassName(student.getClassName());
                }
                if(student.getSubject() != null && !student.getSubject().isEmpty()){
                    s.setSubject(student.getSubject());
                }
                saveToFile(students);
                return true;
            }
        }
        return false;
    }

    @Override
    public Student getStudentById(int id) {
        List<Student> students = readFromFile();
        for(Student s : students){
            if(s.getId() == id){
                return s;
            }
        }
        return null;
    }
    private void saveToFile(List<Student> students) {
        try{
            FileWriter fileWriter = new FileWriter(PATH);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Student student : students) {
                bufferedWriter.write(student.toString());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
