//interface-what to do but not how to do
package interfac;
interface vehicle{//instance variable is not allowled
    int MAX=20; //final,static
    /*public abstract*/ void ride();
    default void run(){
        System.out.println("arul");
    }; //after java 1.8 method define is available
}
class car implements vehicle{
    public void ride(){
        System.out.println("this is car");
    }
    public void run(){}// it can br overloaded also
}

class bike implements vehicle{
    public void ride(){
        System.out.println("this is bike");
    }
}
class mechanic{
    void check(vehicle v){
        System.out.println("checking");
        v.ride();
    }
}
public class interfaceog {
    public static void main(String[]args){
        vehicle v=new car();
        mechanic m= new mechanic();
        //vehicle v=new car();
        vehicle v1= new bike();
        car c= new car();
        m.check(v);
        m.check(v1);
        c.run();
        vehicle v3=new vehicle() {
            @Override
            public void ride() {
                System.out.println("vintage vehicle");
            }
        };
        v3.ride();
        // lamda expresion-if only functional interface , or sam it consist only one abstract class
        vehicle v4=() -> System.out.println("vintage vehicle");

    }
}
// go to inheritence employee for sorting example