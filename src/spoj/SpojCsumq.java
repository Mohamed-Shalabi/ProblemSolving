package spoj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class SpojCsumq {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());
        int[] nums = Arrays.stream(bufferedReader.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] sums = getComulativeSumArray(nums);
        int q = Integer.parseInt(bufferedReader.readLine());
        for (int a = 0; a < q; a++) {
            StringTokenizer tokenizer = new StringTokenizer(bufferedReader.readLine(), " ");
            int i = Integer.parseInt(tokenizer.nextToken());
            int j = Integer.parseInt(tokenizer.nextToken());
            if (i > j) {
                int temp = i;
                i = j;
                j = temp;
            }
            try {
                System.out.println(sums[j] - sums[i - 1]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(sums[j]);
            }
        }
    }

    private static int[] getComulativeSumArray(int[] nums) {
        int[] sums = new int[nums.length];
        sums[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            sums[i] = nums[i] + sums[i - 1];
        }
        return sums;
    }
}
