package com.arup.linkedList.dsandalgomadeeasyinjava;

import com.arup.linkedList.leetcode.ListNode;

public class Problem65 {

	public static void main(String[] args) {
		ListNode node5 = new ListNode(2);
		ListNode node4 = new ListNode(3,node5);
		ListNode node3 = new ListNode(4,node4);
		ListNode node2 = new ListNode(5,node3);
		ListNode node1 = new ListNode(1,node2);
		ListNode.printList(node1);
		System.out.println("\nFinal List : ");
		ListNode.printList(partitionList(node1,3));
	}

	private static ListNode partitionList(ListNode head, int value){
		ListNode dummyNode = new ListNode(0, head);
		ListNode previousPointer = dummyNode;
		ListNode afterPointer = new ListNode(0);
		ListNode afterPointerHead = afterPointer;
		ListNode currentPointer = dummyNode;
		ListNode pivotPointer = null;
		
		while(currentPointer.next!=null){
			if(currentPointer.next.val<value){
				previousPointer.next = currentPointer.next;
				previousPointer = previousPointer.next;
			}else if(currentPointer.next.val>value){
				afterPointer.next = currentPointer.next;
				afterPointer = afterPointer.next;
			}else{
				pivotPointer = currentPointer.next;
			}
			currentPointer = currentPointer.next;
		}
		previousPointer.next = pivotPointer;
		pivotPointer.next = afterPointerHead.next;
		afterPointer.next = null;
		
		return dummyNode.next;
	}
}
