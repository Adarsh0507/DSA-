/*Given an array having both positive and negative integers. 
The task is to compute the length of the largest subarray with sum 0. */

/*
Example 1:

Input:
N = 8
A[] = {15,-2,2,-8,1,7,10,23}
Output: 5
Explanation: The largest subarray with
sum 0 will be -2 2 -8 1 7. 

*/

/*Your Task:
You just have to complete the function maxLen() which takes two arguments an array A and n, 
where n is the size of the array A and returns the length of the largest subarray with 0 sum. */


import java.util.HashMap;

public class LargestSubarray0Sum {
    int maxLen(int arr[], int n)
    {
        HashMap <Integer , Integer> map = new HashMap<>();
        int sum = 0;
        int ans = 0;
        for(int i = 0 ; i < n ; i++){
            sum += arr[i];
            if(sum == 0 && i+1 > ans){
                ans = i+1;
            }
            map.put(sum , i);
        }
        sum = 0;
        
        
        for(int i = 0 ; i < n ; i++){
            sum += arr[i];
            if(map.containsKey(sum)){
                int p = (int)map.get(sum);
                if(i!=p){
                    if(p>i && ans<p-i){
                        ans = p-i;
                    }
                    if(i>p && ans<i-p){
                        ans = i-p;
                    }
                }
            }
        }
        
        return ans;
    }

    public static void main(String args[]){
        int arr[] = {15,-2,2,-8,1,7,10,23};
        int n = arr.length;
        LargestSubarray0Sum l = new LargestSubarray0Sum();
        System.out.println(l.maxLen(arr, n));
    }
    
}
