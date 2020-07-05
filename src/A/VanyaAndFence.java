package A;

import java.util.Scanner;

/**
 * a class to solve the problem {@link = http://codeforces.com/contest/677/problem/A}
 */

public class VanyaAndFence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int h = scanner.nextInt();
        int w = 0;
        for (int i = 1; i <= n; i++) {
            if (scanner.nextInt() > h) {
                w += 2;
            } else {
                w += 1;
            }
        }
        System.out.println(w);


    }
}
