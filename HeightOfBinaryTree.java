//User function Template for Java

/* 
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
Input:
     1
    /  \
   2    3
Output: 2
 */

public class HeightOfBinaryTree {
    
    int count = 0 ;
    //Function to find the height of a binary tree.
    int height(Node root) 
    {
        if(root == null) return count;
            
        return Math.max(height(root.left) , height(root.right))+1;
    }       
}
    

