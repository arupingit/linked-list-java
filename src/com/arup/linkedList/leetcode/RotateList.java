package com.arup.linkedList.leetcode;


/**
 * 61. Rotate List
 * https://leetcode.com/problems/rotate-list/
 * 
 * @author arupdutta
 *
 */
public class RotateList {

	public static void main(String[] args) {
		ListNode node5 = new ListNode(5);
		ListNode node4 = new ListNode(4,node5);
		ListNode node3 = new ListNode(3,node4);
		ListNode node2 = new ListNode(2,node3);
		ListNode node1 = new ListNode(1,node2);
		ListNode.printList(node1);
		System.out.println("\nFinal List : ");
		
		ListNode.printList(rotateRight(node1,2));
	}
	
	public static ListNode rotateRight(ListNode head, int k) {
		if(head == null){
			return head;
		}
		
		int length =1;
		ListNode tail = head;
		
		while(tail.next!=null){
			tail = tail.next;
			length++;
		}
		
		k = k%length;
		if(k==0){
			return head;
		}
		
		ListNode pivot = head;
		for(int i=0;i<length-k-1;i++){
			pivot = pivot.next;
		}
		
		ListNode newHead = pivot.next;
		pivot.next = null;
		tail.next = head;
		
		return newHead;
    }
	

}
