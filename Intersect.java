/* Intersection Point in Y Shaped Linked Lists
------------------------------------------------
Example 1:

Input:
LinkList1 = 3->6->9->common
LinkList2 = 10->common
common = 15->30->NULL
Output: 15
Explanation:
Y ShapedLinked List


Node of a linked list
 class Node {
   int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}
 Linked List class
class LinkedList
{
    Node head;  // head of list
}*/

class Intersect
{
    //Function to find intersection point in Y shaped Linked Lists.
	int intersectPoint(Node head1, Node head2)
	{
        Set<Node> set = new HashSet<>();
        Node ptr = head1;
        
        while(ptr!=null){
            set.add(ptr);
            ptr = ptr.next;
        }
        
        ptr = head2;
        while(ptr!=null){
            if(set.contains(ptr)) return ptr.data;
            
            ptr = ptr.next;
        }
        return -1;
	}
}
