package codeforces.B;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * a class to solve the problem {@link = https://codeforces.com/contest/66/problem/B}
 */
public class PetyaAndCountryside {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        bufferedReader.readLine();
        int[] ints = Arrays.stream(bufferedReader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        if (ints.length == 1) {
            System.out.println(1);
            return;
        }
        ArrayList<Integer> summits = new ArrayList<>();
        for (int i = 1; i < ints.length; i++) {
            int current = ints[i];
            int left = ints[i - 1];
            if (current >= left) {
                int j = i;
                while (j < ints.length - 1 && current <= ints[j + 1]) {
                    j++;
                    current = ints[j];
                    i = j;
                }
                summits.add(j);
            } else if (i == 1) {
                summits.add(0);
            }
        }
        AtomicInteger integer = new AtomicInteger(0);
        summits.forEach(summit -> {
            int num = 1;
            if (summit < ints.length - 1) {
                int index = summit + 1;
                int current = ints[summit];
                int right = ints[summit + 1];
                while (right <= current && index < ints.length) {
                    num++;
                    index++;
                    try {
                        right = ints[index];
                        current = ints[index - 1];
                    } catch (ArrayIndexOutOfBoundsException e) {
                        break;
                    }
                }
            }
            if (summit > 0) {
                int index = summit - 1;
                int current = ints[summit];
                int left = ints[summit - 1];
                while (left <= current) {
                    index--;
                    num++;
                    try {
                        left = ints[index];
                        current = ints[index + 1];
                    } catch (ArrayIndexOutOfBoundsException e) {
                        break;
                    }
                }
            }
            if (num > integer.get()) {
                integer.set(num);
            }

        });

        System.out.println(integer.get());
    }
}
