/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PS;

import java.util.Arrays;

/**
 *
 * @author venkatesh
 */
//given an array which contains the 0's and 1's and 2's along with the size of array also 
//we have to arrange the elements in ascending order 
public class AscendingOrder {

    
    void ao(int a[], int n) {
        int c_0 = 0, c_1 = 0, c_2 = 0;
        for (int i = 0; i < n; i++) {
            switch (a[i]) {
                case 0:
                    c_0++;
                    break;
                case 1:
                    c_1++;
                    break;
                case 2:
                    c_2++;
                    break;
                default:
                    break;
            }

        }
        for(int i=0;i<n;i++)
        {
            if(c_0>0)
            {
                a[i]=0;
                c_0--;
            }
            else if(c_1>0)
            {
                a[i]=1;
                c_1--;
            }
            else if(c_2>0)
            {
                a[i]=2;
                c_2--;
                
            }
            
        }

    }
    
    public static void slide(int a[],int n){
        
        
        int low=0;int mid=0;int high=n-1;
        while(mid<=high){
            switch (a[mid]) {
                case 0:
                    swap(a,mid,low);
                    mid++;
                    low++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    swap(a,mid,high);
                    high--;
                    break;
                default:
                    break;
            }
        }    
    }
    public static void swap(int a[], int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void main(String[] args) {

        int a[] = {2, 2, 2, 0, 0, 0, 1, 1, 1};
        int n = 9;
        slide(a,n);
        for(int i:a){
            System.out.println(i);
        }
    }
}
