package problems.strings;

public class LongestPalindrome {
    public static void main(String[] args) {
        String input = "aaaabbaa";

    }
    public static String palindrome(String input){
        char[] inputArray = input.toCharArray();
        String output = "";
        for (int i = 0; i < inputArray.length; i++) {
            String forwardOutput = "";
            forwardOutput += String.valueOf(inputArray[i]);
            String reverseForwardOutput = "";
            for (int j = forwardOutput.length(); j >=0; j++) {
                reverseForwardOutput += forwardOutput.charAt(j);
            }
//            if ()
        }
        return "k";
    }
}
