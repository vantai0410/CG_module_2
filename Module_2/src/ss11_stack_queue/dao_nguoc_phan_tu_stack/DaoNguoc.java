package ss11_stack_queue.dao_nguoc_phan_tu_stack;

import java.util.Stack;

public class DaoNguoc {
    public static void reverseArray(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            stack.push(arr[i]);
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = stack.pop();
        }
    }
    public static String reverseString(String str) {
        Stack<String> wStack = new Stack<>();
        String[] words = str.split(" ");
        for(String word : words) {
            wStack.push(word);
        }
        StringBuilder sb = new StringBuilder();
        while(!wStack.isEmpty()) {
            sb.append(wStack.pop());
            if (!wStack.isEmpty()) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {
    int[] array = {1,2,3,4,5};
    String str = "this is an example";
    System.out.println(reverseString(str));
        System.out.println("Mang ban dau");
        for(int num : array) {
            System.out.println(num);
        }
        reverseArray(array);
        System.out.println("mang sau khi dao");
        for(int num : array) {
            System.out.println(num);
        }
    }
}
