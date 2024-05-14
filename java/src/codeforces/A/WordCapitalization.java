package codeforces.A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * a class to solve the problem {@link = http://codeforces.com/contest/281/problem/A}
 */

public class WordCapitalization {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s = bufferedReader.readLine();

//        char c = s.charAt(0);
//        if (Character.isLowerCase(c)) {
//            s = s.replaceFirst(String.valueOf(c), String.valueOf(Character.toUpperCase(c)));
//        }
//
        System.out.println(s.substring(0, 1).toUpperCase() + s.substring(1));

    }
}
