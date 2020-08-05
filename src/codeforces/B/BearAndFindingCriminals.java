package codeforces.B;

import java.util.Scanner;

/**
 * a class to solve the problem {@link = https://codeforces.com/contest/680/problem/B}
 */
public class BearAndFindingCriminals {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int a = scan.nextInt();

        int[] crims = new int[n];

        for (int i = 0; i < n; i++)
            crims[i] = scan.nextInt();

        int all = 0;

        for (int i = 0; i < n; i++) {
            if (a - 1 == i && crims[i] == 1) {
                all++;
            } else if (a - 1 > i && crims.length > 2 * a - 2 - i && crims[i] == crims[2 * a - 2 - i] && crims[i] == 1) {
                all++;
                all++;
            } else if (a - 1 > i && crims.length <= 2 * a - 2 - i && crims[i] == 1) {
                all++;
            } else if (i > 2 * a - 2 && crims[i] == 1) {
                all++;
            }
        }
        System.out.println(all);
    }
}
