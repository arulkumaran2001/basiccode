//stack inplimentation
class stack {
    char s[]=new char[10];
    int tos;
    stack(){
        tos=-1;
    }
    void pus(char letter){
        if(tos==9)
            System.out.print("stack is full");
        else
            //tos=tos+1;
            s[++tos] = letter;
    }
    char pop(){

        return s[tos--];
    }
}

public class stackdemo {
    public static void main(String[]args){
        stack s1=new stack();
        s1.pus('a');
        s1.pus('r');
        s1.pus('u');
        System.out.println(s1.pop());
        s1.pus('u');
        s1.pus('l');
        System.out.print("\n");
        System.out.println(s1.pop());
    }
}
