package problems;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StringCharOrderOccurrence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Map<Character, Integer> output = new HashMap<>();
        for (int i=0; i<input.length(); i++){
            if (output.containsKey(input.charAt(i))){
                output.put(input.charAt(i), output.get(input.charAt(i))+1);
            }else {
                output.put(input.charAt(i), 1);
            }
        }
        // for output
        for (int i=0; i < input.length(); i++){
            if (output.get(input.charAt(i)) != 0){
                System.out.print(input.charAt(i));
                System.out.print(output.get(input.charAt(i)) + " ");
                output.put(input.charAt(i), 0);
            }
        }
    }
}
