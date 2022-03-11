package com.arup.linkedList.ctci.chapter2;

import com.arup.linkedList.leetcode.ListNode;

public class Problem2_5 {

	public static void main(String[] args) {
		System.out.println("\nFirst List : ");
		ListNode node6 = new ListNode(6);
		ListNode node1 = new ListNode(1,node6);
		ListNode node7 = new ListNode(7,node1);
		ListNode.printList(node7);

		System.out.println("\nSecond List : ");
		ListNode node2 = new ListNode(2);
		ListNode node9 = new ListNode(9,node2);
		ListNode node5 = new ListNode(5,node9);
		ListNode.printList(node5);
		System.out.println("\nFinal list : ");
		ListNode.printList(addLinkedList(node7,node5));
	}
	
	private static ListNode addLinkedList(ListNode list1, ListNode list2){
		ListNode dummyNode = new ListNode(0);
		ListNode previousNode = dummyNode;
		int node1Val = 0;
		int node2Val = 0;
		int carrier = 0;
		int value = 0;
		int nodeValue;
		while(list1!=null || list2!=null){
			
			if(list1==null || list2==null){
				if(list1==null){
					node1Val = 0;
				}
				if(list2==null){
					node2Val = 0;
				}				
			} else {
				node1Val = list1.val;
				node2Val = list2.val;
			}
			value = node1Val + node2Val + carrier;
			carrier = value/10;
			nodeValue = value%10;
			list1 = list1.next;
			list2 = list2.next;
			previousNode.next = new ListNode(nodeValue);
			previousNode = previousNode.next;
		}
		return dummyNode.next;
	}
}
