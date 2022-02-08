package com.arup.linkedList.chapter3;

public class LinkedList {

	Node head;
	
	static class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
		}
	}
	
	/**
	 * insert Node method
	 */
	public static LinkedList insertNode(LinkedList list, int data){
		
		if(list.head == null){
			//empty list
			list.head =  new Node(data);
		} else {
			//when list is not empty
			Node last = list.head;
			while(last.next != null){
				last = last.next;
			}
			last.next = new Node(data);
		}
		return list;
	}
	
	/**
	 * print linked list
	 */
	public static void printList(LinkedList list){
		if(list.head == null){
			System.out.println("Empty List");
		} else {
			Node currentNode = list.head;
			while(currentNode!=null){
				System.out.print(currentNode.data + ",");
				currentNode = currentNode.next;
			}
		}
	}
	
	/** 
	 * get linked list length
	 */
	public static int getLength(LinkedList list){
		int length = 0;
		if(list.head == null){
			return length;
		} 
		Node currentNode = list.head;
		while(currentNode!=null){
			length++;
			currentNode = currentNode.next;
		}
		return length;
	}
	
}
