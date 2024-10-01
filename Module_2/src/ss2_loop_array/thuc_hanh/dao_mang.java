package ss2_loop_array.thuc_hanh;

import java.util.Scanner;

public class dao_mang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        int[] arr = new int[20];
        do {
            System.out.println("Enter the size of the array: ");
            size = sc.nextInt();
            if (size > 20 || size <= 0) {
                System.out.println("ko hop le, nhap lai");
            }
        } while (size > 20 || size <= 0);
        for (int i = 0; i < size; i++) {
            System.out.println("nhap phan tu thu " + (i+1));
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < size/2; i++) {
            int temp = arr[i];
            arr[i] = arr[size-i-1];
            arr[size-i-1] = temp;
        }
        System.out.println("mang sau khi dao nguọc: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}
