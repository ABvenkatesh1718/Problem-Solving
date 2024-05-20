/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PS;

import java.util.Stack;

/**
 *
 * @author venkatesh
 */

// given the one string 
//input String str="1221"
//output=0
// explanation we have to remove the two consetive character like "1221" ->"12","21" ->length is 0 return 0;
public class NumberStringProblem {

    char expectedstr(char s) {
        if (s == '0') {
            return '9';
        } else if (s == '9') {
            return '0';
        } else if (s % 2 == 0) {
            return (char) (s - 1);
        } else {
            return (char) (s + 1);
        }

    }

    int nsp(String s, int n) {
        Stack<Character> st = new Stack<Character>();
        for (int i = 0; i < n; i++) {
            if (st.empty()) {
                st.push(s.charAt(i));
            } else if (st.peek() == expectedstr(s.charAt(i))) {
                st.pop();
            } else {
                st.push(s.charAt(i));
            }
        }
        return st.size();
    }

    public static void main(String[] args) {

        String s = "1221";
        System.out.println(new NumberStringProblem().nsp(s, s.length()));

    }

}
