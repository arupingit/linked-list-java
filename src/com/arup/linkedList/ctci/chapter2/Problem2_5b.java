package com.arup.linkedList.ctci.chapter2;

import com.arup.linkedList.leetcode.ListNode;

public class Problem2_5b {
	
	public static void main(String[] args) {
		System.out.println("\nFirst List : ");
		ListNode node6 = new ListNode(7);
		ListNode node1 = new ListNode(1,node6);
		ListNode node7 = new ListNode(6,node1);
		ListNode.printList(node7);

		System.out.println("\nSecond List : ");
		ListNode node2 = new ListNode(5);
		ListNode node9 = new ListNode(9,node2);
		ListNode node5 = new ListNode(2,node9);
		ListNode.printList(node5);
		System.out.println("\nFinal list : ");
		ListNode.printList(addLinkedList(node7,node5));
	}

	private static ListNode addLinkedList(ListNode list1, ListNode list2){
		int firstNumber = 0;
		int secondNumber = 0;
		ListNode dummyNode = new ListNode(0, null);
		ListNode currentNode = null;
		
		while(list1!=null){
			firstNumber = firstNumber*10 + list1.val;
			list1 = list1.next;
		}
		while(list2!=null){
			secondNumber = secondNumber*10 + list2.val;
			list2 = list2.next;
		}
		int finalResult = firstNumber + secondNumber;
		while(finalResult!=0){
			int value = finalResult%10;
			dummyNode.next = new ListNode(value,currentNode);
			currentNode = dummyNode.next;
			finalResult = finalResult/10;
		}
		return dummyNode.next;
	}
}
