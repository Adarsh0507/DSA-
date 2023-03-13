public class RatInMaze {
    public static void print(int[][] ans){
        System.out.println("Path to get to the Maze {::} ");
        for(int a[] : ans){
            for(int x : a){
                System.out.print(x);
            }
            System.out.println();
        }
    }
    public boolean solveMaze(int[][] arr , int i , int j , int count , int ans[][]){

        if(i == arr.length-1 && j == arr[0].length-1){
            ans[i][j]=1;  
            System.out.println("Total Nubers of Jumps through 1 to get to the end of the mage :: " + count);
            print(ans);
            return true;
        }
        if(i>=arr.length || j>=arr.length || i<0 || j<0)
            return false;

        if(arr[i][j] != 1)
            return false;
        //System.out.println(i + " " + j + " " + count);
        count++;
        ans[i][j] = 1;
        if(solveMaze(arr, i+1, j, count , ans)) return true;
        count--;
        ans[i][j]=0;
        count++;
        ans[i][j] = 1;
        if(solveMaze(arr, i, j+1, count , ans)) return true;
        count--;
        ans[i][j] = 0;

        return false;

    }
    public static void main(String args[])
    {
        RatInMaze rat = new RatInMaze();
        int maze[][] = { { 1, 0, 0, 0 },
                         { 1, 1, 0, 1 },
                         { 0, 1, 0, 0 },
                         { 1, 1, 1, 1 } };
  
        int count = 0;

        int ans[][] = { { 0, 0, 0, 0 },
        { 0, 0, 0, 0 },
        { 0, 0, 0, 0 },
        { 0, 0, 0, 0 } };
    
       rat.solveMaze(maze , 0 , 0 , count , ans );
       
    }
}

