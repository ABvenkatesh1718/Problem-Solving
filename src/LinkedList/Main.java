/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LinkedList;

import java.util.LinkedList;

/**
 *
 * @author venkatesh
 */
public class Main {

    public static int boringFactorials(int n, int p) {
        if (n < 0 || p < 0) {
            return -1;
        }
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact % p;

    }
     

    public static void main(String[] args) {
        Creation LinkedList1 = new Creation();
        LinkedList1.CreationOfLinkedLIst(9);
        LinkedList1.CreationOfLinkedLIst(9);
        
        LinkedList1.addOne();
        LinkedList1.display();
    }

}
//        Creation LinkedList1 = new Creation();
//        LinkedList1.CreationOfLinkedLIst(10);
//        LinkedList1.CreationOfLinkedLIst(20);
//        LinkedList1.CreationOfLinkedLIst(30);
//        LinkedList1.CreationOfLinkedLIst(40);
//        LinkedList1.CreationOfLinkedLIst(50);
//        LinkedList1.madeCycle(LinkedList1.head);
//        LinkedList1.cycleDetectRemove(LinkedList1.head);
//        LinkedList1.display(LinkedList1.head);
