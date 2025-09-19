import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[]args) throws InterruptedException {
        //HashMap m= new HashMap();
        HashMap<Integer,Character> m=new HashMap<Integer,Character>();
        m.put(11,'n');
        m.put(12,'m');
        m.put(13,'l');
        m.put(14,null);
        m.put(null,null);

        System.out.println(m.get(15));
        char char1=m.get(12);
        System.out.println(char1);
        m.remove(11);
        System.out.println(m.containsKey(11));
        System.out.println(m.containsValue("mk"));
        System.out.println(m.isEmpty());
        System.out.println(m.keySet());//values()--collection return type
        System.out.println(m.entrySet());//print all the sets
        for (Object s:m.values()){
            System.out.println(s);
        }
        for (Object s:m.keySet()){
            System.out.println(s+"="+m.get(s));
        }
        for (Object s:m.entrySet()){
            System.out.println(s);
        }

//        for(Object i=0,i<m.keySet(),i++){
//        }
        /*for (Map.Entry entry:m.entrySet()){ //entry method
            System.out.println(entry.getKey()+" "+entry.getValue());
        }*/
        //iterator
        Set s=m.entrySet();
        Iterator it=s.iterator();

            while(it.hasNext()){
                Map.Entry entry= (Map.Entry) it.next();
                System.out.println(entry.getKey()+ "="+ entry.getValue());
            }
        System.out.println(m.size());
        System.out.println("clone object");
        Object g=m.clone();
        System.out.println(g);
        //m.clear();
        System.out.println(m);
        System.out.println("convert to string");
        String b=m.toString();
        System.out.println(b.charAt(6));
        System.out.println(m.hashCode());
        m.putIfAbsent(12,'l');
        System.out.println(m.get(12)+"arul");
        m.put(12,'h');
        System.out.println(m);
        System.out.println(m.getOrDefault(16,'l'));//if it already maped gives that value or return default value
        System.out.println(m.get(16));
        System.out.println(m.isEmpty());
        //System.out.println(m.putIfAbsent(m.putIfAbsent(12,'m')));
        m.wait(5000);
        m.replace(12,'l','n');
        System.out.println(m.get(12));
        //m.replaceAll();
        System.out.println(m);
        //m.compute(12,(key,val)-> val.);

   }
}
