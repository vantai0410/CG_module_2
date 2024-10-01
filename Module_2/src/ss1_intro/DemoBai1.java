package ss1_intro;

import java.util.Scanner;

public class DemoBai1 {
    // class body
    // pthuc main
    // khai báo: data_type varName
    // '' nháy đơn là kí tự,1 kí tự; "" nháy kép là string
    // next: kí tự đầu tiên k phải khoảng trắng và dừng lại khi gặp khoảng trắng
    // nextline : ng dùng nhập gì thì nhận hết
    // kh được nhập số trc nhập chuỗi
    //
    public static void main(String[] args) {
//        String name = "tài";
//        System.out.println("hi");
//        System.out.println(name);
//        Scanner sc = new Scanner(System.in);
//        System.out.print("nhap ten: ");
//        String name = sc.nextLine();
//        System.out.println(name);
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap tuoi: ");
        int age = Integer.parseInt(sc.nextLine());
        System.out.println("nhap ten: ");
        String name = sc.nextLine();
        System.out.println(age);
        System.out.println(name);
    }
}
