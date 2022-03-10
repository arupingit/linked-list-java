package com.arup.linkedList.leetcode;

/**
 * 
 * Odd Even Linked List
 * https://leetcode.com/problems/odd-even-linked-list/
 * 
 * @author arupdutta
 *
 */
public class OddEvenLinkedList {

	public static void main(String[] args) {
		ListNode node5 = new ListNode(5);
		ListNode node4 = new ListNode(4,node5);
		ListNode node3 = new ListNode(3,node4);
		ListNode node2 = new ListNode(2,node3);
		ListNode node1 = new ListNode(1,node2);
		ListNode.printList(node1);
		System.out.println("\nFinal List : ");
		ListNode.printList(oddEvenList(node1));
	}
	
	public static ListNode oddEvenList(ListNode head) {
		if(head==null){
			return head;
		}
		
		ListNode odd = head;
		ListNode even = head.next;
		ListNode evenHead = even;
		
		while(even!=null && even.next!=null){
			odd.next = even.next;
			odd = even.next;
			even.next = odd.next;
			even = odd.next;
		}
		odd.next = evenHead;
		
		return head;
    }

}
