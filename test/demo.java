

import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author venkatesh
 */
public class demo {

    public static void main(String[] args) {
//        int yearToCheck = 2024;
//
//        if (Year.of(yearToCheck).isLeap()) {
//            System.out.println(yearToCheck + " is a leap year.");
//        } else {
//            System.out.println(yearToCheck + " is not a leap year.");
//        }
//       

//        Scanner sc = new Scanner(System.in);
//        int sum = 0;
//        int num = 0;
//
//        do {
//            System.out.print("Enter the integer(press 0 to stop) : ");
//            num = sc.nextInt();
//
//            sum = sum + num;
//        } while (num != 0);
//        System.out.println("sum is " + sum);
//        for (int i = 5; i < 0; i++) {
//            for (int j = 0; j < i; j++) {
//                System.out.print("*");
//            }
//            System.out.println("");
//
//        }
        int n = 5; // Number of rows (change this value for a different size diamond)

        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print(" "); // Print spaces before the asterisks
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*"); // Print asterisks
            }
            System.out.println(); // Move to the next line
        }

        for (int i = n - 1; i >= 1; i--) {
            for (int j = n; j > i; j--) {
                System.out.print(" "); // Print spaces before the asterisks
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*"); // Print asterisks
            }
            System.out.println(); // Move to the next line
        }
    


    }
}
