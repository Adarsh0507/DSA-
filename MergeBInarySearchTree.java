/* Merge two BST 's
--------------------

Example 1:

Input:
BST1:
       5
     /   \
    3     6
   / \
  2   4  
BST2:
        2
      /   \
     1     3
            \
             7
            /
           6
Output: 1 2 2 3 3 4 5 6 6 7
Explanation: 
After merging and sorting the
two BST we get 1 2 2 3 3 4 5 6 6 7.


class Node  
{ 
    int data; 
    Node left, right; 
   
    public Node(int d)  
    { 
        data = d; 
        left = right = null; 
    } 
}
    
*/



public class MergeBInarySearchTree {
    void helper(Node root ,List<Integer> ans){
        if(root == null) return;
        helper(root.left,ans);
        ans.add(root.data);
        helper(root.right , ans);
    }
    //Function to return a list of integers denoting the node 
    //values of both the BST in a sorted order.
    public List<Integer> merge(Node root1,Node root2)
    {   List<Integer> ans = new ArrayList<>();
        helper(root1 ,ans);
        helper(root2 , ans);
        Collections.sort(ans);
        return ans;
    }
    
}
