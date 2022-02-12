package com.arup.linkedList.chapter3;

import com.arup.linkedList.chapter3.LinkedList.Node;

public class Problem12 {
	/**
	 * Floyd's algorithm find node with start of the loop
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
				slowPointer = sampleList.head;
				while(slowPointer != fastPointer){
					slowPointer = slowPointer.next;
					fastPointer = fastPointer.next;
				}
				System.out.println("the node with start of the loop is : "+ slowPointer.data);
				return;
			}
		}
		System.out.println("List is not a Circular Linked List");
	}
}
