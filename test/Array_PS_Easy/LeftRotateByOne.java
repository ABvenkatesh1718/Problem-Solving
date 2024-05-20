/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Array_PS_Easy;

/**
 *
 * @author venkatesh
 */
public class LeftRotateByOne {

    static int[] leftRotateArray(int[] arr, int n) {

        int temp = arr[0];
        for (int i = 0; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[n - 1] = temp;
        return arr;

    }

    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4};
        leftRotateArray(a, a.length);
        for (int x : a) {
            System.out.println(x);
        }
    }
}
