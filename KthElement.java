/*
 Given two sorted arrays arr1 and arr2 of size N and M respectively and an element K. 
 The task is to find the element that would be at the k’th position of the final sorted array.
 

Example 1:

Input:
arr1[] = {2, 3, 6, 7, 9}
arr2[] = {1, 4, 8, 10}
k = 5
Output:
6
Explanation:
The final sorted array would be -
1, 2, 3, 4, 6, 7, 8, 9, 10
The 5th element of this array is 6.
 */


public class KthElement {

    public static int solution(int arr1[], int arr2[], int n, int m, int k){
        int count = 1 ;
        int i = 0 ; int j = 0;
        
        while(i<n &&  j <m){
            
            if(count==k){
                if(arr1[i]<arr2[j]){
                    return arr1[i];
                }
                else return arr2[j];
            }    
            
            
            if(arr1[i] < arr2[j]){
                i++;
                count++;
            }
            else{
                j++;
                count++;
            }
            
            
            
        }
        while(i < n ) {
            
            if(count == k)
                return arr1[i];
            
            count++;
            i++;    
            
        }
        
        while(j < m ) {
            
            if(count == k)
                return arr2[j];
            
            count++;
            j++;
            
        }
        return -1;
    }
    public static void main(String ags[]){
        int arr1[] = {2, 3, 6, 7, 9};
        int arr2[] = {1, 4, 8, 10};
        int k = 5;

        System.out.print("K-th element of two sorted Arrays :: ");
        System.out.println(KthElement.solution(arr1, arr2, arr1.length , arr2.length , k));
    }
}
