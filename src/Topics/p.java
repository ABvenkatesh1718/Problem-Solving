/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Topics;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author venkatesh
 */
class ven {

    public static void display(ArrayList<Object> list) {

        list.forEach(n -> System.out.println(n));
    }
}

public class p {

    public static void main(String[] args) {

        var list1 = new ArrayList<>();

        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);
        ven.display(list1);
        be obj=new be();
        obj.fun();

    }
   public static class  be{
        public void fun(){
            System.out.println("method");
        }
    }

}
