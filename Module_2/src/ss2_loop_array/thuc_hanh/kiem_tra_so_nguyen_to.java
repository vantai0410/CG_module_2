package ss2_loop_array.thuc_hanh;

import java.util.Scanner;

public class kiem_tra_so_nguyen_to {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so nguyen: ");
        int n = sc.nextInt();

        if (n < 2) {
            System.out.println("Khong phai la so nguyen to");
        } else {
            boolean check = true;
            // Dùng Math.sqrt để lấy căn bậc hai của n và ép kiểu về int
            for (int i = 2; i <= (int) Math.sqrt(n); i++) {
                if (n % i == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                System.out.println(n + " la so nguyen to");
            } else {
                System.out.println(n + " khong phai la so nguyen to");
            }
        }
    }
}

