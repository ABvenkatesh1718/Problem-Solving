/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LinkedList;

/**
 *
 * @author venkatesh
 */
class Node {

    public int data;
    public Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class Creation {

    /**
     *
     * @param head
     * @param data
     */
    Node head;
    Node tail;
    Node temp;

    public Creation() {
        this.head = null;
        this.tail = null;
    }

    public void CreationOfLinkedLIst(int data) {

        if (head == null) {
            temp = new Node(data);
            head = temp;
            tail = temp;
        } else {

            temp = new Node(data);
            tail.next = temp;
            tail = temp;

        }

    }

    public void display() {
        Node temp1 = head;
        while (temp1 != null) {
            System.out.println(temp1.data);
            temp1 = temp1.next;
        }
    }

    public void madeCycle(Node head) {
        Node temp = head;

        for (int i = 1; i < 4; i++) {
            temp = temp.next;
        }
        tail.next = temp;
    }

    public void cycleDetectRemove(Node head) {
        Node slow_p = head;
        Node fast_p = head;

        int flag = 0;
        while (slow_p != null && fast_p != null
                && fast_p.next != null) {
            slow_p = slow_p.next;
            fast_p = fast_p.next.next;
            if (slow_p == fast_p) {
                flag = 1;
                removeLoop(slow_p, head);
                break;
            }
        }
        if (flag == 1) {
            System.out.println("Loop Found");
        } else {
            System.out.println("No Loop");
        }
    }

    void removeLoop(Node loop, Node head) {
        Node ptr1 = loop;
        Node ptr2 = loop;

        // Count the number of nodes in loop
        int k = 1, i;
        Node prevNode = ptr1;
        while (ptr1.next != ptr2) {
            // keeping track beforeing moving next
            prevNode = ptr1;
            ptr1 = ptr1.next;
            k++;
        }
        prevNode.next = null;
    }

    public void rev() {
        Node temp = head;
        reverse(temp);
    }

    public void reverse(Node temp) {
        if (temp.next != null) {
            reverse(temp.next);
        }
        System.out.println(temp.data + " ");
    }

    public void reverseLinkedList() {
        head = reverseLink(head);
    }

    private Node reverseLink(Node head) {

        if (head == null || head.next == null) {
            return head;
        }
        Node newNode = reverseLink(head.next);
        Node front = head.next;
        front.next = head;
        head.next = null;
        return newNode;
    }

    public void addOne() {
        Node reversehead = reverseLink(head);
        Node temp = reversehead;
        while (temp != null) {
            if (temp.data < 9) {
                temp.data += 1;
                head=reverseLink(reversehead);
                return;

            } else {
                temp.data = 0;
            }
            temp=temp.next;

        }
        Node temp1 = new Node(1);
        temp1.next = reversehead;
        reversehead = temp1;
        head = reverseLink(reversehead);

    }
    

}
