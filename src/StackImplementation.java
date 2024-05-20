

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author venkatesh
 */
import java.util.Scanner;
import java.util.Stack;

public class StackImplementation {

    public static boolean ParenthesisValid(String str) {
        Stack<Character> st = new Stack<>();
        int len = str.length();

        if (len % 2 == 0) {
            len = len / 2;
            for (char c : str.toCharArray()) {
                if (len > 0) {
                    st.push(c);
                    len--;
                } else {
                    if (!st.isEmpty() && isMatchingPair(st.peek(), c)) {
                        st.pop();
                    }
                }
            }

        } else {

            return false;
        }

        return st.isEmpty();
    }

    private static boolean isMatchingPair(char char1, char char2) {
        return (char1 == '(' && char2 == ')')
                || (char1 == '{' && char2 == '}')
                || (char1 == '[' && char2 == ']');
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        System.out.println(ParenthesisValid( str));
        
    }
}
