package java8;
@FunctionalInterface
interface sayable{
    void say(String msg);
}
public class Functional_Interfc {
    public void say(String msg){
        System.out.println(msg);
    }
    public static void main(String[] args){
        Functional_Interfc fn=new Functional_Interfc();
        fn.say("hi");
    }
}
