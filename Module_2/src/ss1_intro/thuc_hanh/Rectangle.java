package ss1_intro.thuc_hanh;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        float width,height;
        Scanner sc = new Scanner(System.in);
        width=sc.nextFloat();
        height=sc.nextFloat();

        float area=width*height;
        System.out.println("Area is "+area);
    }
}
