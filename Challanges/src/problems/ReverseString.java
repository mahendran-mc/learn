package problems;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] inputArray = input.split("\\.");
        for (int i= inputArray.length-1; i>=0; i--) {
            System.out.print(inputArray[i]+".");
        }
//        int i;
//        String output = "";
//        for (i=input.length()-1; i>=0; i--){
//            output = output+input.charAt(i);
//        }
//        System.out.println(output);
//        char[] inputArray = input.toCharArray();
//        String output;
//        for (i=0; i < input.length()/2; i++){
//            for (j=input.length()-1; j > i; j--){
//                inputArray[i] = inputArray[j];
//                inputArray[j] = inputArray[i];
//            }
//        }
//        output = new String(inputArray);
//        System.out.println(output);
    }
}
