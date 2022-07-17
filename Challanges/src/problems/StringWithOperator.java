package problems;

import java.util.Scanner;

public class StringWithOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        char[] inputChars = input.toCharArray();
        int m = inputChars.length / 2;
        int sum = inputChars[0];
        for (int i=0; i<=m; i++){
            for (int j=m+1; j<=inputChars.length; j++){
//                inputChars[j] == "+" ?
//                sum = sum
                System.out.println(inputChars[j]);
            }
        }
    }
}
