package ss2_loop_array.thuc_hanh;

import java.util.Scanner;

public class tinh_tien_lai_cho_vay {
    public static void main(String[] args) {
        double money ;
        int month ;
        double interestRate ;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so tien vay:");
        money = sc.nextDouble();
        System.out.println("Nhap so thang vay");
        month = sc.nextInt();
        System.out.println("Nhap lai suat");
        interestRate = sc.nextDouble();

         double   totalInterest = money * (interestRate/100)/12 * month;
        System.out.println("Total of interest: " + totalInterest);
    }
}
