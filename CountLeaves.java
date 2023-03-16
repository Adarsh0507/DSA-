/* Count Leaves in Binary Tree
----------------------------------
 Input:
Given Tree is 
               4
             /   \
            8     10
           /     /   \
          7     5     1
         /
        3 
Output:
3
Explanation: 
Three leaves are 3 , 5 and 1.
 */

class Node{
    int data;
    Node left;
    Node right;

    Node(int data ){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class CountLeaves {
    
    int ans;
    int count(Node root) 
    {
       if(root == null) return ans;
       if(root.left == null && root.right == null) ans++;
       
       count(root.left);
       count(root.right);
       return ans;
    }

    public static void main(String args){
        Node root = new Node(4);
        root.right = new Node(8);
        root.left = new Node(10);
        root.right.right = new Node(7);
        root.right.right.right = new Node(3);
        root.left.right = new Node(5);
        root.left.left = new Node(1);

        CountLeaves cl = new CountLeaves();
        System.out.println("Number of leaves present in the Tree are : " + cl.count(root));
    }
}
    

