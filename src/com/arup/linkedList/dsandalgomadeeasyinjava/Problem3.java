package com.arup.linkedList.dsandalgomadeeasyinjava;

import java.util.Hashtable;

import com.arup.linkedList.dsandalgomadeeasyinjava.LinkedList.Node;

public class Problem3 {

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
	 * Using hashtable
	 * 
	 * @param String[]
	 */
	public static void main(String[] args){
		int n = 2;
		Hashtable<Integer,Integer> table = new Hashtable();
		
		Node currentNode =  sampleList.head;
		int length = 0;
		while(currentNode!=null){
			table.put(++length, currentNode.data);
			currentNode = currentNode.next;
		}
		Integer result = findNthNode(table, sampleList.length - n +1);
		if(result == null){
			System.out.println("List is shorter");
		} else {
			System.out.println("result : " + result);
		}
	}
	
	private static Integer findNthNode(Hashtable<Integer,Integer> table, int n){
		return table.get(n);
	}
}
