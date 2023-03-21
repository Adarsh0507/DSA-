/*Finding Middle Element in Linked List
---------------------------------------
Example 1:

Input:
LinkedList: 1->2->3->4->5
Output: 3 
Explanation: 
Middle of linked list is 3.

Node of a linked list
 class Node {
   int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}
*/
public class FindMiddleInLL {
    int getMiddle(Node head)
    {
        HashMap<Integer , Integer> map = new HashMap<>();
        
        Node ptr = head;
        int count=0;
        while(ptr!= null){
            count++;
            map.put(count , ptr.data);
            ptr = ptr.next;
        }
        
        return map.get((count/2)+1);
    }
    
}
