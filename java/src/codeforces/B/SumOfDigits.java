package codeforces.B;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String n = scan.nextLine();
        int result = 0;
        if (n.length() > 1) {
            int[] array = new int[n.length()];
            for (int i = 0; i < n.length(); i++) {
                array[i] = n.charAt(i) - '0';
            }
            int sum = 0;
            boolean b = false;
            do {
                if (b) {
                    String temp = Integer.toString(sum);
                    array = new int[temp.length()];
                    for (int i = 0; i < temp.length(); i++) {
                        array[i] = temp.charAt(i) - '0';
                    }
                }
                sum = 0;
                for (int j = 0; j < array.length; j++)
                    sum += array[j];
                b = true;
                result++;
            } while (sum > 9);
        }
        System.out.println(result);
    }
}
