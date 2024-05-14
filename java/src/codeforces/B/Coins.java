package codeforces.B;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Coins {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s1 = bufferedReader.readLine();
        String s2 = bufferedReader.readLine();
        String s3 = bufferedReader.readLine();

        boolean ab = false;
        boolean bc = false;
        boolean ca = false;

        if (
                s1.equals("A>B") || s2.equals("A>B") || s3.equals("A>B") ||
                        s1.equals("B<A") || s2.equals("B<A") || s3.equals("B<A")
        ) ab = true;

        if (
                s1.equals("B>C") || s2.equals("B>C") || s3.equals("B>C") ||
                        s1.equals("C<B") || s2.equals("C<B") || s3.equals("C<B")
        ) bc = true;

        if (
                s1.equals("C>A") || s2.equals("C>A") || s3.equals("C>A") ||
                        s1.equals("A<C") || s2.equals("A<C") || s3.equals("A<C")
        ) ca = true;

        if ((ab && bc && ca) || (!ab && !bc && !ca)) {
            System.out.println("Impossible");
            return;
        }

        if (ab && bc && !ca) {
            System.out.println("CBA");
            return;
        }

        if (ab && !bc && ca) {
            System.out.println("BAC");
            return;
        }

        if (ab && !bc && !ca) {
            System.out.println("BCA");
            return;
        }

        if (!ab && bc && ca) {
            System.out.println("ACB");
            return;
        }

        if (!ab && bc && !ca) {
            System.out.println("CAB");
            return;
        }


        if (!ab && !bc && ca) {
            System.out.println("ABC");
        }


    }
}
