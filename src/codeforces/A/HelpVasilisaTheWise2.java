package codeforces.A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * a class to solve the problem {@link = http://codeforces.com/contest/143/problem/A}
 */
public class HelpVasilisaTheWise2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> integers = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            Arrays.stream(bufferedReader.readLine().split(" ")).forEach(s -> {
                integers.add(Integer.valueOf(s));
            });
        }
        if (integers.contains(1) || integers.contains(18) || integers.contains(19) || integers.contains(20)) {
            System.out.println(-1);
            return;
        }
        int[] output = new int[4];
        int r1 = integers.get(0);
        int r2 = integers.get(1);
        int c1 = integers.get(2);
        int c2 = integers.get(3);
        int d1 = integers.get(4);
        int d2 = integers.get(5);
        int counter = 0;
        int start;
        if (r1 > 10) {
            start = r1 - 10;
        } else {
            start = 0;
        }
        for (int i = 0; i < integers.get(0); i++) {
            counter++;
            output[0] = start + counter;
            output[1] = r1 - output[0];
            output[2] = c1 - output[0];
            output[3] = r2 - output[2];
            int
                    n1 = output[0],
                    n2 = output[1],
                    n3 = output[2],
                    n4 = output[3];

            if (
                    n1 == n2 ||
                            n1 == n3 ||
                            n1 == n4 ||
                            n2 == n3 ||
                            n2 == n4 ||
                            n3 == n4 ||
                            n1 < 1 ||
                            n2 < 1 ||
                            n3 < 1 ||
                            n4 < 1 ||
                            n1 > 9 ||
                            n2 > 9 ||
                            n3 > 9 ||
                            n4 > 9
            ) {
                continue;
            }

            if (
                    n1 + n2 == r1 &&
                            n1 + n3 == c1 &&
                            n1 + n4 == d1 &&
                            n2 + n4 == c2 &&
                            n2 + n3 == d2 &&
                            n3 + n4 == r2
            ) {
                System.out.println(output[0] + " " + output[1] + "\n" + output[2] + " " + output[3]);
                return;
            }
        }
        System.out.println(-1);
    }
}
