package ss2_loop_array.thuc_hanh;

import java.util.Scanner;

public class gtln {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        int[] arr = new int[20];
        do {
            System.out.print("Enter the size of the array: ");
            size = sc.nextInt();
            if(size>20){
                System.out.println("enter again");
            }
        } while (size>20);
        for (int i = 0; i < size; i++) {
            System.out.println("nhap phan tu thu " + (i+1));
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        for (int i = 0; i < size; i++) {
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("gia tri lon nhat tropng mang la: " + max);
    }
}

