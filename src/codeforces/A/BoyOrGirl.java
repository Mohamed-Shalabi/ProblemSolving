package codeforces.A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

/**
 * a class to solve the problem {@link = http://codeforces.com/contest/236/problem/A}
 */

public class BoyOrGirl {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();
        Set<Character> set = new HashSet<>();

        String str = bufferedReader.readLine();

        for (int i = 0; i < str.length(); i++) {
            set.add(str.charAt(i));
        }

        for (Character c : set) {
            sb.append(c);
        }

        if (sb.toString().length() % 2 == 1) {
            System.out.println("IGNORE HIM!");
        } else {
            System.out.println("CHAT WITH HER!");
        }
    }
}
