import java.util.HashSet;

public class RemoveDuplicates {

    String removeDups(String S) {
        HashSet<Character> set = new HashSet<>();
        
        String ans = "";
        for(int i = 0 ; i < S.length() ; i++){
            if(set.contains(S.charAt(i))){
                continue;
            }
            set.add(S.charAt(i));
            ans += S.charAt(i);
        }
        return ans;
    }

    public static void main(String args[]){

        String S = "zvvo";

        RemoveDuplicates r = new RemoveDuplicates();
        System.out.println(r.removeDups(S));

    }
    
}
