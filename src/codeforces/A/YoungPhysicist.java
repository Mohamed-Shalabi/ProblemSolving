package codeforces.A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * a class to solve the problem {@link = http://codeforces.com/contest/69/problem/A}
 */
public class YoungPhysicist {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        int[][] matrixOfForces = new int[n][];
        int x = 0, y = 0, z = 0;
        for (int i = 0; i < n; i++) {
            matrixOfForces[i] = Arrays.stream(bufferedReader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }
        for (int[] point : matrixOfForces) {
            x += point[0];
            y += point[1];
            z += point[2];
        }
        if (x == 0 && y == 0 && z == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
