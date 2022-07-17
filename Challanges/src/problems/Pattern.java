package problems;

import java.util.ArrayList;

public class Pattern {
    public static void main(String[] args) {
      //  pattern2(5);
//        pattern4(5);
//        pattern5(5);
        int[] arr = {1,2,3,4,5};
        System.out.println(subarraySum(arr, 5, 7));
    }

    static ArrayList<Integer> subarraySum(int[] arr, int n, int s)
    {
        // Your code here
        ArrayList<Integer> output = new ArrayList<Integer>();
        for(int i=0; i<n; i++){
            int sum=arr[i];
            for(int j=i+1; j<n; j++){
                sum += arr[j];
                if(sum==s){
                    output.add(i+1);
                    output.add(j+1);
                    return output;
                }
                if(sum>s){
                    break;
                }
            }
        }
        return output;
    }

    static void pattern56(int n){
        for (int row=1; row<=n; row++){
            for (int s=1; s<=n-row; s++){
                System.out.println(" ");
            }
            ArrayList<Integer> sum = new ArrayList<>();
            sum.add(2);
            int colValue = 0;
//            for (int col=1; col<)
        }
    }
    static void pattern5(int n){
        for(int row=1; row<=n; row++){
            for (int s=1; s<=n-row; s++){
                System.out.print(" ");
            }
            for(int col=1; col<=row; col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern4(int n){
        for(int row=1; row<=n; row++){
            for (int s=1; s<=n-row; s++){
                System.out.print(" ");
            }
            for(int col=1; col<=row; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern3(int n){
        int m=n/2;
        for(int row=1; row<=n; row++){
            for(int col=1; col<=row; col++){
                if (col<=m+1) {
                    System.out.print("* ");
                }

            }
            System.out.println();
        }
    }
    static void pattern2(int n){
        for(int row=1; row<=n; row++){
            for(int col=1; col<=n-row+1; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static void pattern1(int n){
        for(int row=1; row<=n; row++){
            for(int col=1; col<=row; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
