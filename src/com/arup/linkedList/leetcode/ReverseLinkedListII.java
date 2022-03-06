package com.arup.linkedList.leetcode;

import com.arup.linkedList.dsandalgomadeeasyinjava.LinkedList;

/**
 * 92. Reverse Linked List II
 * 
 * @author arupdutta
 *
 */
public class ReverseLinkedListII {
	
	static LinkedList sampleList1;

	public static void main(String[] args) {
		ListNode node5 = new ListNode(5);
		ListNode node4 = new ListNode(4,node5);
		ListNode node3 = new ListNode(3,node4);
		ListNode node2 = new ListNode(2,node3);
		ListNode node1 = new ListNode(1,node2);
		ListNode.printList(node1);
		System.out.println("\nFinal List : ");
		
		ListNode.printList(reverseBetween(node1,2,4));
	}
	
	public static ListNode reverseBetween(ListNode head, int left, int right) {
        if(head==null){
        	return null;
        }

        ListNode dummy = new ListNode(0,head);
        ListNode previous = dummy;
		ListNode current = head;
		
		//Step 1 : move pointers till the start of left pointer
		for(int i=1;i<left;i++){
			previous = current;
			current = current.next;
		}
		
		//Step 2 : reverse the linked list from left pointer till right pointer
		ListNode leftPrevious = previous;
		previous = null;
		for(int i=0;i<right-left+1;i++){
			ListNode temp = current.next;
			current.next = previous;
			previous = current;
			current = temp;
		}
		
		//Step 3 : assign the pointers to be part of the larger linked list
		leftPrevious.next.next = current;
		leftPrevious.next = previous;

		return dummy.next;
    }

}
