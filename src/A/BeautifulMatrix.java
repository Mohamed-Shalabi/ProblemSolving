package A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BeautifulMatrix {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        loop:
        for (byte i = 1; i < 6; i++) {
            String s = bufferedReader.readLine();
            String[] strings = s.split(" ");
            for (int j = 1; j < 6; j++) {
                if (strings[j - 1].equals("1")) {
                    System.out.println(Math.abs(i - 3) + Math.abs(j - 3));
                    break loop;
                }
            }
        }


    }
}
