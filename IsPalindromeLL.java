/* Check if Linked List is Palindrome
-------------------------------------

Example 1:

Input:
N = 3
value[] = {1,2,1}
Output: 1
Explanation: The given linked list is
1 2 1 , which is a palindrome and
Hence, the output is 1.

Structure of class Node is
class Node
{
	int data;
	Node next;
	
	Node(int d)
	{
		data = d;
		next = null;
	}
}*/



public class IsPalindromeLL {
    boolean isPalindrome(Node head) 
    {
        ArrayList<Integer> arr = new ArrayList<>();
        Node ptr = head;
        int n = 0;
        while(ptr!=null){
            n++;
            arr.add(ptr.data);
            ptr = ptr.next;
        }
        
        for(int i = 0 ; i < n ; i++){
            if(arr.get(i) != arr.get(n-i-1))
                return false;
        }
        return true;
    }    
    
}
