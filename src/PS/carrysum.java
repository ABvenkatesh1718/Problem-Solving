/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PS;

/**
 *
 * @author venkatesh
 */
public class carrysum {
    public static int getCarrySum(int num1, int num2) {
        int carry = 0;
        int sum = 0;
        int base = 10; // base 10 since numbers are between 1-9

        while (num1 > 0 && num2 > 0) {
            int digit1 = num1 % base;
            int digit2 = num2 % base;

            int tempSum = digit1 + digit2 + carry;
            carry = (tempSum >= base) ? 1 : 0;
            sum += carry;

            num1 /= base;
            num2 /= base;
        }

        return sum;
    }

    public static void main(String[] args) {
        int var1 = 999; // Example variable 1
        int var2 = 999; // Example variable 2

        int result = getCarrySum(var1, var2);
        System.out.println("Carry sum when adding " + var1 + " and " + var2 + " is: " + result);
    }
}

