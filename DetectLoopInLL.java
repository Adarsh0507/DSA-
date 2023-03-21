/*Detect Loop in linked list
------------------------------- 
Given a linked list of N nodes. The task is to check if the linked list has a loop. 
Linked list can contain self loop.

Example 1:

Input:
N = 3
value[] = {1,3,4}
x(position at which tail is connected) = 2
Output: True
Explanation: In above test case N = 3.
The linked list with nodes N = 3 is
given. Then value of x=2 is given which
means last node is connected with xth
node of linked list. Therefore, there
exists a loop.
Node is defined as

class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}

*/

import java.util.HashSet;
import java.util.Set;

public class DetectLoopInLL {
    public static boolean detectLoop(Node head){
        Set<Node> set = new HashSet<>();
        Node ptr = head;
        while(ptr != null){
            if(set.contains(ptr)){
                return true;
            }
            set.add(ptr);
            ptr = ptr.next;
        }
        return false;
    }
}
