package com.arup.linkedList.chapter3;

import com.arup.linkedList.chapter3.LinkedList.Node;

public class Problem17Recursive {
	/**
	 * Reverse singly linked list recursively
	 */
	static LinkedList sampleList;
	
	static{
		sampleList = new LinkedList();
		sampleList.insertNode(sampleList, 5);
		sampleList.insertNode(sampleList, 1);
		sampleList.insertNode(sampleList, 17);
		sampleList.insertNode(sampleList, 4);
	}

	public static void main(String[] args) {
		System.out.println("first list : ");
		LinkedList.printList(sampleList);
		System.out.println("\nsecond list : ");
		reverseList(sampleList.head);
		LinkedList.printList(sampleList);
	}
	
	public static void reverseList(Node current){
		if(current==null){
			return;
		}
		Node var = current.next;
		if(var==null){
			sampleList.head = current;
			return;
		}
		reverseList(var);
		var.next = current;
		current.next = null;
	}
}
