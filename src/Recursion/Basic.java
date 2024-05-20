/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Recursion;

/**
 *
 * @author venkatesh
 */
public class Basic {
    //1 to N
    public static void print(int n) {
        if (n == 0 || n == 1) {
            System.out.print(n+" ");
            return;
        }
        print(n - 1);
        System.out.print(n+" ");
    }
    //N to 1
    public static void print1(int n) {
        if (n == 0 || n == 1) {
            System.out.print(n+" ");
            return;
        }
        System.out.print(n+" ");
        print1(n - 1);
        
    }
    //sum of number in array
    public static int sumArray(int[] arr, int n) {
        if (n == 0) {
            return arr[n];
        }
        return arr[n] + sumArray(arr, n-1);
    }
    
    //sum of natural numbers
    
    public static int sumOfNaturalNumber(int n){
        if(n==0){
            return 0;
        }
        return n+sumOfNaturalNumber(n-1);
    }
    
    //print string in reverse
    
    public static int lengthOfString(String s){
        if(s.equals("")){
            return 0;
        }
        return lengthOfString(s.substring(1))+1;
    }
    
    public static void reverseString(String s){
        if(s == null || s.length()<1){
            System.out.print(s+" ");
            return ;
        }
        System.out.print(s.charAt(s.length()-1));
        reverseString(s.substring(0, s.length()-1));
    }
    
    
    
    //sum of digits
    public static int sumOfDigits(int num){
        if(num == 0){
            return 0;
        }
        return (num%10)+sumOfDigits(num/10);
    }
    
    
    //fibonacci
    public static int fib(int n){
        if(n==0 || n==1){
            return n;
        }
        return fib(n-1)+fib(n-2);
    }
    
    //factorial
    
    public static int fact(int n){
        if(n==0 || n==1){
            return 1;
        }
        return n*fact(n-1);
    }
         
    
    
    

    public static void main(String[] args) {
         
      String str="aeiouoooi";
        System.out.println(str.contains("ou"));
        
    }

}
