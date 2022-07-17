package problems.strings;

import javax.swing.*;

public class RemoveDuplicateString {
    public static void main(String[] args) {
        String input = "abcc";
        StringBuilder stringBuffer = new StringBuilder(input);
        String output = "";
        for (int i = 0; i < input.length()-1; i++) {
            if (input.charAt(i) == input.charAt(i+1)){
                stringBuffer.deleteCharAt(i);
                stringBuffer.deleteCharAt(i+1);
                i=0;
                input = stringBuffer.toString();
            }
        }
        System.out.println(input);
    }
}
