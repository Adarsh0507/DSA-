/* Nth Node from the end of the LinkedList
--------------------------------------------
Given a linked list consisting of L nodes and given a number N. 
The task is to find the Nth node from the end of the linked list.

Example 1:

Input:
N = 2
LinkedList: 1->2->3->4->5->6->7->8->9
Output: 8
Explanation: In the first example, there
are 9 nodes in linked list and we need
to find 2nd node from end. 2nd node
from end is 8.  

Structure of node

class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}
*/


public class NthNodeFromEnd {
    int getNthFromLast(Node head, int n)
    {
    	Node ptr = head;
    	int count = 0;
    	while(ptr != null){
    	    count++;
    	    ptr = ptr.next;
    	}
    	
    	if(count<n)
    	    return -1;
    	
    	ptr = head;
    	count = count-n;
    	while(count>0){
    	    ptr = ptr.next;
    	    count--;
    	}
    	return ptr.data;
    }
    
}
