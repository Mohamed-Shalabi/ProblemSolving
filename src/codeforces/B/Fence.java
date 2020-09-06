package codeforces.B;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * not my answer.
 */
public class Fence {

    static BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int k = s.nextInt();
        int[] arr = new int[n];
        int[] com = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        com[0] = arr[0];
        for (int i = 1; i < n; i++) {
            com[i] = arr[i] + com[i - 1];
        }
        int d = 1, min = com[k - 1];
        for (int i = 1; i + k - 1 < n; i++) {
            int r = i + k - 1;
            int i1 = com[r] - com[i - 1];
            if (i1 < min) {
                min = i1;
                d = i + 1;
            }
        }
        System.out.println(d);

    }


}
