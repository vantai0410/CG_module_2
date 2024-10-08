package ss11_stack_queue.check_palindrome;

import java.util.LinkedList;
import java.util.Queue;

public class CheckPalindromeUsingQueue {
    public static void main(String[] args) {
            String palindrome = "able was I ere I saw elba";

            Queue<Character> queue = new LinkedList<>();

            for (int i =  palindrome.length() - 1; i >= 0; i--){
                queue.add(palindrome.charAt(i));
            }
            String reverseString = "";
            while (!queue.isEmpty()){
                reverseString = reverseString + queue.remove();
            }
            System.out.println(reverseString);

            if (palindrome.equals(reverseString)){
                System.out.println("The String is a palindrome");
            }else {
                System.out.println("The String is not a palindrome");
            }
        }
    }

