package com.arup.linkedList.leetcode;

/**
 * 25. Reverse Nodes in k-Group
 * https://leetcode.com/problems/reverse-nodes-in-k-group/
 * 
 * @author arupdutta
 *
 */
public class ReverseNodesInKGroup {

	public static void main(String[] args) {
		ListNode node5 = new ListNode(5);
		ListNode node4 = new ListNode(4,node5);
		ListNode node3 = new ListNode(3,node4);
		ListNode node2 = new ListNode(2,node3);
		ListNode node1 = new ListNode(1,node2);
		ListNode.printList(node1);
		System.out.println("\nFinal List : ");
		ListNode.printList(reverseKGroup(node1,3));
	}

	public static ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummyNode = new ListNode(0, head);
        ListNode groupPrevious = dummyNode;
        ListNode groupNext;
        ListNode kthNode;
        ListNode prev,curr;
        ListNode tmp;
        
        while(true){
        	kthNode = findKthNode(groupPrevious,k); 
        	if(kthNode==null){
        		break;
        	}
        	groupNext = kthNode.next;
        	prev = kthNode.next;
        	curr = groupPrevious.next;
        	while(curr!=groupNext){
        		ListNode temp =  curr.next;
        		curr.next = prev;
        		prev = curr;
        		curr = temp;
        	}
        	tmp = groupPrevious.next;
        	groupPrevious.next = kthNode;
        	groupPrevious = tmp;
        }
        
        return dummyNode.next;
    }
	
	private static ListNode findKthNode(ListNode currentNode, int k){
		int counter = 0;
		while(currentNode!=null && counter<k){
			currentNode = currentNode.next;
			counter++;
		}
		if(k==counter){
			return currentNode;
		}
		return null;
	}	
}
