package A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BlackSquare {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] strings = bufferedReader.readLine().split(" ");
        int[] ints = new int[4];
        for (int i = 0; i < strings.length; i++) {
            ints[i] = Integer.parseInt(strings[i]);
        }
        String s = bufferedReader.readLine();
        int out = s.chars().map(value -> ints[Character.getNumericValue(value - 1)]).sum();
        System.out.println(out);
    }
}
