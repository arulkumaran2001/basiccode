package java8;

import java.util.function.BiFunction;

class Arithmetic{
    public static int add(int a, int b){
        return a+b;
    }
}
public class ReferenceMethods {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer>adder = Arithmetic::add;
        int result = adder.apply(10, 20);
        System.out.println(result);
    }
}
/*
public class MethodReference2 {
    public static void ThreadStatus(){
        System.out.println("Thread is running...");
    }
    public static void main(String[] args) {
        Thread t2=new Thread(MethodReference2::ThreadStatus);
        t2.start();
    }
}*/
