package spoj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class MakeTreeHierarchy {

    private static Map<Integer, ArrayList<Integer>> map = new HashMap<>();
    private static Set<Integer> visited = new HashSet<>();
    private static Stack<Integer> stack = new Stack<>();

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
        int n = Integer.parseInt(tokenizer.nextToken());
        int k = Integer.parseInt(tokenizer.nextToken());
        int[] output = new int[n];
        for (int successful = 0; successful < k; successful++) {
            int[] ints = Arrays.stream(bufferedReader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            ArrayList<Integer> arrayList = new ArrayList<>();
            for (int i = 0; i < ints.length; i++) {
                if (i == 0) {
                    continue;
                }
                int wished = ints[i];
                arrayList.add(wished);
            }
            map.put(successful + 1, arrayList);
        }
        for (int i = 0; i < n; i++) {
            if (map.containsKey(i)) {
                continue;
            }
            map.put(i, new ArrayList<>());
        }
        map.keySet().forEach(integer -> {
            if (!visited.contains(integer)) {
                topologicalSort(integer);
            }
        });
        int position = 0;
        for (int i = 0; i < n; i++) {
            output[stack.peek() - 1] = position;
            position = stack.pop();
        }
        Arrays.stream(output).forEach(System.out::println);
    }

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
