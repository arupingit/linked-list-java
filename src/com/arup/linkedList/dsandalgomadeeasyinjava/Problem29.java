package com.arup.linkedList.dsandalgomadeeasyinjava;

import com.arup.linkedList.dsandalgomadeeasyinjava.LinkedList.Node;

public class Problem29 {
	/**
	 * Display the linked list from end
	 */
	static LinkedList sampleList;
	
	static{
		sampleList = new LinkedList();
		sampleList.insertNode(sampleList, 5);
		sampleList.insertNode(sampleList, 1);
		sampleList.insertNode(sampleList, 17);
		sampleList.insertNode(sampleList, 4);
		sampleList.insertNode(sampleList, 7);
	}

	public static void main(String[] args) {
		displayLinkedListFromEnd(sampleList.head,sampleList);
	}
	
	public static void displayLinkedListFromEnd(Node head, LinkedList list){
		if(head==null){
			return;
		}
		displayLinkedListFromEnd(head.next,list);
		System.out.println(head);
	}

}
