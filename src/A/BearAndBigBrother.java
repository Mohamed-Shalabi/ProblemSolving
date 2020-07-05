package A;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BearAndBigBrother {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String input = bufferedReader.readLine();
        String[] strings = input.split(" ");
        double L = Double.parseDouble(strings[0]);
        double B = Double.parseDouble(strings[1]);
        if (L == B) {
            System.out.println(1);
            return;
        }
        double output = Math.log(B / L) / Math.log(3.0 / 2.0);
        int outputInt = (int) output;
        System.out.println(outputInt + 1);
//        if (output == outputInt && Math.log(L) == Math.log(B)) {
//            System.out.println(outputInt);
//        } else {
//            System.out.println(outputInt + 1);
//        }

    }
}
