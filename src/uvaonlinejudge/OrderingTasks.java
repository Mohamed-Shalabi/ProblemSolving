package uvaonlinejudge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class OrderingTasks {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            map.clear();
            visited.clear();
            stack.clear();
            StringTokenizer tokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
            int n = Integer.parseInt(tokenizer.nextToken());
            int m = Integer.parseInt(tokenizer.nextToken());
            if (n == 0 && m == 0) {
                break;
            }
            for (int i = 0; i < n; i++) {
                map.put(i + 1, new ArrayList<>());
            }
            for (int i = 0; i < m; i++) {
                tokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
                map.get(Integer.parseInt(tokenizer.nextToken())).add(Integer.valueOf(tokenizer.nextToken()));
            }
            map.keySet().forEach(integer -> {
                if (!visited.contains(integer)) {
                    topologicalSort(integer);
                }
            });
            int size = stack.size();
            for (int i = 0; i < size; i++) {
                try {
                    System.out.print(stack.pop() + " ");
                } catch (Exception e) {
                    break;
                }
            }
            System.out.println();
        }
    }

    private static Map<Integer, ArrayList<Integer>> map = new HashMap<>();
    private static Set<Integer> visited = new HashSet<>();
    private static Stack<Integer> stack = new Stack<>();

    private static void topologicalSort(int num) {
        visited.add(num);
        if (map.get(num) != null) {
            map.get(num).forEach(integer -> {
                if (!visited.contains(integer)) {
                    topologicalSort(integer);
                }
            });
        }
        stack.push(num);
    }
}
