/*Given an array of N integers arr[] where each element represents the maximum length of the jump
that can be made forward from that element. This means if arr[i] = x, then we can jump any distance 
y such that y ≤ x.
Find the minimum number of jumps to reach the end of the array (starting from the first element). */


public class MinJumps {
    public static void main(String args[]){
        int arr[] = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9} ;
        
        int i = 0 ;
        int jumps = 1;
        while(i < arr.length-1){
            jumps++;
            int j = i+1;
            int max = i+arr[i];
            int maxpos = i;
            while(j<arr.length && j<=i+arr[i]){
                if(j+arr[j] > max) maxpos = j;
                j++;
            }
            
            i = maxpos + arr[maxpos];
            
        }
        System.out.println(jumps);
    }
    
}
