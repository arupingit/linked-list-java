package com.arup.linkedList.leetcode;

/**
 * 24. Swap Nodes in Pairs
 * https://leetcode.com/problems/swap-nodes-in-pairs/
 * 
 * @author arupdutta
 *
 */
public class SwapNodesInPairs {

	public static void main(String[] args) {
		ListNode node5 = new ListNode(5);
		ListNode node4 = new ListNode(4,node5);
		ListNode node3 = new ListNode(3,node4);
		ListNode node2 = new ListNode(2,node3);
		ListNode node1 = new ListNode(1,node2);
		ListNode.printList(node1);
		
		System.out.println("\nFinal List : ");
		
		ListNode.printList(swapPairs(node1));
	}

	public static ListNode swapPairs(ListNode head) {
		ListNode dummy = new ListNode(0, head);
		ListNode current = dummy;
		while(current.next!=null && current.next.next!=null){
			ListNode firstNode = current.next;
			ListNode secondNode = current.next.next;
			
			current.next = secondNode;
			firstNode.next = secondNode.next;
			secondNode.next = firstNode;
			
			current = current.next.next;
		}
		
		return dummy.next;
    }
}
