/*
Given a sorted linked list, delete all duplicates such that each element appear only once.

Example 1:

Input: 1->1->2
Output: 1->2

Example 2:

Input: 1->1->2->3->3
Output: 1->2->3

 */
package leetcode.linkedList;

/**
 *
 * @author milton
 */
/*
class Node{
private int data;
private Node next;
public Node(int d,Node n){
this.data = d;
this.next = n;
}
public Node(int d){
this.data = d;
}

*/

public class RemoveDuplicates {
public Node removeDuplicates(Node head){
    Node curr = head;
    while(curr!=null){      //don't traverse using head as it may lose nodes rather use another head reference like here curr
        if(curr.next!=null && curr.data == curr.next.data){
            curr.next = curr.next.next;
        }else{
            curr = curr.next;
        }
    }
    return head; //not curr but head ,, it will traverse the linked list.
    }
}
