package collections;

import java.util.LinkedList;

public class linkedlist {
    public static void main(String []args){
        LinkedList l1= new LinkedList();
        l1.add(5);
        l1.add(20);
        l1.add("arul");
        l1.add(true);
        System.out.println(l1);
        l1.addFirst("naman");
        l1.addLast(40);
        l1.offer(300);
        System.out.println("after adding: first and last" +l1);
        //l1.poll();//removes the first elements in list
        //l1.pollFirst();// don't know
        //l1.removefirst();
        l1.remove(3);
        System.out.println("remove 3rd index "+ l1);
        //l1.clear();
        LinkedList l2= (LinkedList)l1.clone();
        System.out.println("clom"+l2);
        l1.add(78);
        System.out.println(l1.element());
        //l1.iterator();

    }
}
