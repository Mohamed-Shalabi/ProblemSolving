package codeforces.A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * a class to solve the problem {@link = http://codeforces.com/contest/799/problem/A}
 */
public class CarrotCakes {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] strings = bufferedReader.readLine().split(" ");
        double n = Double.parseDouble(strings[0]),
                t = Double.parseDouble(strings[1]),
                k = Double.parseDouble(strings[2]),
                d = Double.parseDouble(strings[3]);
        double test = t * Math.ceil(n / k);
        if (test <= d) {
            System.out.println("NO");
            return;
        }
        double t1;
        if (t <= d) {
            t1 = d - d % t;
        } else /*if (t > d)*/ {
            if (n > k) {
                System.out.println("YES");
                return;
            } else {
                System.out.println("NO");
                return;
            }
            //t1 = t;
        }
        double m = Math.ceil(n - k / t * t1);
        if (m > k) {
            System.out.println("YES");
        } else if (m == k) {
            if (t1 < d || t1 == d) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        } else {
            System.out.println("NO");
        }
    }
}
