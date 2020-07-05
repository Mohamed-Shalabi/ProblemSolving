package A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * a class to solve the problem {@link = http://codeforces.com/contest/734/problem/A}
 */

public class AntonAndDanik {
    public static void main(String[] args) throws IOException {
        BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));
        int A = 0;
        int D = 0;
        String s = scanner.readLine();
        int size = Integer.parseInt(s);
        String games = scanner.readLine();
        for (int i = 0; i < size; i++) {
            switch (games.charAt(i)) {
                case 'A':
                    A++;
                    break;
                case 'D':
                    D++;
                    break;
            }
        }
        if (A == D) {
            System.out.println("Friendship");
        } else if (A > D) {
            System.out.println("Anton");
        } else {
            System.out.println("Danik");
        }
    }
}
