package com.arup.linkedList.chapter3;

import com.arup.linkedList.chapter3.LinkedList.Node;

public class Problem17 {
	/**
	 * Reverse singly linked list
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
		Node pointer = sampleList.head;
		if(pointer==null){
			System.out.println("empty list");
			return;
		}
		Node nextPointer = pointer.next;
		//first node
		pointer.next = null;
		while(nextPointer!=null){
			Node var = nextPointer.next;
			nextPointer.next = pointer;
			pointer = nextPointer;
			nextPointer = var;
		}
		sampleList.head = pointer;
		LinkedList.printList(sampleList);
	}
}
