/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PS;

/**
 *
 * @author venkatesh
 */
//they will give N value and one arrray we have to modify the actual array such that every it will show each 
//every count upto N 
public class frequency {

    public static void countof(int N, int a[]) {
        int i = 0, j = 0;
        for (i = 0; i < N;) {

            if (a[i] > 0 && a[i] <= N) {
                j = a[i] - 1;
                if (a[j] <= 0) {
                    a[i] = 0;
                    a[j]--;
                    i++;

                } else {
                    int temp = a[j];
                    a[j] = a[i];
                    a[i] = temp;
                    a[j] = -1;

                }
            } else if (a[i] > N) {
                a[i] = 0;
                i++;
            } else {
                i++;
            }
        }
        for(int k=0;k<N;k++)
        {
            a[k]=(-1)*a[k];
        }
            
        

    }

    public static void main(String[] args) {
        int N = 7;
        int a[] = {3, 4, 4, 8, 1, 2, 5};
        int n=Math.abs(-3);
        System.out.println(n);
        countof(N, a);
        //  System.out.println(" ");
        for (int x : a) {
            System.out.print(" "+x);
        }
        System.out.println(" ");

    }
}
