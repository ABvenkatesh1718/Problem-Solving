/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DP;

import java.util.Arrays;

/**
 *
 * @author venkatesh
 */
public class LongestCommonSubsequence {

    public static int lcs(String str1, String str2) {
        int m = str1.length();
        int n = str2.length();
        int dp[][] = new int[m + 1][n + 1];
        for (int dp1[] : dp) {
            for (int x : dp1) {
                System.out.println(x);
            }
        }
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[m][n];
    }

    public static void main(String[] args) {
        String str1 = "abcde", str2 = "ace";
        System.out.println(lcs(str1, str2));

    }

}
