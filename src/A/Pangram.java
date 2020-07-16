package A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

/**
 * a class to solve the problem {@link = http://codeforces.com/contest/520/problem/A}
 */
public class Pangram {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        if (n < 26) {
            System.out.println("NO");
            return;
        }
        Set<Character> characters = new HashSet<>();
        char[] chars = bufferedReader.readLine().toLowerCase().toCharArray();
        for (char c : chars) {
            characters.add(c);
        }
        System.out.println(characters.size() >= 26 ? "YES" : "NO");
    }
}
