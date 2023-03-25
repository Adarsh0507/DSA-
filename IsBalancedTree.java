/* Check for Balanced Tree
-------------------------------

Given a binary tree, find if it is height balanced or not. 
A tree is height balanced if difference between heights of left and right subtrees is not more than one for all nodes of tree. 

A height balanced tree
        1
     /     \
   10      39
  /
5

An unbalanced tree
        1
     /    
   10   
  /
5

Example 1:

Input:
      1
    /
   2
    \
     3 
Output: 0
Explanation: The max difference in height
of left subtree and right subtree is 2,
which is greater than 1. Hence unbalanced


A binary tree node class
class Node
{
	int data;
	Node left,right;
	
	Node(int d)
	{
		data = d;
		left = right = null;		
	}
} */

class Tree
{
    int helper(Node root){
        if(root == null) return 0;
        
        int a = helper(root.left);
        int b = helper(root.right);
        if(a == -1) return -1;
        if(b == -1) return -1;
        
        if(Math.abs(a-b) > 1) return -1;
        
        return Math.max(a,b)+1;
    }
    //Function to check whether a binary tree is balanced or not.
    boolean isBalanced(Node root)
    { 
        if(helper(root)==-1) return false;
        return true;
	
    }
}