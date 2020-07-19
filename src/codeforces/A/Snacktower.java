package codeforces.A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * a class to solve the problem {@link = http://codeforces.com/problemset/problem/767/A}
 */
public class Snacktower {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        int max = n;
        ArrayList<Integer> list = new ArrayList<>();
        Arrays.stream(bufferedReader.readLine().split(" ")).forEach(s -> list.add(Integer.valueOf(s)));
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            set.add(list.get(i));
            if (max == list.get(i)) {
                while (set.remove(max)) {
                    System.out.print(max + " ");
                    max--;
                }
            }
            if (i != n - 1) {
                System.out.println();
            }
        }
    }
}
