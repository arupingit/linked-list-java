package com.arup.linkedList.dsandalgomadeeasyinjava;

import com.arup.linkedList.dsandalgomadeeasyinjava.LinkedList.Node;

public class Problem16 {
	/**
	 * Insert node in sorted linked list
	 */
	static LinkedList sampleList;
	static{
		//create circular list
		sampleList = new LinkedList();
		Node node1 =  new Node(1);
		Node node3 =  new Node(3);
		Node node4 =  new Node(4);
		Node node5 =  new Node(5);
		sampleList.insertNode(sampleList, node1);
		sampleList.insertNode(sampleList, node3);
		sampleList.insertNode(sampleList, node4);
		sampleList.insertNode(sampleList, node5);
	}
	public static void main(String[] args){
		Node node2 = new Node(2);
		Node pointer = sampleList.head;
		//Empty list 
		if(pointer==null){
			sampleList.head = node2;
		} else {
			while(pointer.next!=null && !(pointer.data<node2.data && node2.data<=pointer.next.data)){
				pointer = pointer.next;
			}
			node2.next = pointer.next;
			pointer.next = node2;			
		}
		LinkedList.printList(sampleList);
	}
}
