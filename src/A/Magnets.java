package A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * a class to solve the problem {@link = http://codeforces.com/contest/344/problem/A}
 */

public class Magnets {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        int out = 1;
        String last;
        String current = bufferedReader.readLine();
        for (int i = 0; i < n - 1; i++) {
            last = current;
            current = bufferedReader.readLine();
            if (!last.equals(current)) {
                out++;
            }
        }
        System.out.println(out);
    }
}
