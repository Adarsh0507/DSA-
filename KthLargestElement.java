/*
class Node
{
    int data;
    Node left;
    Node right;
    Node(int data)
    {
        this.data = data;
        left=null;
        right=null;
    }
}

Input:
      4
    /   \
   2     9
k = 2 
Output: 4
*/

import java.util.ArrayList;

public class KthLargestElement {
    ArrayList<Integer> ele = new ArrayList<Integer>();
    // return the Kth largest element in the given BST rooted at 'root'
    void inorder(Node root){
        if(root == null) return;
       
        
        inorder(root.left);
        ele.add(root.data);
        inorder(root.right);
    }
    public int kthLargest(Node root,int K)
    {
        inorder(root);
        
        return ele.get(ele.size()-K);
        
    
    }
}
