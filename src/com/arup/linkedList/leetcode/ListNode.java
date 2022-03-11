package com.arup.linkedList.leetcode;

/**
 * Definition for singly-linked list. 
 *
 * @author arupdutta
 *
 */
public class ListNode {
	 public int val;
	 public ListNode next;
	 ListNode() {}
	 public ListNode(int val) { this.val = val; }
	 public ListNode(int val, ListNode next) { this.val = val; this.next = next; }

	 
	 /* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ListNode [" + val + "]";
	}
	
	public static void printList(ListNode head){
		 while(head!=null){
			 System.out.print(head + "-->");
			 head=head.next;
		 }
	 }
	
}
