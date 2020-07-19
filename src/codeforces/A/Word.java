package codeforces.A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * a class to solve the problem {@link = http://codeforces.com/contest/59/problem/A}
 */

public class Word {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s = bufferedReader.readLine();
        StringBuilder stringBuilder = new StringBuilder();
        for (char c : s.toCharArray()) {
            stringBuilder.append(Character.isUpperCase(c) ? c : "");
        }
//        s.chars().forEach(value -> {
//            char c = (char) value;
//            stringBuilder.append(Character.isUpperCase(c) ? c : "");
//        });
        int lowerLength = s.length() - stringBuilder.length();
        if (stringBuilder.length() > lowerLength) {
            System.out.println(s.toUpperCase());
        } else {
            System.out.println(s.toLowerCase());
        }
    }
}
