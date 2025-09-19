package collections;

import java.util.ArrayList;
import java.util.Collections;

public class arraylist {
    public static void main(String []args){
        /*
        array list is resizeable
        hetrogenious objects  are allowed- multiple data types
         growable data structure
         dynamic array
         */

        ArrayList al1=new ArrayList();
        //System.out.println("array size "+al1.size());
        al1.add(10);
        al1.add("man");
        al1.add(20);
        al1.add("naman");
        al1.add(1,"vishal");
        //System.out.println(al1.add("arul"));// add has boolien return type
        //System.out.println(al1+"\narray size "+al1.size());
        //System.out.println(al1.get(2)); //shows that element
        //al1.remove(3);// it will remove the element fron index 3
        //al1.remove("vishal"); //it will remove the element named 20, **how to remove inter object**
        //System.out.println("after remove index"+al1);
        //al1.set(3,20);
        //System.out.println("after set the elementv naman as 20"+al1);
        //System.out.println(al1.indexOf(20));
        System.out.println(al1);
        ArrayList al2= new ArrayList();
        al2.addAll(al1);
        System.out.println(al2);
        ArrayList al3= new ArrayList();
        al3.add("new delhi");
        al3.add("bombay");
        al3.add("chennai");
        al3.addAll(2,al1);
        System.out.println(al3);
        System.out.println(al3.subList(1,3));//gives between elements
        System.out.println(al3.isEmpty()); //it tells bollean answer
        al1.removeAll(al1);//remove all the element in al1
        al3.removeAll(al1);//remove all elements of al1 from al3
        System.out.println(al3);
        System.out.println(al1);
        //al1.subList();
        //al1.equals();
        al1.ensureCapacity(21);
        //al1.sort(al1);
        Collections.sort(al1);

    }
}
