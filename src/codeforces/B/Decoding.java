package codeforces.B;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * a class to solve the problem {@link = https://codeforces.com/contest/746/problem/B}
 */
public class Decoding {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        bufferedReader.readLine();
        String s = bufferedReader.readLine();
        if (s.length() == 1 || s.length() == 2) {
            System.out.println(s);
            return;
        }
        ArrayList<Character> right = new ArrayList<>();
        ArrayList<Character> left = new ArrayList<>();

        for (int i = 0; i < s.toCharArray().length; i++) {
            if (i % 2 == 0) {
                right.add(s.charAt(i));
            } else {
                left.add(0, s.charAt(i));
            }
        }
        if (s.length() % 2 == 1) {
            left.forEach(System.out::print);
            right.forEach(System.out::print);
        } else {
            for (int i = right.size() - 1; i >= 0; i--) {
                System.out.print(right.get(i));
            }
            for (int i = left.size() - 1; i >= 0; i--) {
                System.out.print(left.get(i));
            }
        }
        System.out.println();
    }
}




