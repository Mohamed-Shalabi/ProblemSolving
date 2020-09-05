package codeforces.B;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

/**
 * a class to solve the problem {@link = http://codeforces.com/contest/6/problem/B}
 */
public class PresidentsOffice {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer tokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
        int n = Integer.parseInt(tokenizer.nextToken());
        int m = Integer.parseInt(tokenizer.nextToken());
        char c = tokenizer.nextToken().charAt(0);

        ArrayList<Integer> i_s = new ArrayList<>();
        ArrayList<Integer> j_s = new ArrayList<>();
        char[][] matrix = new char[n][m];
        for (int i = 0; i < n; i++) {
            String s = bufferedReader.readLine().replace(" ", "");
            for (int j = 0; j < m; j++) {
                matrix[i][j] = s.charAt(j);
                if (c == matrix[i][j]) {
                    i_s.add(i);
                    j_s.add(j);
                }
            }
        }

        Set<Character> set = new HashSet<>();
        for (int index = 0; index < i_s.size(); index++) {

            int i = i_s.get(index);
            int j = j_s.get(index);
            try {
                set.add(matrix[i][j + 1]);
            } catch (ArrayIndexOutOfBoundsException ignored) {
            }
            try {
                set.add(matrix[i][j - 1]);
            } catch (ArrayIndexOutOfBoundsException ignored) {
            }
            try {
                set.add(matrix[i + 1][j]);
            } catch (ArrayIndexOutOfBoundsException ignored) {
            }
            try {
                set.add(matrix[i - 1][j]);
            } catch (ArrayIndexOutOfBoundsException ignored) {
            }

        }
        set.remove(c);
        set.remove('.');

        System.out.println(set.size());


    }
}
