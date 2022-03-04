package com.arup.linkedList.dsandalgomadeeasyinjava;

public class LinkedList {

	Node head;
	static int length;
	
	static class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
		}

		/* (non-Javadoc)
		 * @see java.lang.Object#hashCode()
		 */
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + data;
			result = prime * result + ((next == null) ? 0 : next.hashCode());
			return result;
		}

		/* (non-Javadoc)
		 * @see java.lang.Object#equals(java.lang.Object)
		 */
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Node other = (Node) obj;
			if (data != other.data)
				return false;
			if (next == null) {
				if (other.next != null)
					return false;
			} else if (!next.equals(other.next))
				return false;
			return true;
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
		length++;
		return list;
	}
	
	public static LinkedList insertNode(LinkedList list, Node node){
		if(list.head == null){
			//empty list
			list.head = node;
		} else {
			//when list is not empty
			Node last = list.head;
			while(last.next != null){
				last = last.next;
			}
			last.next = node;
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
}
