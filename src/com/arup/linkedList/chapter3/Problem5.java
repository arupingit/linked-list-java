package com.arup.linkedList.chapter3;

import com.arup.linkedList.chapter3.LinkedList.Node;

public class Problem5 {

	static LinkedList sampleList;
	
	static{
		sampleList = new LinkedList();
		sampleList.insertNode(sampleList, 5);
		sampleList.insertNode(sampleList, 1);
		sampleList.insertNode(sampleList, 17);
		sampleList.insertNode(sampleList, 4);
	}
	
	/**
	 * Find Nth node with one scan  
	 * 
	 * @param args
	 */
	public static void main(String[] args){
		Integer result = findNthNode(sampleList, 2);
		if(result==null){
			System.out.println("List is shorter");
		} else {
			System.out.println("result : " + result);
		}
	}
	
	private static Integer findNthNode(LinkedList list, int n){
		Node currentNode = null;
		Node finalNode = null;
		
		currentNode = list.head;
		int counter = 1;
		while(currentNode!=null && counter<n){
			currentNode = currentNode.next;
			counter++;
		}
		while(currentNode!=null){
			currentNode = currentNode.next;
			if(finalNode==null){
				finalNode = sampleList.head;
			} else {
				finalNode = finalNode.next;
			}
		}
		if(finalNode==null){
			return null;
		}
		return finalNode.data;
	}
}
