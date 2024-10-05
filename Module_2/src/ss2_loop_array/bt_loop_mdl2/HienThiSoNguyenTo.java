package ss2_loop_array.bt_loop_mdl2;

import java.util.Scanner;

public class HienThiSoNguyenTo {

    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 20;
        int count = 0;
        int N = 2;
        while (count < num) {
            if (isPrime(N)) {
                System.out.println(N);
                count++;
            }
            N++;
        }
    }
}
