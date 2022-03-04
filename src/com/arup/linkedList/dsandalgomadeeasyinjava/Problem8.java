package com.arup.linkedList.dsandalgomadeeasyinjava;

import java.util.Hashtable;

import com.arup.linkedList.dsandalgomadeeasyinjava.LinkedList.Node;

public class Problem8 {
	/**
	 * Find if the list is a circular Linked list using hashtable
	 */
	static LinkedList sampleList;
	static int counter = 1;
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
		Hashtable<Integer,Node> table = new Hashtable<>();
		Node currentNode = sampleList.head;
		while(currentNode!=null){
			Node temp = table.get(currentNode.data);
			if(temp!=null && temp.equals(currentNode)){
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
