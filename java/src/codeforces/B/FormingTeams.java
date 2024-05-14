package codeforces.B;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * a class to solve the problem {@link = http://codeforces.com/contest/216/problem/B}
 */
public class FormingTeams {

    static Map<Integer, ArrayList<Integer>> map;
    static Set<Integer> visited = new HashSet<>();
    static int output = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
        int n = Integer.parseInt(tokenizer.nextToken());
        int m = Integer.parseInt(tokenizer.nextToken());
        map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(i + 1, new ArrayList<>());
        }
        for (int i = 0; i < m; i++) {
            tokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
            int n1 = Integer.valueOf(tokenizer.nextToken());
            int n2 = Integer.valueOf(tokenizer.nextToken());
            map.get(n1).add(n2);
            map.get(n2).add(n1);
        }

        for (Map.Entry<Integer, ArrayList<Integer>> entry : map.entrySet()) {
            Integer integer = entry.getKey();
            dfs(integer, integer, 0);
        }

        if ((n - output) % 2 == 1) {
            output++;
        }
        System.out.println(output);
    }

    private static boolean dfs(int current, int firstSource, int level) {
        if (!visited.add(current)) {
            if (current == firstSource) {
                if (level % 2 == 1) {
                    output++;
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }
        level++;
        for (Integer integer : map.get(current)) {
            dfs(integer, firstSource, level);
        }
        return false;
    }
}
