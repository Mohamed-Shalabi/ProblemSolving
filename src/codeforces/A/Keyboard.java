package codeforces.A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * a class to solve the problem {@link = http://codeforces.com/contest/474/problem/A}
 */

public class Keyboard {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        char[][] keyboard = {
                "qwertyuiop".toCharArray(),
                "asdfghjkl;".toCharArray(),
                "zxcvbnm,./".toCharArray()
        };
        StringBuilder word = new StringBuilder();
        boolean rightShift = bufferedReader.readLine().equals("R");
        String input = bufferedReader.readLine();
        for (char c : input.toCharArray()) {
            if (rightShift) {
                int correct = findCharIndex(keyboard, c) - 1;
                char c1 = keyboard[(int) Math.ceil(correct / 10)][correct % 10];
                word.append(c1);
            } else {
                int correct = findCharIndex(keyboard, c) + 1;
                char c1 = keyboard[(int) Math.ceil(correct / 10)][correct % 10];
                word.append(c1);
            }
        }
        System.out.println(word);
    }

    private static int findCharIndex(char[][] keyboard, char c) {
        for (int i = 0; i < keyboard.length * keyboard[0].length; i++) {
            char c1 = keyboard[(int) Math.ceil(i / 10)][i % 10];
            if (c1 == c) {
                return i;
            }
        }
        return 0;
    }
}
