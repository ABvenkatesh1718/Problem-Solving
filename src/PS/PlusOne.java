/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PS;

/**
 *
 * @author venkatesh
 */
public class PlusOne {

    public static int[] plusOne(int[] digits) {

        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }
       public static void main(String[] args) {
        
           
          int a[]={9,9,9};
          
          String str=a.toString();
           System.out.println(str);
//          
//          int b[]= plusOne(a);
//          for(int x : b){
//              System.out.print(x);
//          }
//           System.out.println(" ");
    }
}