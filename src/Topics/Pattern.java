/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Topics;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author venkatesh
 */
public class Pattern {

    /*
    ****
    ****
    ****
    ****
     */
    public static void p1(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }

    }

    /*
    *
    **
    ***
    ****
     */
    public static void p2(int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println(" ");
        }

    }

    /*
    1
    12
    123
    1234
     */
    public static void p3(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println(" ");
        }

    }

    /*
    ****
    ***
    **
    *
     */
    public static void p4(int n) {
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

    /*
    12345
    1234
    123
    12
    1
     */
    public static void p5(int n) {
        for (int i = n; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println(" ");
        }

    }

    /*
       
     *
    ***  
   *****
         
     */
    public static void p6(int n) {
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println(" ");

        }

    }

    /*
    same as p6 but in reverse order
     */
    public static void p7(int n) {
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * n - (2 * i + 1); j++) {
                System.out.print("*");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println(" ");

        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
//        String s[] = str.trim().split(" ");
//        var ar = new ArrayList<Integer>();
//
//        for (String item : s) {
//            ar.add(Integer.valueOf(item));
//        }
//        System.out.println(ar);

    }

}
