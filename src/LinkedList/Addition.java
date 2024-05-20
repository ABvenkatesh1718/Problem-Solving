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
public class Addition {

    public static void main(String[] args) {
        LinkedList<Integer> list1 = new LinkedList<>();
        LinkedList<Integer> list2 = new LinkedList<>();
        list1.add(2);
        list1.add(4);
        list1.add(3);
        list2.add(5);
        list2.add(6);
        list2.add(4);
        LinkedList<Integer> list3 = new LinkedList<>();
        int sum = 0;
        int carry = 0;
        for (int i = 0; i < list1.size() && i < list2.size(); i++) {
            int sum1 = list1.get(i) + list2.get(i) + carry;
            carry = sum1 / 10;
            list3.add((sum1 % 10));
        }
        Iterator<Integer> itr = list3.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

    }

}

/**
 * Definition for singly-linked list. public class ListNode { int val; ListNode
 * next; ListNode() {} ListNode(int val) { this.val = val; } ListNode(int val,
 * ListNode next) { this.val = val; this.next = next; } }
 */

/*
class Solution {

    public static ListNode l3;
    public static ListNode head = null, tail = null, temp = null;

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l3 = new ListNode();  
        ListNode current = l3;  
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            int val1 = (l1 != null) ? l1.val : 0;
            int val2 = (l2 != null) ? l2.val : 0;

            int sum = val1 + val2 + carry;
            carry = sum / 10;
            int num = sum % 10;

            current.next = new ListNode(num);
            current = current.next;

            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }

        return l3.next;  
    }
    

   
}
 */
