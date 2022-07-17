package problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class AlternateSorting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long[] arr = new long[n];
        for (int i=0; i<n; i++){
            arr[i]=scanner.nextInt();
        }
        List<Long> output = new ArrayList<>();
        Arrays.sort(arr);
        int i=0, j= arr.length-1;
        while (i<j){
            System.out.print(arr[j--]+" ");
            System.out.print(arr[i++]+" ");
        }
        if (n%2!=0){
            System.out.print(arr[i]);
        }
    }

}
