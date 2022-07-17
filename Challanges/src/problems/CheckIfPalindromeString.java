package problems;

import java.util.Scanner;

public class CheckIfPalindromeString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
//        String word = scanner.nextLine();
//        if (isPalindrome(word)){
//            System.out.println("String is palindrome");
//        }else {
//        System.out.println("String is not palindrome");
//        }
        if (isPalindrome(number)){
            System.out.println("String is palindrome");
        }else {
        System.out.println("String is not palindrome");
        }

    }

    public static boolean isPalindrome(String word){
        int left = 0, right = word.length()-1;
        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static boolean isPalindrome(int number){
        int remainder, sum=0, temp;
        temp = number;
        while (number > 0){
            remainder = number % 10;
            sum = (sum*10) + remainder;
            number = number / 10;
        }
        return temp == sum;
    }
}
