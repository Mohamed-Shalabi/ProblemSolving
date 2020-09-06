package codeforces.B;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LovelyPalindromes {
    public static void main(String[] args) throws IOException {

        String s = new BufferedReader(new InputStreamReader(System.in)).readLine();
        StringBuilder builder = new StringBuilder(s);
        builder.reverse();
        System.out.println(s + builder.toString());

    }
}
