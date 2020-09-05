package codeforces.A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

/**
 * a class to solve the problem {@link = http://codeforces.com/contest/443/problem/A}
 */

public class AntonAndLetters {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        char[] chars = bufferedReader.readLine()
                .replaceAll(" ", "")
                .replaceAll(",", "")
                .replaceAll("\\{", "")
                .replaceAll("}", "")
                .toCharArray();
        Set<Character> characters = new HashSet<>();
        for (char c : chars) {
            characters.add(c);
        }
        System.out.println(characters.size());
    }
}
