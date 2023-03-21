/* K distance from root
-------------------------
class Node
{
    int data;
    Node left, right;
   Node(int item)    {
        data = item;
        left = right = null;
    }
} 
Input:
K = 3
        3
       /
      2
       \
        1
      /  \
     5    3
Output: 5 3
*/


import java.util.ArrayList;

public class KDistanceFromRoot {
    ArrayList<Integer> ans = new ArrayList<>();
     // Recursive function to print right view of a binary tree.
     ArrayList<Integer> Kdistance(Node root, int k)
     {
          if(root == null) return ans;
          if(k == 0){ans.add(root.data); return ans;}
          
          Kdistance(root.left,k-1);
          Kdistance(root.right,k-1);
          return ans;
     }
    
}
