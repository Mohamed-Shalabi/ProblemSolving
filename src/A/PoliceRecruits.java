package A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * a class to solve the problem {@link = http://codeforces.com/contest/427/problem/A}
 */

public class PoliceRecruits {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        Scanner scanner = new Scanner(bufferedReader.readLine());
        int men = 0;
        int crimes = 0;
        for (int i = 0; i < n; i++) {
            int input = scanner.nextInt();
            if (input < 0) {
                if (men < 1) {
                    crimes += 0 - input;
                }
                men += input;
            } else {
                men += input;
            }
            if (men < 0) {
                men = 0;
            }
        }
        System.out.println(crimes);
    }
}
