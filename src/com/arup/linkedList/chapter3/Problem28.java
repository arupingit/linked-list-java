package com.arup.linkedList.chapter3;

import com.arup.linkedList.chapter3.LinkedList.Node;

public class Problem28 {
	/**
	 * Find middle of linked list with single scan
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
		Node fastPointer,slowPointer;
		fastPointer = slowPointer = sampleList.head;
		int i = 0;
		while(fastPointer.next!=null){
			if(i==0){
				fastPointer = fastPointer.next;
				i=1;
			}
			if(i==1){
				slowPointer = slowPointer.next;
				fastPointer = fastPointer.next;
				i=0;
			}
		}
		System.out.println("Middle of the list : "+slowPointer.data);
	}
}
