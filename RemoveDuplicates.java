import java.util.*;
public class RemoveDuplicates {
    public static Set<Object> toUnique(ArrayList<? extends Object> arr){
        Set<Object> set = new HashSet<>(arr);
       
        return set;
        
    }
    public static void main(String args[]){
        ArrayList<String> arr = new ArrayList<>();
        arr.add("Adarsh");
        arr.add("Singh");
        arr.add("Parihar");
        arr.add("Astha");
        arr.add("Singh");
        arr.add("Parihar");


        ArrayList<Integer> num = new ArrayList<>();
        num.add(100);
        num.add(200);
        num.add(300);
        num.add(400);
        num.add(200);
        num.add(100);

        System.out.println(toUnique(arr));
        System.out.println(toUnique(num));
    }
    
}
