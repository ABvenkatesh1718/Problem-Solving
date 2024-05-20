/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PS;

/**
 *
 * @author venkatesh
 */
public class Palindrome {
    public static boolean isPalindrome(String s) {
        String str=s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        StringBuilder sb=new StringBuilder(str);
        sb.reverse();
        String ans=sb.toString();
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=ans.charAt(i)){
                return false;
            }
        }
        return true;
    }
    public boolean isPalindrome1(String s) {
        char arr[] = s.toCharArray();
        int l = 0, r = arr.length - 1;
        
        while (l < r) {
        	if (arr[l] >= 'A' && arr[l] <= 'Z')
        		arr[l] += 32;
        	if (arr[r] >= 'A' && arr[r] <= 'Z')			// To lower case
        		arr[r] += 32;
        	
        	if (!((arr[l] >= '0' && arr[l] <= '9') || (arr[l] >= 'a' && arr[l] <= 'z')))	// Not letter, not number -> skip
        		l++;
        	else if (!((arr[r] >= '0' && arr[r] <= '9') || (arr[r] >= 'a' && arr[r] <= 'z')))
        		r--;
        	else if (arr[l] != arr[r])
        		return false;				// Is letter or number but isn't equal -> not palindrome
        	else {
        		l++;
        		r--;
        	}
        }
        return true;
    }
    public static void remove(String s){
        char[] c=s.toCharArray();
        String b="";
        for(int i=0;i<c.length;i++){
            //captial
            if(c[i] >= 'A' && c[i]<'Z'){
                b=b+c[i];
            }
            //small 
            else if(c[i] >='a' && c[i]<='z'){
                b=b+c[i];
            }else if(c[i]>='0' && c[i]<='9'){
                b=b+c[i];
            }
        }
        System.out.println(b.toLowerCase());
        b=b.toLowerCase();
        String  revstr=new StringBuilder(b).reverse().toString().toLowerCase();
        System.out.println(b.equals(revstr));
        
        
        
    }
    public static void main(String[] args) {
       String s="A man, a plan, a canal: Panama";
        remove(s);
    
       
    }
    
}
