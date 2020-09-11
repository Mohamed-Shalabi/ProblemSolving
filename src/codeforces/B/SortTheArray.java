package codeforces.B;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * a class to solve the problem {@link = http://codeforces.com/contest/451/problem/B}
 */
public class SortTheArray {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        int[] a1 = Arrays.stream(bufferedReader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] a2 = Arrays.copyOf(a1, n);
        Arrays.sort(a2);

        if (
                a1[0] != a2[0] &&
                        a1[n - 1] != a2[n - 1] &&
                        a1[0] != a2[n - 1] &&
                        a1[n - 1] != a2[0]
        ) {
            System.out.println("no");
            return;
        }

        if (Arrays.equals(a1, a2)) {
            System.out.println("yes");
            System.out.println("1 1");
            return;
        }

        boolean changed = false;
        int start = -1;
        int end = -1;

        int lastCheckedElement = -1;

        for (int i = 0; i < a1.length; i++) {
            int n1 = a1[i];
            int n2 = a2[i];

            if (!changed) {
                if (n1 != n2) {
                    if (i > 0 && n1 < a1[i - 1]) {
                        System.out.println("no");
                        return;
                    }
                    changed = true;
                    start = i;
                    end = i;
                    lastCheckedElement = i;
                }
            } else {
                if (n1 == n2 || i == n - 1) {
                    if (checkTheRemaining(a1, a2, i)) {
                        if (n1 == n2) {
                            end = i;
                        } else {
                            if (n1 != a2[start]) {
                                System.out.println("no");
                                return;
                            }
                            end = i + 1;
                        }
                        System.out.println("yes");
                        System.out.println((start + 1) + " " + (end));
                    } else {
                        if (2 * i - start < n && a1[start] == a2[2 * i - start]) {
                            continue;
                        }
                        System.out.println("no");
                    }
                    return;
                } else {
                    if (n1 > a1[lastCheckedElement]) {
                        System.out.println("no");
                        return;
                    }
                    lastCheckedElement = i;
                }
            }
        }
        System.out.println("no");

    }

    private static boolean checkTheRemaining(int[] a1, int[] a2, int i) {
        if (i == a1.length - 1) {
            return true;
        }
        for (int i1 = i; i1 < a1.length; i1++) {
            int n1 = a1[i1];
            int n2 = a2[i1];
            if (n1 != n2) {
                return false;
            }
        }
        return true;
    }
}
