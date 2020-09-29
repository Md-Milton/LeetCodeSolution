/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedList;

/**
 *
 * @author milton
 */
public class ReverseLinkedList {
        class Node {

    private int data;
    private Node next;

    public Node(int d, Node n) {
        this.data = d;
        this.next = n;
    }

    public Node(int d) {
        this.data = d;

    }
}
     public static Node reverse(Node head){
        Node curr = head;
        Node prev = null;
        Node next = null;
        
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head=prev;
        return head;
    }
}
