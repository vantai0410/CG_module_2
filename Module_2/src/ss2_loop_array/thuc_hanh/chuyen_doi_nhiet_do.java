package ss2_loop_array.thuc_hanh;

import java.util.Scanner;

public class chuyen_doi_nhiet_do {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double doC;
        double doF;
        int choice;
        do {
            System.out.println("Menu.");
            System.out.println("1. Celsius to Fahrenheit");
            System.out.println("2. Fahrenheit to Celsius");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1: {
                    System.out.println("nhap do C ");
                    doC = sc.nextDouble();
                    System.out.println("Chuyen qua do F la: " + doCtoF(doC));
                }
                case 2: {
                    System.out.println("nhap do F ");
                    doF = sc.nextDouble();
                    System.out.println("Chuyen qua C la: " + doFtoC(doF));
                }
                case 0:
                    System.exit(0);
            }
        } while (choice != 0);
    }
    public static double doCtoF(double doC) {
        double doF = (9.0 / 5) * doC + 32;
        return doF;
    }
    public static double doFtoC(double doF) {
        double doC = (5.0 / 9) * (doF - 32);
        return doC;
    }
}
