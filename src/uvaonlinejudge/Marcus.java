package uvaonlinejudge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;
import java.util.StringTokenizer;

public class Marcus {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int numOfPaths = Integer.parseInt(bufferedReader.readLine());
        for (int i = 0; i < numOfPaths; i++) {
            StringTokenizer tokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
            int m = Integer.parseInt(tokenizer.nextToken());
            int n = Integer.parseInt(tokenizer.nextToken());
            graph = new char[m][n];
            for (int j = 0; j < m; j++) {
                String s = bufferedReader.readLine();
                for (int k = 0; k < n; k++) {
                    graph[j][k] = s.charAt(k);
                    if (graph[j][k] == '@') {
                        currentI = j;
                        currentJ = k;
                    }
                }
            }
            charIndex = -1;
            dfs(currentI, currentJ);
            while (!orders.isEmpty()) {
                System.out.print(orders.pop() + (orders.size() == 0 ? "" : " "));
            }
            System.out.println();

            visited.clear();
        }

    }

    private static boolean dfs(int currentI, int currentJ) {
        for (Character character : visited) {
            if (character.equals(graph[currentI][currentJ])) {
                return false;
            }
        }
        if (graph[currentI][currentJ] == '#') {
            return true;
        }
        charIndex++;
        try {
            if (graph[currentI - 1][currentJ] == path.charAt(charIndex) && dfs(currentI - 1, currentJ)) {
                orders.push("forth");
                return true;
            }
        } catch (Exception ignored) {
        }

        try {
            if (graph[currentI][currentJ + 1] == path.charAt(charIndex) && dfs(currentI, currentJ + 1)) {
                orders.push("right");
                return true;
            }
        } catch (Exception ignored) {
        }

        try {
            if (graph[currentI][currentJ - 1] == path.charAt(charIndex) && dfs(currentI, currentJ - 1)) {
                orders.push("left");
                return true;
            }
        } catch (Exception ignored) {
        }
        charIndex--;
        return false;
    }

    private static Set<Character> visited = new HashSet<>();
    private static char[][] graph;
    private static int currentI = 0;
    private static int currentJ = 0;
    private static String path = "IEHOVA#";
    private static int charIndex = 0;
    private static Stack<String> orders = new Stack<>();
}
