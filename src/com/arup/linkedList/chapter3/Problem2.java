/**
 * 
 */
package com.arup.linkedList.chapter3;

import com.arup.linkedList.chapter3.LinkedList.Node;

/**
 * @author arupdutta
 *
 */
public class Problem2 {
	
	static LinkedList sampleList;
	
	static{
		sampleList = new LinkedList();
		sampleList.insertNode(sampleList, 5);
		sampleList.insertNode(sampleList, 1);
		sampleList.insertNode(sampleList, 17);
		sampleList.insertNode(sampleList, 4);
	}

	/**Problem Statement ## 
	 * Find the n'th node from the end of a Linked List 
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Initial List : ");
		LinkedList.printList(sampleList);
		
		System.out.println();
		Integer data = findNthNode(sampleList, 3);
		if(data==null){
			System.out.println("list length is shorth");
		} else {
			System.out.println("data : "+ data);
		}
	}
	
	private static Integer findNthNode(LinkedList list, int n){
		int length = LinkedList.length;
		if(length < n){
			return null;
		} 
		Node currentNode  = list.head;
		for(int i=1; i<=length-n; i++){
			currentNode = currentNode.next;
		}
		return currentNode.data;
	}

}
