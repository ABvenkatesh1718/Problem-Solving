/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Array_PS_Easy;

/**
 *
 * @author venkatesh
 */
public class Check_Array_Sort {

    public static boolean Check_Array(int a[]) {

        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i + 1]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4};
        System.out.println(Check_Array(a));
    }

}
/*

 for (int i: arr){
            // Update temp with the max of the current element of arr or temp.
            
*/
