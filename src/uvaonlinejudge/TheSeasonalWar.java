package uvaonlinejudge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class TheSeasonalWar {

    public static void main(String[] args) throws IOException {


        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> integers = new ArrayList<>();
        while (true) {
            int n = Integer.parseInt(bufferedReader.readLine());
            graph = new int[n][n];
            for (int i = 0; i < n; i++) {
                char[] chars = bufferedReader.readLine().toCharArray();
                for (int j = 0; j < chars.length; j++) {
                    graph[i][j] = Character.getNumericValue(chars[j]);
                }
            }
            int output = 0;
            for (int i = 0; i < graph.length; i++) {
                for (int j = 0; j < graph.length; j++) {
                    if (add(i, j) && graph[i][j] == 1) {
                        dfs(i, j);
                        output++;
                    }
                }
            }
            integers.add(output);
            visited.clear();
            if (!bufferedReader.ready()) {
                break;
            }
        }
        for (int i = 0; i < integers.size(); i++) {
            Integer integer = integers.get(i);
            System.out.println("Image number " + (i + 1) + " contains " + integer.toString() + " war eagles.");
        }

    }

    private static Set<Pair> visited = new HashSet<>();
    private static int[][] graph;

    private static boolean add(int i, int j) {
        for (Pair pair : visited) {
            if (pair.i == i && pair.j == j) {
                return false;
            }
        }
        visited.add(new Pair(i, j));
        return true;
    }

    private static boolean dfs(int i, int j) {
        boolean bool = false;
        try {
            if (add(i + 1, j) && graph[i + 1][j] != 0) {
                bool = true;
                dfs(i + 1, j);
            }
        } catch (Exception ignored) {
        }
        try {
            if (add(i + 1, j + 1) && graph[i + 1][j + 1] != 0) {
                bool = true;
                dfs(i + 1, j + 1);
            }
        } catch (Exception ignored) {
        }
        try {
            if (add(i + 1, j - 1) && graph[i + 1][j - 1] != 0) {
                bool = true;
                dfs(i + 1, j - 1);
            }
        } catch (Exception ignored) {
        }
        try {
            if (add(i, j + 1) && graph[i][j + 1] != 0) {
                bool = true;
                dfs(i, j + 1);
            }
        } catch (Exception ignored) {
        }
        try {
            if (add(i, j - 1) && graph[i][j - 1] != 0) {
                bool = true;
                dfs(i, j - 1);
            }
        } catch (Exception ignored) {
        }
        try {
            if (add(i - 1, j) && graph[i - 1][j] != 0) {
                bool = true;
                dfs(i - 1, j);
            }
        } catch (Exception ignored) {
        }
        try {
            if (add(i - 1, j + 1) && graph[i - 1][j + 1] != 0) {
                bool = true;
                dfs(i - 1, j + 1);
            }
        } catch (Exception ignored) {
        }
        try {
            if (add(i - 1, j - 1) && graph[i - 1][j - 1] != 0) {
                bool = true;
                dfs(i - 1, j - 1);
            }
        } catch (Exception ignored) {
        }

        return bool;
    }
}

class Pair {
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
