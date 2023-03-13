/*
 * Given a binary matrix (containing only 0 and 1) of order NxN. All rows are sorted already, 
 * We need to find the row number with the maximum number of 1s. Also, find the number of 1s in that row.

 Note:
1. In case of a tie, print the smaller row number.
2. Row number should start from 0th index.
 */

public class MatrixHighest1 {

    void solution(int arr[][] , int n){

        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n ; j++){
            if(arr[j][i] == 1){
                System.out.println("Row in which maximum 1's are present :: "+j );
                System.out.println("Total numbers of 1's :: " + (n-i));
                return;
            }
            }
        }
        System.out.println("No 1's are present !!");
    }

    public static void main(String args[]){

        int arr[][] = {{0, 0, 1}, 
                    {0, 1, 1 }, 
                     {0, 0, 0}};
        int n = arr.length;

        MatrixHighest1 mx = new MatrixHighest1();
        mx.solution(arr , n);   
    }
    
}
