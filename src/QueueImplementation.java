
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author venkatesh
 */
public class QueueImplementation {

    public static void main(String[] args) {

        ArrayDeque<Integer> q = new ArrayDeque<>();
        q.push(10);
        q.add(20);
        q.add(30);
        Iterator<Integer> itr = q.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }

}
