/* Binary Tree to DLL
--------------------- 
class Node
class Node
{
	Node left, right;
	int data;
	
	Node(int d)
	{
		data = d;
		left = right = null;
	}
	
    Input:
       10
      /   \
     20   30
   /   \
  40   60
Output:
40 20 60 10 30 
30 10 60 20 40
Explanation:  DLL would be 
40<=>20<=>60<=>10<=>30.
}*/

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeToDLL {
    Queue<Node> q = new LinkedList<>();
    
    void inorder(Node root){
        if(root == null) return ;
        inorder(root.left);
        q.add(root);
        inorder(root.right);
    }
    
    //Function to convert binary tree to doubly linked list and return it.
    Node bToDLL(Node root)
    {
        inorder(root);
        
        root = q.poll();
        Node pre = root;
        root.right = q.peek();
        while(!q.isEmpty()){
            
            
            Node temp = q.poll();
            temp.right = q.peek();
            temp.left  = pre;
            pre = temp;
            
            
        }
        return root;
    }
    
}
