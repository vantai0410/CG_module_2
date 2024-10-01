package ss4_oop.PhuongTrinhBac2;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        QuadraticEquation quadraticEquation = new QuadraticEquation(1,-3,2);
        System.out.println("nghiem 1: " + quadraticEquation.getRoot1());
        System.out.println("nghiem 2: " + quadraticEquation.getRoot2());
    }
}
