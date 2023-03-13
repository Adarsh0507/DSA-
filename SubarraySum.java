import java.util.ArrayList;
class SubarraySum{

    static ArrayList<Integer> ArraySum(int arr[] , int s , int n){
        ArrayList<Integer> a = new ArrayList<>();
        
        int sum = 0;
        int first = 0;
        int i = 0;
        while(i < n){
           if(sum>s){
                sum = sum - arr[first];
                first = first + 1;
                continue;
            }
            if(sum == s){
                a.add(first+1);
                a.add(i);
                return a;
            }
            
             sum += arr[i];
             i++;
        }
        if(sum>s){
            while(first<arr.length && sum >s){
                
                sum = sum - arr[first];
                first++;
                if(sum == s){
                    a.add(first+1);
                    a.add(n);
                    return a;
                }
            }
        }
        a.add(-1);
        return a;
    }

    public static void main(String arsg[]){
        int arr[] = {135,101,170,125,79,159,163,65,106,146,82,28,162,92,196,143,
            28,37,192,5,103,154,93,183,22,117,119,96,48,127,172,139,70,113,68,
            100,36,95,104,12,123,134};

        int n = 42;
        int s = 468;

        System.out.println(ArraySum(arr , s , n));
    }
}