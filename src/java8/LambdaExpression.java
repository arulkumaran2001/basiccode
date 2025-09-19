package java8;
/*interface Drawable{
    public void draw();
    public default void dra(){
        System.out.println("ARUL");
    };
}
public class LambdaExpression {
    public static void main(String[] args) {
        int width=10;

        //without lambda, Drawable implementation using anonymous class
        Drawable d=new Drawable(){
            public void draw(){System.out.println("Drawing "+width);}
        };
        d.draw();
    }
}*/
interface Drawable{
    public void draw();
    public default void dra(){
        System.out.println("ARUL");
    };
}
public class LambdaExpression {
    public static void main(String[] args) {
        int width=10;

        //with lambda, Drawable implementation using anonymous class
        Drawable d=()->{
            System.out.println("Drawing "+width);
        };
        d.draw();
    }
}
