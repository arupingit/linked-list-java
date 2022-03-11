package com.arup.linkedList.ctci.chapter2;

import com.arup.linkedList.leetcode.ListNode;

public class Problem2_3 {

	public static void main(String[] args) {
		ListNode node5 = new ListNode(5);
		ListNode node4 = new ListNode(4,node5);
		ListNode node3 = new ListNode(3,node4);
		ListNode node2 = new ListNode(2,node3);
		ListNode node1 = new ListNode(1,node2);
		ListNode.printList(node1);
		System.out.println("\nFinal List : ");
		
		removeMiddleNode(node3);
		ListNode.printList(node1);
	}
	
	private static void removeMiddleNode(ListNode node){
		ListNode dummyNode = new ListNode(0, node);
		while(node.next!=null){
			node.val = node.next.val;
			node = node.next;
			dummyNode = dummyNode.next;
		}
		dummyNode.next = null;
	}
}
