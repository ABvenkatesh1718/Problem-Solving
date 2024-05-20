/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PS;

/**
 *
 * @author venkatesh
 */

// tom and jerry playing a game -> tom will always start the game 
//input : N integer will be given 
//tom will start game from N he will subtract the number such that number will divisible of that number not itself 
//that subtract number will be given to jerry again he will also do the same thing 
// now if any one not able to subtract the number given by other then you will loose
//return 1 if tom will win else 0
//if tom get even he will give odd to jerry by subtracting the odd divisior 
//jerry will get odd number so he must have to subtact the odd subtract the odd number so he get even that 
//that will given to tom so he will win other wise he vice versa
public class TomAndJerry {
    
   int game(int n)
   {
       if(n%2==0) return 1;
       else return 0;
   }
    public static void main(String[] args) {
        int n=2;
        System.out.println(new TomAndJerry().game(n));
        
    }
    
}
