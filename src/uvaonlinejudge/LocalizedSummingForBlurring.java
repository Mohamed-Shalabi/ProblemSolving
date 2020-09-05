package uvaonlinejudge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class LocalizedSummingForBlurring {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        while (bufferedReader.ready()) {

            StringTokenizer tokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
            int n = Integer.parseInt(tokenizer.nextToken());
            int m = Integer.parseInt(tokenizer.nextToken());
            int o = n - m + 1;

            long sum = 0L;

            int[][] matrix = new int[n][n];
            int[][] output = new int[o][o];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    int num = Integer.parseInt(bufferedReader.readLine());
                    matrix[i][j] = num;
                }
            }

            for (int i = 0; i < o; i++) {
                for (int j = 0; j < o; j++) {
                    output[i][j] = sumAround(i, j, m, matrix);
                    sum += output[i][j];
                    System.out.println(output[i][j]);
                }
            }
            System.out.println(sum);
            System.out.println();


        }

    }

    private static int sumAround(int i, int j, int m, int[][] matrix) {

        int sum = 0;

        for (int k = 0; k < m; k++) {
            for (int l = 0; l < m; l++) {
                sum += matrix[i + k][j + l];
            }
        }

        return sum;

    }


}
