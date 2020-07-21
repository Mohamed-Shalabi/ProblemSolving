package codeforces.A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.atomic.AtomicBoolean;

/**
 * a class to solve the problem {@link = http://codeforces.com/contest/514/problem/A}
 */
public class ChewbaccaAndNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s = bufferedReader.readLine();
        StringBuilder builder = new StringBuilder();
        AtomicBoolean first = new AtomicBoolean(true);
        s.chars().forEach(value -> {
            int myValue = Character.getNumericValue((char) value);
            if (first.get()) {
                first.set(false);
                if (myValue > 4 && myValue < 9) {
                    myValue = 9 - myValue;
                }
                builder.append(myValue);
                return;
            }
            if (myValue > 4) {
                myValue = 9 - myValue;
            }
            builder.append(myValue);
        });
        System.out.println(builder.toString());
    }
}
