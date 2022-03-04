package com.arup.linkedList.dsandalgomadeeasyinjava;

import com.arup.linkedList.dsandalgomadeeasyinjava.LinkedList.Node;

public class Problem10 {
	/**
	 * Floyd's algorithm
	 */
	static LinkedList sampleList;
	static{
		//create circular list
		sampleList = new LinkedList();
		Node node1 =  new Node(5);
		Node node2 =  new Node(1);
		Node node3 =  new Node(17);
		Node node4 =  new Node(4);
		sampleList.insertNode(sampleList, node1);
		sampleList.insertNode(sampleList, node2);
		sampleList.insertNode(sampleList, node3);
		sampleList.insertNode(sampleList, node4);
		sampleList.insertNode(sampleList, node2);
	}
	public static void main(String[] args){
		Node slowPointer = sampleList.head;
		Node fastPointer = sampleList.head;
		while(fastPointer!=null && fastPointer.next!=null){
			slowPointer = slowPointer.next;
			fastPointer = fastPointer.next.next;
			if(slowPointer==fastPointer){
				System.out.println("List is a Circular Linked List");
				return;
			}
		}
		System.out.println("List is not a Circular Linked List");
	}
}
