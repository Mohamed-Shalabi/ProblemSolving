package codeforces.A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;
/**
 * a class to solve the problem {@link = http://codeforces.com/contest/770/problem/A}
 */
public class NewPassword {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
        int n = Integer.parseInt(tokenizer.nextToken());
        int k = Integer.parseInt(tokenizer.nextToken());
        ArrayList<Character> characters = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            //(i < 97 + 26) ? ((char) i) : (char) ((i - 97) % 26);
            characters.add((char) (i % k + 97));
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (char c : characters) {
            stringBuilder.append(c);
        }
        System.out.println(stringBuilder.toString());
    }
}
