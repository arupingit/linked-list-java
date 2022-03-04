package com.arup.linkedList.dsandalgomadeeasyinjava;

import com.arup.linkedList.dsandalgomadeeasyinjava.LinkedList.Node;

public class Problem6 {
	
	static LinkedList sampleList;
	
	static{
		sampleList = new LinkedList();
		sampleList.insertNode(sampleList, 5);
		sampleList.insertNode(sampleList, 1);
		sampleList.insertNode(sampleList, 17);
		sampleList.insertNode(sampleList, 4);
	}
	
	static int counter =0;

	public static void main(String[] args) {
		LinkedList.printList(sampleList);
		System.out.println("\nResult : " +findNthNodeFromEnd(sampleList.head,2));
	}
	
	private static Node findNthNodeFromEnd(Node head, int n){
		Node result = null;
		if(head!=null){
			result = findNthNodeFromEnd(head.next,n);
		}
		counter++;
		if(counter==n+1){
			return head;
		}
		return result;
	}

}
