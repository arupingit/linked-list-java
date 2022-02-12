package com.arup.linkedList.chapter3;

import java.util.Hashtable;

import com.arup.linkedList.chapter3.LinkedList.Node;

public class Problem20 {
	/**
	 * Intersecting linked list find intersecting node using hashtable
	 */
	static LinkedList sampleList1;
	static LinkedList sampleList2;
	static{
		//create circular list
		sampleList1 = new LinkedList();
		sampleList2 = new LinkedList();
		Node node1 =  new Node(1);
		Node node3 =  new Node(3);
		Node node4 =  new Node(4);
		Node node5 =  new Node(5);
		Node node6 =  new Node(6);
		Node node7 =  new Node(7);
		LinkedList.insertNode(sampleList1, node1);
		LinkedList.insertNode(sampleList1, node3);
		LinkedList.insertNode(sampleList2, node4);
		LinkedList.insertNode(sampleList2, node5);
		LinkedList.insertNode(sampleList2, node6);
		LinkedList.insertNode(sampleList1, node6);
		LinkedList.insertNode(sampleList1, node7);
	}

	public static void main(String[] args) {
		System.out.println(" sampleList1 : ");
		LinkedList.printList(sampleList1);
		System.out.println("\n sampleList2 : ");
		LinkedList.printList(sampleList2);
		Node pointer1 = sampleList1.head;
		Hashtable<Node,Integer> table = new Hashtable<>(); 
		while(pointer1!=null){
			table.put(pointer1, pointer1.data);
			pointer1 = pointer1.next;
		}
		Node pointer2 = sampleList2.head;
		while(pointer2!=null){
			if(table.get(pointer2)!=null){
				System.out.println("\n Intersecting node found : "+pointer2.data);
				return;
			}
			pointer2 = pointer2.next;
		}
	}
}
