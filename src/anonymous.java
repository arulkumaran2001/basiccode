class cycle{
    void display(){
        System.out.println("i am a cycle");
    }
}
class tricycle extends cycle{// this is not need
    void display(){
        System.out.println("tricycle");
    }
}
public class anonymous {// ananumous class
    public static void main(String args[]){
        cycle c=new cycle(){
            void display(){
                System.out.println("i am tricycle");
            }
        };
        c.display();
    }
}
