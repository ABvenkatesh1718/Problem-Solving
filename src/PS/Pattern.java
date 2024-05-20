
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PS;

/**
 *
 * @author venkatesh
 */
public class Pattern {

    public static void print(int n) {
        int z = 1;
        int i = 1, j = 0;
        for (i = 1; i <= n; i++) {
            for (j = n - 1; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= z; k++) {
                System.out.print("*");
            }

            System.out.println(" ");
            z += 2;
        }

    }
    
    public static void print1(int n) {
        int z = n*2-1;
        int i = 1, j = 0;
        int count =1;
        for (i = n; i >= 1; i--) {
            for (j = n - 1; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= z; k++) {
                if(count==1){count++; continue; }
                System.out.print("*");
            }

            System.out.println(" ");
            z -= 2;
        }

    }

    public static void main(String[] args) {
       print(4);
        print1(4);
    }

}
