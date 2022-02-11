package com.arup.linkedList.chapter3;

import java.util.Hashtable;

import com.arup.linkedList.chapter3.LinkedList.Node;

public class Problem8 {
	/**
	 * Find if the list is a circular Linked list using hashtable
	 */
	static LinkedList sampleList;
	static int counter = 1;
	static{
		sampleList = new LinkedList();
		sampleList.insertNode(sampleList, 5);
		sampleList.insertNode(sampleList, 1);
		sampleList.insertNode(sampleList, 17);
		sampleList.insertNode(sampleList, 4);
		sampleList.insertNode(sampleList, 17);
	}
	
	public static void main(String[] args){
		Hashtable<Integer,Node> table = new Hashtable<>();
		Node currentNode = sampleList.head;
		while(currentNode!=null){
			if(table.contains(currentNode.data)){
				System.out.println("List is a Circular Linked List");
				return;
			} else {
				table.put(currentNode.data, currentNode);
				currentNode = currentNode.next;
			}
		}
		System.out.println("List is not a Circular Linked List");
	}
}
