package problems;

import java.util.Scanner;

public class MultipleAndChangeValue {
    public static void main(String[] args) {
        int n = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements you want to enter : ");
        n = scanner.nextInt();
        int[] input = new int[20];
        int[] output = new int[20];
        for (int i=0; i< n; i++){
            System.out.println("Enter "+ i + " element : ");
            input[i] = scanner.nextInt();
        }
        for (int i=0; i< n; i++){
            if (input[i]%3==0){
                System.out.println("usd");
            } else if (input[i]%5==0) {
                System.out.println("device");
            } else if (input[i]%3==0 && input[i]%5==0) {
                System.out.println("usddevice");
            }else {
                System.out.println(input[i]);
            }
        }

    }
}
