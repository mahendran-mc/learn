package problems.strings;

public class CheckVowel {
    public static void main(String[] args) {
        String input = "ma hi";
//        System.out.println(isVowelContain(input));
        System.out.println(removeWhiteSpaces(input));
    }

    public static boolean isVowelContain(String input){
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i)=='a' || input.charAt(i)== 'e' || input.charAt(i)=='i' ||
                    input.charAt(i)=='o' || input.charAt(i)=='u'){
                return true;
            }
        }
        return false;
    }

    public static String removeWhiteSpaces(String input){
        String output = "";
        for (int i=0; i<input.length(); i++){
            if (input.charAt(i) != ' '){
                output = output + input.charAt(i);
            }
        }
        return output;
    }
}
