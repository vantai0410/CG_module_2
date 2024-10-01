package ss11_stack_queue.convert;

import java.util.Scanner;
import java.util.Stack;

public class CovertDecimalToBinary {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter decimal number: ");
        int decimal = sc.nextInt();
        while(decimal != 0) {
            int binary = decimal % 2;
            stack.push(binary);
            decimal = decimal / 2;
        }
        System.out.println("Binary number: " );
        while(!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
    }
}
