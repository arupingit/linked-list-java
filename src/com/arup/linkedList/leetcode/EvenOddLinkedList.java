package com.arup.linkedList.leetcode;

public class EvenOddLinkedList {

	public static void main(String[] args) {
		ListNode node5 = new ListNode(5);
		ListNode node4 = new ListNode(4,node5);
		ListNode node3 = new ListNode(3,node4);
		ListNode node2 = new ListNode(2,node3);
		ListNode node1 = new ListNode(1,node2);
		ListNode.printList(node1);
		System.out.println("\nFinal List : ");
		ListNode.printList(evenOddList(node1));
	}

	public static ListNode evenOddList(ListNode head) {
		ListNode oddPointer = head;
		
		ListNode evenPointer = new ListNode(0,head);
		ListNode evenHead = head.next;
		
		while(oddPointer!=null && oddPointer.next!=null){
			evenPointer.next = oddPointer.next;
			evenPointer = oddPointer.next;
			oddPointer.next = evenPointer.next;
			oddPointer = evenPointer.next;
		}
		evenPointer.next = head;		
		return evenHead;
	}
}
