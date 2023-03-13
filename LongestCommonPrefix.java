/*Given a array of N strings, find the longest common prefix among all strings present in the array. */
/* 
 * Example 1:

Input:
N = 4
arr[] = {geeksforgeeks, geeks, geek,
         geezer}
Output: gee
Explanation: "gee" is the longest common
prefix in all the given strings.
Example 2:

Input: 
N = 2
arr[] = {hello, world}
Output: -1
Explanation: There's no common prefix
in the given strings.

Your Task:
You don't need to read input or print anything. Your task is to complete the function solution()
which takes the string array arr[] and its size N as inputs and returns the longest common prefix common in
 all the strings in the array. If there's no prefix common in all the strings, return "-1".


*/

public class LongestCommonPrefix {
    String solutionn(String arr[], int n){
        
        if(n==1)
            return arr[0];
        
        String s = "";
        String first = arr[0];
        String sec = arr[1];
        
    
        int len = first.length();
        if(first.length() > sec.length())
            len = sec.length();
            
        //Find first 2 Strings Common char in array and store at s
        for(int i = 0 ; i < len ; i++){
           
            if(first.charAt(i) != sec.charAt(i)){
                break;
            }
            s += first.charAt(i);
        }
        
        
        //Compare remaining character of array with s and update the common char.  
        for(int i = 2 ; i < n ; i++){  //loop through array
            
            String temp = "";  //temperory Variable to store common between s and array element
            first = arr[i];
            
            len = first.length();
            if(first.length() > s.length() )
                len = s.length();
                
            //loop through evert char of String     
            for(int j = 0 ; j < len ; j++){
                
                if(first.charAt(j)!=s.charAt(j)){ //if char doesnt matches 
                    s = temp;  //update s
                    break;
                }
                temp += first.charAt(j); //if char matches addd element to temp
                
                if(j+1 >= len) //if we are at the last position
                    s= temp; //update s
            }
        }
        if(s.length()==0) ///if no common char then put -1 to s
            s = "-1";
        return s; //Return s
    }    

    public static void main(String args[]){
        String arr[] = {"geeksforgeeks", "geeks", "geek","geezer"};
        int n = arr.length;
        LongestCommonPrefix lc = new LongestCommonPrefix();

        System.out.println(lc.solutionn(arr, n));
    }
}
