/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Array_PS_Easy;

/**
 *
 * @author venkatesh
 */
public class Palindrome {
     public static boolean isPaline(String stir){
        if(stir.length() == 1){
            return true;
        }
        StringBuilder rev=new StringBuilder(stir);
        rev=rev.reverse();
        stir=stir.toLowerCase();
        String reverse=rev.toString().toLowerCase();
        return stir.equals(reverse);     
        
    }

    public static int countNumberOfPalindromeWords(String s) 
	{
        String str[]=s.split(" ");
        int count=0;
        for(String st: str){
            if(isPaline(st)){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String s="Nithin and i are good friends";
        System.out.println(countNumberOfPalindromeWords( s));
    }
    
}
