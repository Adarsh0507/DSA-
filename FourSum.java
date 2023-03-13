import java.util.ArrayList;

/*N = 5, K = 3
A[] = {0,0,2,1,1}
Output: 0 0 1 2 $
Explanation: Sum of 0, 0, 1, 2 is equal
to K.*/ 
public class FourSum {
    static public ArrayList<ArrayList<Integer>> countFourSum(int[] arr ,int i  ,  int n , int key ,
        ArrayList<ArrayList<Integer>> ans , ArrayList<Integer> temp ){
        if(key == 0 && temp.size() ==4){
            ans.add(new ArrayList<>(temp));
            
            return ans;
        }
        if(i>=n)
            return ans;

        if(key<0 || temp.size()>=4){
            return ans;
        }
        
        key -= arr[i];
        temp.add(arr[i]);
        
        countFourSum(arr, i+1 , n , key, ans, temp);
        
        temp.remove(temp.size()-1);
        key += arr[i];
        countFourSum(arr, i+1 , n, key, ans, temp);
        
        return ans;
    }
    public static void main(String args[]){
        int arr[] = {1, 2, 3, 4, 5, 9, 7, 8};
        int n = 8;
        int key = 16;
        ArrayList<Integer> temp = new ArrayList<>();
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        System.out.println(countFourSum(arr , 0 , n , key , ans , temp));

       
    }    
}
