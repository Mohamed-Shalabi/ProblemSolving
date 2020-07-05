package A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PetyaAndStrings {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int i = bufferedReader.readLine().compareToIgnoreCase(bufferedReader.readLine());
        if (i < 0) {
            System.out.println(-1);
        } else if (i > 0) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
