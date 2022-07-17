package problems;

public class NumberPattern {
    public static void main(String[] args) {
        pattern1("PROGRAM");
    }
    static void pattern1(String s){
        char[] chars = s.toCharArray();
        int n = chars.length;
        int m = n/2;
        for (int i=1; i<=n; i++){
            for (int j=1; j<=n; j++){
                if (i==j){
                    System.out.print(chars[j-1]);
                } else if (i+j-1==n) {
                    System.out.print(chars[j-1]);
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
