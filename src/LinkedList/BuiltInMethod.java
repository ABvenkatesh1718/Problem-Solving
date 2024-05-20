/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LinkedList;
import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author venkatesh
 */
public class BuiltInMethod {

    public static void main(String[] args) {
        LinkedList<Integer> ll1 = new LinkedList<>();
        ll1.add(10);
        ll1.add(20);
        ll1.add(30);
        ll1.add(40);
        ll1.add(50);
        Iterator itr = ll1.iterator();
        String str = "      ";
        while (itr.hasNext()) {
            str = str + String.valueOf(itr.next());
        }
       
        int a = Integer.parseInt(str.trim());
        System.out.println(a);

    }

}
