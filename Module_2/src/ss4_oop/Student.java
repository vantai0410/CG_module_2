package ss4_oop;

import java.time.LocalDate;

// tên : string
// ngày sinh: local date
// email:string
// điểm: double
public class   Student {
    public String name;
    public LocalDate date;
    public String email;
    public double point;

    // tên constructor phải trùng vói tên class, kh khai báo kiểu dữ liệu trả về, trong java ko quy định số lượng constructor
    //constructor có thể os nhieefu nhưng phaải khác nhau tham số truyền vào (khác về số lượng hoặc khác về kiểu dữ liệu )
    // ko khái báo constructor nào thì sẽ mặc định constructor ko tham số

    public Student(String name, LocalDate date, String email, double point){
        this.name = name;
        this.date = date;
        this.email = email;
        this.point = point;
    }
    // chỉ khai báo


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", date=" + date +
                ", email='" + email + '\'' +
                ", point=" + point +
                '}';
    }
}
