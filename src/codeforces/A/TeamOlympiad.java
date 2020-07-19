package codeforces.A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;
/**
 * a class to solve the problem {@link = http://codeforces.com/contest/490/problem/A}
 */
public class TeamOlympiad {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        StringTokenizer strings = new StringTokenizer(bufferedReader.readLine(), " ");
        int[] arr = new int[n];
        for (int i = 0; strings.hasMoreTokens(); i++) {
            arr[i] = Integer.parseInt(strings.nextToken());
        }
        int[] maxTeamsArr = {0, 0, 0};
        for (int value : arr) {
            if (value == 1) {
                maxTeamsArr[0]++;
            } else if (value == 2) {
                maxTeamsArr[1]++;
            } else {
                maxTeamsArr[2]++;
            }
        }
        int maxTeams = Math.min(maxTeamsArr[0], Math.min(maxTeamsArr[1], maxTeamsArr[2]));
        int[][] matrix = new int[maxTeams][3];
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < maxTeams; i++) {

            Set<Integer> set1 = new HashSet<>();
            int j = 0, k = i;
            //matrix[i][j] = j + 1;
            do {
                while (set.contains(k)) {
                    k++;
                }
                if (set1.add(arr[k])) {
                    matrix[i][j] = k + 1;
                    set.add(k);
                    j++;
                }
                k++;
            } while (j < 3);
        }
        System.out.println(maxTeams);
        for (int i = 0; i < maxTeams; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
