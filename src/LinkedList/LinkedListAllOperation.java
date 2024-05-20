/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */



/*
package LinkedList;

/**
 *
 * @author venkatesh
 */
/*
class Node1 {

    private int data;
    private Node1 next;

    public Node1() {
        this.data = 0;
        this.next = null;
    }

    public Node1(int data) {
        this.data = data;
        this.next = null;
    }
    private Node1 head;
    private Node1 tail;
    private Node1 temp;
    public void Create(int data){
        
        if (head == null) {
            temp = new Node1(data);
            head = temp;
            tail = temp;
        } else {

            temp = new Node1(data);
            tail.next = temp;
            tail = temp;

        }
    }
    public int length(Node head) {
        temp = head;
        int count = 0;
        if (head == null) {
            return count;
        }
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }
    public void display(){
        temp=head;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp=temp.next;
            
        }
        System.out.println(" ");
    }
     
    public void insertStart(int data){
        if(head == null){
            temp=new Node(data);
            head=temp;
            tail=temp;
        }
        else{
            temp=new Node(data);
            temp.next=head;
            head=temp;
        }
    }
    public void insertAtEnd(int data){
        if(head == null){
            temp=new Node1(data);
            head=temp;
            tail=temp;
        }else{
            temp=new Node1(data);
            tail.next=temp;
            tail=temp;
        }
    }
    public void insertAtPos(int data,int pos){
        if(pos ==1){
            insertStart(data);
            return ;
        }
        int count=length(head);
        if(count == pos){
            insertAtEnd(data);
            return;
            
        }
        temp=head;
        for(int i=1;i<pos-1;i++){
            temp=temp.next;
        }
        Node temp1=new Node(data);
        temp1.next=temp.next;
        temp.next=temp1;
    }
    
    public void deleteAtStart(){
        if(head==null){
            return ;
        }else{
            temp=head;
            head=head.next;
            temp.next=null;     
        }
    }
    public void deleteAtEnd(){
        if(head== null){
            return ;
        }else{
            temp=head;
            while(temp!= null && temp.next!=tail){
                temp=temp.next;
            }
            temp.next=null;
            tail=temp;
            
        }
    }

}


public class LinkedListAllOperation {
    
    public static void main(String[] args) {
        Node LS=new Node();
        LS.Create(10);LS.Create(20);LS.Create(30);LS.Create(40);
        LS.display();
        LS.deleteAtEnd();
        LS.display();
        
        
         
        
    }

}
*/


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LinkedList;

/**
 *
 * @author venkatesh
 */
class Node1 {
    
    private int data;
    private Node1 next;
    
    public Node1() {
        this.data = 0;
        this.next = null;
    }
    
    public Node1(int data) {
        this.data = data;
        this.next = null;
    }
    
    private Node1 head;
    private Node1 tail;
    private Node1 temp;
    
    public void Create(int data) {
        if (head == null) {
            temp = new Node1(data);
            head = temp;
            tail = temp;
        } else {
            temp = new Node1(data);
            tail.next = temp;
            tail = temp;
        }
    }
    
    public int length(Node1 head) {
        temp = head;
        int count = 0;
        if (head == null) {
            return count;
        }
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }
    
    public void display() {
        temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println(" ");
    }
    
    public void insertStart(int data) {
        if (head == null) {
            temp = new Node1(data);
            head = temp;
            tail = temp;
        } else {
            temp = new Node1(data);
            temp.next = head;
            head = temp;
        }
    }
    
    public void insertAtEnd(int data) {
        if (head == null) {
            temp = new Node1(data);
            head = temp;
            tail = temp;
        } else {
            temp = new Node1(data);
            tail.next = temp;
            tail = temp;
        }
    }
    
    public void insertAtPos(int data, int pos) {
        if (pos == 1) {
            insertStart(data);
            return;
        }
        int count = length(head);
        if (count == pos) {
            insertAtEnd(data);
            return;
        }
        temp = head;
        for (int i = 1; i < pos - 1; i++) {
            temp = temp.next;
        }
        Node1 temp1 = new Node1(data);
        temp1.next = temp.next;
        temp.next = temp1;
    }
    
    public void deleteAtStart() {
        if (head == null) {
            return;
        } else {
            temp = head;
            head = head.next;
            temp.next = null;
        }
    }
    
    public void deleteAtEnd() {
        if (head == null) {
            return;
        } else {
            temp = head;
            while (temp != null && temp.next != tail) {
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;
        }
    }
    
}

public class LinkedListAllOperation {
    
    public static void main(String[] args) {
        Node1 LS = new Node1();
        LS.Create(10);
        LS.Create(20);
        LS.Create(30);
        LS.Create(40);
        LS.display();
        LS.deleteAtEnd();
        LS.display();
    }
    
}
