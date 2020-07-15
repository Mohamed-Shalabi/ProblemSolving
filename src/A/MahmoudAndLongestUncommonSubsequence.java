package A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * a class to solve the problem {@link = http://codeforces.com/contest/766/problem/A}
 */
public class MahmoudAndLongestUncommonSubsequence {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String a = bufferedReader.readLine();
        String b = bufferedReader.readLine();
        int n = Math.max(a.length(), b.length());
        if (b.length() == 0) {
            System.out.println(a.length());
            return;
        }
        if (a.length() != b.length()) {
            System.out.println(n);
            return;
        }
        for (int i = 0; i < n; i++) {
            if (a.charAt(i) != b.charAt(i)) {
                System.out.println(a.length());
                return;
            }
        }
        System.out.println(-1);
//        for (int i = n; i > -1; i--) {
//            for (int j = 0; j < i; j++) {
//                String sub = a.substring(j, i);
//                if (!b.contains(sub)) {
//                    if (sub.length() > length) {
//                        length = sub.length();
//                        break;
//                    }
//                }
//            }
//        }
//        System.out.println(length);
    }
}
