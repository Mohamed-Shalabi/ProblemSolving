package codeforces.A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * a class to solve the problem {@link = http://codeforces.com/contest/381/problem/A}
 */

public class SerejaAndDima {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        bufferedReader.readLine();
        String[] strings = bufferedReader.readLine().split(" ");
        int sereja = 0;
        int dima = 0;
        boolean player = true;
        int leftMost = 0;
        int rightMost = 0;
        int c1 = strings.length;
        int c2 = 0;
        while (true) {
            String s = strings[c2];
            leftMost = Integer.parseInt(s);
            rightMost = Integer.parseInt(strings[c1 - 1]);
            int addedValue = Math.max(leftMost, rightMost);
            if (player) {
                sereja += addedValue;
            } else {
                dima += addedValue;
            }
            player = !player;
            if (rightMost > leftMost) {
                c1 -= 1;
            } else {
                c2 += 1;
            }
            if (c1 <= c2) {
                break;
            }
        }
        System.out.println(sereja + " " + dima);

    }
}
