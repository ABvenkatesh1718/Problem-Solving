/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Recursion;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author venkatesh
 */
public class LCS {
    public static int longsubseq(String str1,String str2){
        int dp[][]=new int[str1.length()][str2.length()];
        
        for(int i=0;i<str1.length();i++){
            for(int j=0;j<str2.length();j++){
               
                 if(str1.charAt(i) == str2.charAt(j)){
                    dp[i][j]=1+dp[i-1][j-1];
                }else{
                    dp[i][j]=Math.max(dp[i][j-1],dp[i-1][j]);
                }
            }
        }
        return dp[str1.length()-1][str2.length()-1];
    }
    static int lcs(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();

        // Create a 2D array to store results of subproblems
        int dp[][] = new int[n + 1][m + 1];

        // Initialize the dp array with -1 to indicate that subproblems are not solved yet
        for (int rows[] : dp)
            Arrays.fill(rows, -1);

        // Initialize the first row and first column with zeros since LCS with an empty string is zero
        for (int i = 0; i <= n; i++) {
            dp[i][0] = 0;
        }
        for (int i = 0; i <= m; i++) {
            dp[0][i] = 0;
        }

        // Fill the dp array using dynamic programming
        for (int ind1 = 1; ind1 <= n; ind1++) {
            for (int ind2 = 1; ind2 <= m; ind2++) {
                // If the characters at the current indices are the same, increment the LCS length
                if (s1.charAt(ind1 - 1) == s2.charAt(ind2 - 1))
                    dp[ind1][ind2] = 1 + dp[ind1 - 1][ind2 - 1];
                // If the characters are different, choose the maximum LCS length by either
                // excluding a character in s1 or excluding a character in s2
                else
                    dp[ind1][ind2] = Math.max(dp[ind1 - 1][ind2], dp[ind1][ind2 - 1]);
            }
        }

        return dp[n][m]; // Return the length of the Longest Common Subsequence (LCS)
    }
    static int nthFibonacci(int n){
         int a = 0, b = 1, c;
        if (n == 0)
            return a;
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }
    
    public static  void subset(int idx,int n,int a[],ArrayList<Integer>list){
        if(idx>=n){
            for(int x : list){
                System.out.print(x+" ");
            }
           
            if(list.isEmpty()){
                System.out.println("{}");
            }
             System.out.println(" ");
            return ;
        }
        list.add(a[idx]);
        subset(idx+1,n,a,list);
        list.remove(list.size()-1);
        subset(idx+1,n,a,list);
        
    }
    
      
    public static void main(String[] args) {
        int a[]={1,2,3};
        subset(0,3,a,new ArrayList<Integer>());
        String s="fdsfds";
        s.length();
        
    }
    
}


/*

 public String maximumOddBinaryNumber(String s) {
        int l =s.length();
        Integer[] arr= new Integer[l];
        for(int i =0;i<l;i++){
            arr[i]=s.charAt(i)-'0';
        }
        int pointer=0;
        Arrays.sort(arr,Collections.reverseOrder());
        if(arr[l-1]==0){
            for(int i = l-2;i>=0;i--){
              
                if(arr[i]==1){
                    Integer temp= arr[l-1];
                    arr[l-1]=arr[i];
                    arr[i]=temp;
                
                }
            }
        }
        String a="";
        for(int i =0;i<l;i++){
          a=a+Integer.toString(arr[i]);
        }
        
        return a;
    }


*/
