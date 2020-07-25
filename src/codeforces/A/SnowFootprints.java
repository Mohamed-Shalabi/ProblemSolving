package codeforces.A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * a class to solve the problem {@link = http://codeforces.com/contest/298/problem/A}
 */
public class SnowFootprints {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        bufferedReader.readLine();
        char[] chars = bufferedReader.readLine().toCharArray();
        int start = 0;
        int end = 0;
        int i = 0;
        while (chars[i] == '.') {
            if (chars[i + 1] == 'R') {
                start = i + 2;
                int j = i + 1;
                while (chars[j] == 'R') {
                    if (chars[j + 1] == 'L') {
                        end = j + 1;
                        break;
                    } else if (chars[j + 1] == '.') {
                        end = j + 2;
                        break;
                    }
                    j++;
                }
                break;
            }
            i++;
        }
        if (start != 0 && end != 0) {
            System.out.println(start + " " + end);
            return;
        }

        i = chars.length - 1;
        while (chars[i] == '.') {
            if (chars[i - 1] == 'L') {
                start = i;
                int j = i - 1;
                while (chars[j] == 'L') {
                    if (chars[j - 1] == 'R') {
                        end = j;
                        break;
                    } else if (chars[j - 1] == '.') {
                        end = j;
                        break;
                    }
                    j--;
                }
                break;
            }
            i--;
        }
        System.out.println(start + " " + end);
    }
}
