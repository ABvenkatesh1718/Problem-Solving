/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Array_PS_Easy;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author venkatesh
 */
public class Union {
    public static List< Integer > sortedArray(int []a, int []b) {
        int i=0;int j=0;int k=0;
        ArrayList<Integer> union=new ArrayList<>();
        while( i < a.length && j< b.length)
        {
            if(a[i] <= b[j]){
                
                if(union.size() == 0 || union.get(union.size() - 1) != a[i] ){
                    union.add(a[i]);
                }
                i++;
                 
            }
            else{

                if(union.size() == 0 || union.get(union.size() - 1) != b[j] ){
                    union.add(b[j]);
                }
                j++;

            }

        }
        while(i < a.length){
            if(union.size() == 0 || union.get(union.size() - 1) != a[i] ){
                union.add(a[i]);
            }
            i++;
        }
        while(j< b.length){
            if(union.size() == 0 || union.get(union.size() - 1) != b[j] ){
                union.add(b[j]);
            }
            j++;
        }
        return union;

    }
}
