class MidOf2SortedArraySum{
    int findMidSum(int[] ar1, int[] ar2, int n) {
        
        int first = 0; 
       int sec = 0;
       
       int count = 0;
       int mid = 0;
       int premid = 0;
       
       for(int i=0 ; i<  n*2 ; i++){
           
           if(first>=n || sec >= n) break;
           
           if(count == n+1){
               
               return mid+premid;
           }
           if(ar1[first] < ar2[sec]){
               premid = mid;
               mid = ar1[first];
               first++;
           }
           else{
               premid = mid;
               mid = ar2[sec];
               sec++;
           }
           count++;
           
       }
       
       while(first < n){
           
           if(count == n+1) return mid+premid;
           premid = mid ;
           mid = ar1[first];
           first++;
           count++;
       }
       
       while(sec < n){
           
           if(count == n+1) return mid+premid;
           premid = mid ;
           mid = ar2[sec];
           sec++;
           count++;
       }
       
       
       return mid+premid;
       // code here
   }

   public static void main(String args[]){
    int N = 5;
    int Ar1[] = {1, 2, 4, 6, 10};
    int Ar2[] = {4, 5, 6, 9, 12};

    MidOf2SortedArraySum m = new MidOf2SortedArraySum();
    System.out.println(m.findMidSum(Ar1 , Ar2 , N));
   }
}