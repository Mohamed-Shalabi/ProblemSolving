package codeforces.B;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class DevuTheDumbGuy {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
        int n = Integer.parseInt(tokenizer.nextToken());
        int x = Integer.parseInt(tokenizer.nextToken());
        Integer[] array = new Integer[n];
        tokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
        int i = 0;
        while (tokenizer.hasMoreTokens()) {
            array[i] = Integer.valueOf(tokenizer.nextToken());
            i++;
        }
        i = 0;

        Arrays.sort(array);
        long output = 0L;
        for (long element : array) {
            output += x * element;
            if (x > 1) {
                x--;
            }
        }
        System.out.println(output);
    }
}
