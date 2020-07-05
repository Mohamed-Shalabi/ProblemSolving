package A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * a class to solve the problem {@link = http://codeforces.com/contest/732/problem/A}
 */

public class BuyShovel {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] strings = bufferedReader.readLine().split(" ");
        int k = Integer.parseInt(strings[0]);
        int r = Integer.parseInt(strings[1]);
        int num = 0;
        int price = k;
        while ((price - r) % 10 != 0 && price % 10 != 0) {
            num++;
            price = k * num;
        }
        if (num == 0) {
            num = 1;
        }
        System.out.println(num);
    }
}
