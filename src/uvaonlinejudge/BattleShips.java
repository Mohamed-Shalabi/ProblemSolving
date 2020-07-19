package uvaonlinejudge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class BattleShips {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(bufferedReader.readLine());
        for (int k = 0; k < t; k++) {
            int n = Integer.parseInt(bufferedReader.readLine());
            graph = new char[n][n];
            for (int i = 0; i < n; i++) {
                graph[i] = bufferedReader.readLine().toCharArray();
            }
            int output = 0;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (graph[i][j] == 'x') {
                        if (dfs(i, j)) {
                            output++;
                        }
                    }
                }
            }
            visited.clear();
            System.out.println("Case " + (k + 1) + ": " + output);
        }
    }

    private static char[][] graph;
    private static Set<Pair> visited = new HashSet<>();

    private static boolean dfs(int i, int j) {
        if (contains(i, j)) {
            return false;
        }
        visited.add(new Pair(i, j));

        try {
            if (equals(i + 1, j)) {
                dfs(i + 1, j);
            }
        } catch (Exception ignored) {
        }
        try {
            if (equals(i, j + 1)) {
                dfs(i, j + 1);
            }
        } catch (Exception ignored) {
        }

        return true;
    }

    private static boolean equals(int i, int j) {
        return graph[i][j] == 'x' || graph[i][j] == '@';
    }

    private static boolean contains(int i, int j) {
        for (Pair pair : visited) {
            if (pair.i == i && pair.j == j) {
                return true;
            }
        }
        return false;
    }

    static class Pair {
        int i;
        int j;

        Pair(int i, int j) {
            this.i = i;
            this.j = j;
        }

        @Override
        public boolean equals(Object obj) {
            Pair pair = (Pair) obj;
            return pair.i == i && pair.j == j;
        }
    }

}

