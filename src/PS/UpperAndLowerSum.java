/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PS;

import java.util.Scanner;

/**
 *
 * @author venkatesh
 */
// simple logic index based logic 
// 
public class UpperAndLowerSum {
    public static void uals(int [][]a,int n)
    {
        int upper=0,lower=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==j)
                {
                    upper+=a[i][j];
                    lower+=a[i][j];
                }
               else if(i>j)
                {
                    upper+=a[i][j];
                }
               else if(i<j)
               {
                   lower+=a[i][j];
               }
            }
        }
        System.out.printf("the sum of upper and lower triangle matrix is : %d  %d ",upper,lower);
    }
        

    public static void main(String[] args) {
//        int[][] a = {{1, 2, 3},
//                    {4, 5, 6},
//                    {7, 8, 9}
//                    };
//        int n=a.length;
//        uals(a,n);
            Scanner sc=new Scanner(System.in);
        System.out.print("enter the age ");
        int res=sc.nextInt();
        String max=(res>=18)? "elligible": "not eligible";
        System.out.printf(max);
        
    }

}

