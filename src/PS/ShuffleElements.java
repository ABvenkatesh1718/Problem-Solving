/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PS;

/**
 *
 * @author venkatesh
 */
 public class ShuffleElements {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        rearrangeArray(a, 0, a.length - 1);
        for (int num : a) {
            System.out.print(num + " ");
        }
        //System.out.println();
    }

    public static void rearrangeArray(int[] a, int start, int end) {
//        if (start >= end) {
//            return;
//        }
//
//        if (end - start == 1) {
//            swap(a, start + 1, end);
//            return;
//        }
//
       int mid = start + (end - start) / 2;
//
      int temp = mid + 1;
      int midLeft = start + (mid - start) / 2;
        System.out.println("mid is " + mid +" temp is : " + temp+ " midleft is :  "+ midLeft);
//
//        for (int i = midLeft + 1; i <= mid; i++) {
//            swap(a, i, temp++);
//        }
//
//        rearrangeArray(a, start, mid);
//        rearrangeArray(a, mid + 1, end);
  }

    public static void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
