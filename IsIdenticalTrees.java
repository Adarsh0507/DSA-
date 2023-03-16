/*Determine if Two Trees are Identical
--------------------------------------
class Node{
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=right=null;
    }
}
Input:
     1          1
   /   \      /   \
  2     3    2     3
Output: Yes
Explanation: There are two trees both
having 3 nodes and 2 edges, both trees
are identical having the root as 1,
left child of 1 is 2 and right child
of 1 is 3.
*/

public class IsIdenticalTrees {
     //Function to check if two trees are identical.
    boolean isIdentical(Node root1, Node root2)
	{   
	    if(root1 == null && root2 == null) return true;
	    if(root1 == null && root2 != null) return false;
	    if(root1 != null && root2 == null) return false; 
	    if(root1.data != root2.data) return false;
	    
	    if(!isIdentical(root1.left , root2.left)) return false;
	    if(!isIdentical(root1.right , root2.right)) return false;
	    
	    return true;
	}
    
}
