//Print spiral Matrix 


import java.util.ArrayList;

public class SpiralMatrix {
    public static void solution(int matrix[][] , ArrayList<Integer> ans){
        int lowi = 0 ; 
        int lowj = 0;
        
        int hii = matrix.length;
        int hij = matrix[0].length;
        
        while(lowi<hii && lowj < hij){
        for(int i = lowj ; i < hij ; i++){
            //System.out.println(matrix[lowi][i]);
            ans.add(matrix[lowi][i]);
        }
        lowi++;
        
        for(int i = lowi ; i < hii ; i++){
            //System.out.println(matrix[i][hij]);
        
            ans.add(matrix[i][hij-1]);
        }
        hij--;
        
        if(lowi<hii){
        for(int j = hij-1 ; j >= lowj ; j--){
            //System.out.println(matrix[hii][j]);
            ans.add(matrix[hii-1][j]);
        }
        hii--;
    }
        
        if(lowj < hij){
        for(int i = hii-1 ; i>= lowi ; i--){
            //System.out.println(matrix[i][lowj]);
            ans.add(matrix[i][lowj]);
        }
        lowj++;
    }
    }
    }
    public static void main(String args[]){
        int matrix[][]= {{6,6,2,28,2},
                        {12,26,3,28,7},
                        {22,25,3,4,23}};
        
        ArrayList<Integer> ans = new ArrayList<>();
        
        solution(matrix , ans);
        System.out.println(ans);
    }
    
}
