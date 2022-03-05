package com.arup.linkedList.leetcode;

import com.arup.linkedList.dsandalgomadeeasyinjava.LinkedList;

/**
 * 206. Reverse Linked List
 * 
 * @author arupdutta
 *
 */
public class ReverseLinkedListIteratively {
	
	static LinkedList sampleList1;

	public static void main(String[] args) {
		ListNode node5 = new ListNode(5);
		ListNode node4 = new ListNode(4,node5);
		ListNode node3 = new ListNode(3,node4);
		ListNode node2 = new ListNode(2,node3);
		ListNode node1 = new ListNode(1,node2);
		ListNode.printList(node1);
		System.out.println("\n Iterative Solution : ");
		ListNode.printList(reverseList(node1));
	}
	
	public static ListNode reverseList(ListNode head) {
		ListNode tracker = null;
		ListNode temp;
		while(head!=null){
			temp = head.next;
			head.next = tracker;
			tracker = head;
			head = temp;
		}
		return tracker;
    } 
}
