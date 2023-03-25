/*ZigZag Tree Traversal
------------------------
Given a Binary Tree. Find the Zig-Zag Level Order Traversal of the Binary Tree.

 

Example 1:

Input:
        1
      /   \
     2     3
    / \   /  \
   4   5 6    7
Output:
1 3 2 4 5 6 7



class Node
{
    int data;
    Node left,right;
    Node(int d)
    {
        data=d;
        left=right=null;
    }  
}*/

class GFG
{
    //Function to store the zig zag order traversal of tree in a list.
	ArrayList<Integer> zigZagTraversal(Node root)
	{   
	    ArrayList<Integer> ans = new ArrayList<>();
	    Stack<Node> s1 = new Stack<>();
	    Stack<Node> s2 = new Stack<>();
	    s1.push(root);
	    
	    while(s1.isEmpty() == false || s2.isEmpty() == false){
	       
	        while(!s1.isEmpty()){
	            
	            Node n = s1.pop();
	            ans.add(n.data);
	            
	            if(n.left != null) s2.push(n.left);
	            if(n.right != null) s2.push(n.right);
	        }
	       
	        while(!s2.isEmpty()){
	            Node n = s2.pop();
	            ans.add(n.data);
	            if(n.right != null) s1.push(n.right);
	            if(n.left != null) s1.push(n.left);
	            
	        }
	    }
	    return ans;
	}
}