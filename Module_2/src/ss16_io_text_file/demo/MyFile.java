package ss16_io_text_file.demo;

import java.io.File;
import java.io.IOException;

public class MyFile {
    private static final String PATH = "ss16_io_text_file/demo/student.csv";

    public static void main(String[] args) {
        File file = new File(PATH, "student.csv");
        try{
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
