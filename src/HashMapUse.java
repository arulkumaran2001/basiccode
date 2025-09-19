import java.util.Collection;
import java.util.HashMap;

public class HashMapUse {
    public static void main(String[]args){
        String n="arulkumaran";
        int i=0,j;
        HashMap<Integer,Character> h=new HashMap<Integer,Character>();
        for (j=0;j<n.length();j++) {
            if(i<n.length()){
                char c = n.charAt(i);
                h.put(i, c);
                i=i+1;

            }
        }
        System.out.println(h.entrySet());
        Collection<Character> s= h.values();
    }
}

