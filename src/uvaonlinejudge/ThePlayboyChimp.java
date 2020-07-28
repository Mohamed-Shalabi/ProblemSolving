package uvaonlinejudge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class ThePlayboyChimp {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        bufferedReader.readLine();
        int[] lengths = Arrays.stream(bufferedReader.readLine().split(" ")).mapToInt(Integer::parseInt).distinct().toArray();
        bufferedReader.readLine();
        int[] queries = Arrays.stream(bufferedReader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        ArrayList<Integer> array1 = new ArrayList<>();
        ArrayList<Integer> array2 = new ArrayList<>();
        for (int query : queries) {
            int index = Arrays.binarySearch(lengths, query);
            if (index < 0) {
                index = -2 - index;
            }
//            if (index == lengths.length && lengths.length > 1) {
//                array1.add(lengths[index - 1]);
//                array2.add(null);
//                continue;
//            }
            if (lengths[index] == query) {
                try {
                    array1.add(lengths[index - 1]);
                } catch (Exception e) {
                    array1.add(null);
                }
                try {
                    array2.add(lengths[index + 1]);
                } catch (Exception e) {
                    array2.add(null);
                }
            } else {
                if (index == 0) {
                    array1.add(null);
                    try {
                        array2.add(lengths[index]);
                    } catch (Exception e) {
                        array2.add(null);
                    }
                } else if (index == lengths.length - 1) {
                    try {
                        array1.add(lengths[index]);
                    } catch (Exception e) {
                        array1.add(null);
                    }
                    array2.add(null);
                } else {
                    try {
                        array1.add(lengths[index]);
                    } catch (Exception e) {
                        array1.add(null);
                    }
                    try {
                        array2.add(lengths[index + 1]);
                    } catch (Exception e) {
                        array2.add(null);
                    }
                }
            }
        }
        for (int i = 0; i < array1.size(); i++) {
            System.out.println((array1.get(i) == null ? "X" : array1.get(i)) + " " + (array2.get(i) == null ? "X" : array2.get(i)));
        }

    }
}