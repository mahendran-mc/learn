package Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class BigAndSmallNumbers {
//    Alternate sorting: Given an array of integers, rearrange the array in such a way
//    that the first element is first maximum and second element is first minimum.
//    Eg.) Input  : {1, 2, 3, 4, 5, 6, 7}
//    Output : {7, 1, 6, 2, 5, 3, 4}
    public static void main(String[] args) {
        int n = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements you want to store: ");
        n = scanner.nextInt();
        int[] input = new int[10];
        int[] output = new int[10];
        for (int i=0; i< n; i++){
            System.out.println("Enter "+ i + " element");
            input[i] = scanner.nextInt();
        }
        for (int i=0; i< n; i++){
            System.out.println(input[i]);
        }
//        for (int i=n-1; i<n/2; i--){
//            for (int j=0; j<n; j+=2){
//                output[j] = input[i];
//                output[j+1] = input[j];
//            }
//        }
//        for (int i=0; i< n; i++){
//            System.out.println(output[i]);
//        }

    }
}
