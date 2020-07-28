package spoj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

//This solution is not mine
public class AggrCowAggressiveCows {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bufferedReader.readLine());
        for (int i = 0; i < t; i++) {
            StringTokenizer tokenizer = new StringTokenizer(bufferedReader.readLine());
            int n = Integer.parseInt(tokenizer.nextToken());
            int c = Integer.parseInt(tokenizer.nextToken());
            int[] ints = new int[n];
            for (int j = 0; j < n; j++) {
                ints[j] = Integer.parseInt(bufferedReader.readLine());
            }
            Arrays.parallelSort(ints);
            int min = 0;
            int max = ints[ints.length - 1] + 1;
            int distance;
            int distance2 = 0;
            while (min <= max) {
                distance = (min + max) / 2;
                if (available(distance, c, ints)) {
                    if (distance > distance2) {
                        distance2 = distance;
                    }
                    min = distance + 1;
                } else {
                    max = distance - 1;
                }
            }

            if (i == t - 1) {
                System.out.print(distance2);
            } else {
                System.out.println(distance2);
            }
        }
    }

    private static boolean available(int distance, int cows, int[] positions) {
        int cowPlaced = 1;
        int lastPosition = positions[0];
        for (int i = 1; i < positions.length; i++) {
            if (positions[i] - lastPosition < distance)
                continue;
            if (++cowPlaced == cows)
                return true;
            lastPosition = positions[i];
        }
        return false;

    }
}
