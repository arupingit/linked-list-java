package com.arup.linkedList.dsandalgomadeeasyinjava;

import com.arup.linkedList.dsandalgomadeeasyinjava.LinkedList.Node;

public class Problem32 {
	/**
	 * Display the linked list from end
	 */
	static LinkedList sampleList1;
	static LinkedList sampleList2;
	static LinkedList mergedList;
	
	static{
		sampleList1 = new LinkedList();
		sampleList1.insertNode(sampleList1, 15);
		sampleList1.insertNode(sampleList1, 25);
		sampleList1.insertNode(sampleList1, 35);
		sampleList1.insertNode(sampleList1, 45);
		
		sampleList2 = new LinkedList();
		sampleList2.insertNode(sampleList2, 11);
		sampleList2.insertNode(sampleList2, 12);
		sampleList2.insertNode(sampleList2, 13);
		sampleList2.insertNode(sampleList2, 14);
		sampleList2.insertNode(sampleList2, 27);
	}
	
	public static void main(String[] args) {
		Node head = mergeSortedList(sampleList1.head,sampleList2.head);
		while(head!=null){
			System.out.println(head);
			head = head.next;
		}
	}
	
	public static Node mergeSortedList(Node head1, Node head2){
		if(head1==null){
			return head2;
		}
		if(head2==null){
			return head1;
		}
		if(head1.data<=head2.data){
			head1.next = mergeSortedList(head1.next, head2);
			return head1;
		}else{
			head2.next = mergeSortedList(head1, head2.next);
			return head2;
		}
	}
}
