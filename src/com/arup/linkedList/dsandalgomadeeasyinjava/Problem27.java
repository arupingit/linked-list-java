package com.arup.linkedList.dsandalgomadeeasyinjava;

import java.util.Hashtable;

import com.arup.linkedList.dsandalgomadeeasyinjava.LinkedList.Node;

public class Problem27 {
	/**
	 * Find middle of linked list using hashtable
	 */
static LinkedList sampleList;
	
	static{
		sampleList = new LinkedList();
		sampleList.insertNode(sampleList, 5);
		sampleList.insertNode(sampleList, 1);
		sampleList.insertNode(sampleList, 17);
		sampleList.insertNode(sampleList, 4);
		sampleList.insertNode(sampleList, 7);
		sampleList.insertNode(sampleList, 8);
	}


	public static void main(String[] args) {
		Hashtable<Integer,Node> table = new Hashtable<>();
		int counter=0;
		Node currentNode = sampleList.head;
		while(currentNode!=null){
			table.put(++counter, currentNode);
			currentNode = currentNode.next;
		}
		
		if(counter%2==0){
			// if size is even
			System.out.println("Middle emlements of the list are : ");
			System.out.println(table.get(counter/2).data);
			System.out.println(table.get((counter+2)/2).data);
		} else {
			// if size is odd
			System.out.println("Middle element of the list is : ");
			System.out.println(table.get((counter+1)/2).data);
		}
	}
}
