package collectionclass;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class collectionsort {
    public static void main(String[]args){
        /*char []a= {'a','f','c','m'};
        Arrays.sort(a);
        //String b[]= a.toString();
        System.out.println(a);
        ArrayList al=new ArrayList();
        al.add('d');
        al.add('D');
        al.add('a');
        al.add('b');
        al.add('A');
        System.out.println(al);
        Collections.sort(al);
        System.out.println(al);
        System.out.println(Collections.binarySearch(al,'A'));
        //Collections.binarySearch(al,"");*/
        laptop dell= new laptop("dell",50000,8,true);
        laptop hp= new laptop("hp",40000,6,false);
        laptop lenovo= new laptop("lenovo",40000,8,false);
        laptop redmi= new laptop("redmi",30000,8,true);
        ArrayList laptoplist=new ArrayList();
        laptoplist.add(dell);
        laptoplist.add(hp);
        laptoplist.add(lenovo);
        laptoplist.add(redmi);
        //Collections.sort(laptoplist); it cannot be sort by this directly without comparitor
        //System.out.println("before sort "+laptoplist);
        comparitor c=new comparitor();
        Collections.sort(laptoplist,c);
        System.out.println("after sort\n"+laptoplist);















    }
}
