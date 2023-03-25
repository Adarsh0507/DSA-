/*Top View of Binary Tree
------------------------------------

Given below is a binary tree. The task is to print the top view of binary tree.
 Top view of a binary tree is the set of nodes visible when the tree is viewed from the top. 
 For the given below tree

       1
    /     \
   2       3
  /  \    /   \
4    5  6   7

Top view will be: 4 2 1 3 7
-----------------------------------------
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}
*/
class Pair{
    int hd;
    Node temp;
    Pair(int hd , Node temp){
        this.hd = hd;
        this.temp = temp;
    }
}
class Solution
{
    //Function to return a list of nodes visible from the top view 
    //from left to right in Binary Tree.
    static ArrayList<Integer> topView(Node root)
    {
        Queue<Pair> q = new LinkedList<>();
        Map<Integer , Integer> map = new TreeMap<>();
        ArrayList<Integer> ans = new ArrayList<>();
        int k = 0 ;
        q.add(new Pair(k , root));
        //map.put(k , root.data);
        
        while(!q.isEmpty()){
            Pair n = q.poll();
            
            if(!map.containsKey(n.hd))
                map.put(n.hd , n.temp.data);
            
            if(n.temp.left != null) q.add(new Pair(n.hd-1 , n.temp.left));
            if(n.temp.right != null) q.add(new Pair(n.hd+1 , n.temp.right));
        }
        
        for(Map.Entry<Integer , Integer> m : map.entrySet()){
            ans.add(m.getValue());
        }
        return ans;
    }