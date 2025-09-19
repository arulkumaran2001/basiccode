abstract class shape{
    abstract void area();
}
class square extends shape{


    @Override
    void area() {
        System.out.println("square");
    }
}
class circle extends shape{
    @Override
    void area() {
        System.out.println("circle");
    }
}
public class absttractdemo {
    public static void main(String[]args){
        shape s[]= new shape[3];
        s[0]= new square();
        s[1]= new square();
        s[2]= new circle();

        for (shape i:s){
            i.area();
        }
    }
}
