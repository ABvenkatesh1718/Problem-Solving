/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Demo;

/**
 *
 * @author venkatesh
 */
import java.util.HashMap;

public class Hash {

    public static void main(String[] args) {
        int a[] = {1, 2, 3, 3, 4, 4, 5};
        HashMap<Integer, Integer> hp = new HashMap<>();
        for (int element : a) {
            int count = hp.getOrDefault(element, 0);
            hp.put(element, count + 1);
        }
        
        System.out.println(hp);
        
        for (int key : hp.keySet()) {
            if (hp.get(key) == 1) {
                System.out.print(key + " ");
            }
        }

    }

}
