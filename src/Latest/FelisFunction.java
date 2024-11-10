package Latest;

import java.util.Scanner;

public class FelisFunction {

    private static final int MOD = 1000000007; // 10^9 + 7

    private static int[] memo = new int[100001]; // Memoization array

    public static int fellisFunction(int N) {
        if (N == 0) {
            return 1;
        }
        if (N == 1) {
            return 1;
        }
        if (memo[N] != 0) {
            return memo[N];
        }
        int result = (fellisFunction(N - 1) + 7 * fellisFunction(N - 2) + (N / 4)) % MOD;
        memo[N] = result;
        return result;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int N = scanner.nextInt();
        scanner.close();

        int result = fellisFunction(N);
        System.out.println(result);
    }
}