/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Uchchhwas
 */
import java.util.*;

public class NCR2 {

    static int dp[][];

    static int combination(int n, int r) {
        if (n == r) {
            return 1;
        } else if (n == 0 || n == 1) {
            return 1;
        } else if (r == 1) {
            return n;
        } else if (dp[n][r] == 0) {
            dp[n][r] = combination(n - 1, r) + combination(n - 1, r - 1);
        }
        return dp[n][r];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = sc.nextInt();
        dp = new int[n + 1][r + 1];
        int result = combination(n, r);
        System.out.println(result);

    }
}
