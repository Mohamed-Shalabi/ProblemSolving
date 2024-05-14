package codeforces.A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * a class to solve the problem {@link = http://codeforces.com/contest/228/problem/A}
 */
public class IsYourHorseshoeOnTheOtherHoof {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        bufferedReader.readLine();
        String[] shoes = bufferedReader.readLine().split(" ");
        Arrays.parallelSort(shoes);
        int neededShoes = 0;
        for (int i = 0; i < shoes.length - 1; i++) {
            if (shoes[i].equals(shoes[i + 1])) {
                neededShoes++;
            }
        }
        System.out.println(neededShoes);
    }
}
