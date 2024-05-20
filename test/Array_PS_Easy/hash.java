/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Array_PS_Easy;

import java.util.HashMap;

/**
 *
 * @author venkatesh
 */
public class hash {
    public static void main(String[] args) {
        int[] arr = { 11, 33, 33, 11, 33, 11 };
        var hash=new HashMap<Integer,Integer>();
        for (int i=0;i<arr.length;i++){
            int value=hash.getOrDefault(arr[i], 0);
            hash.put(arr[i], value+1);
            
        }
        System.out.println(hash);
        
    }
    
}
