package codeforces.A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * a class to solve the problem {@link = https://codeforces.com/contest/382/problem/A}
 */
public class KseniaandPanScales {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s = bufferedReader.readLine();
        StringTokenizer tokenizer = new StringTokenizer(s, "|");
        String s1;
        try {
            if (s.charAt(0) == '|')
                s1 = "";
            else
                s1 = tokenizer.nextToken();
        } catch (Exception e) {
            s1 = "";
        }
        String s2;
        try {
            s2 = tokenizer.nextToken();
        } catch (Exception e) {
            s2 = "";
        }
        String s3 = bufferedReader.readLine();
        boolean switcher = false;
        if (s1.length() < s2.length()) {
            String temp = s1;
            s1 = s2;
            s2 = temp;
            switcher = true;
        }
        int difference = s1.length() - s2.length();
        try {
            s2 += s3.substring(0, difference);
            s3 = s3.substring(difference);
            if (s3.length() % 2 == 1) {
                System.out.println("Impossible");
                return;
            }
            if (s3.length() == 0) {
                System.out.println(switcher ? s2 + "|" + s1 : s1 + "|" + s2);
                return;
            }

            s2 += s3.substring(0, s3.length() / 2);
            s1 += s3.substring(s3.length() / 2);
            System.out.println(switcher ? s2 + "|" + s1 : s1 + "|" + s2);

        } catch (Exception e) {
            System.out.println("Impossible");
        }

    }
}
