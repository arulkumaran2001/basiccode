//adding num by int and it is a long code
import java.util.Scanner;

public class addnumlargecode {
    static int two(int i){
        int a=i%10;
        int b=i%100/10;
        int c=i%1000/100;
        int d=i%10000/1000;
        int e=i%100000/10000;
        int sum=a+b;
        return sum;
    }
    static int three(int i){
        int a=i%10;
        int b=i%100/10;
        int c=i%1000/100;
        int d=i%10000/1000;
        int e=i%100000/10000;
        int sum=a+b+c;
        return sum;
    }
    static int four(int i){
        int a=i%10;
        int b=i%100/10;
        int c=i%1000/100;
        int d=i%10000/1000;
        int e=i%100000/10000;
        int sum=a+b+c+d;
        return sum;
    }
    static int five(int i){
        int a=i%10;
        int b=i%100/10;
        int c=i%1000/100;
        int d=i%10000/1000;
        int e=i%100000/10000;
        int sum=a+b+c+d+e;
        return sum;
    }

    public static void main(String[]args){
        int i;
        Scanner in=new Scanner(System.in);
        System.out.print("enter the number: ");
        i=in.nextInt();

        if(i>=0 &&i<=9){
            System.out.print("sum of given number: "+i);
        }
        if(i>=10 &&i<=99){
            System.out.print("sum of given number: "+two(i));
        }
        if(i>=100 && i<=999){
            System.out.print("sum of given number: "+three(i));
        }
        if(i>=1000 &&i<=9999){
            System.out.print("sum of given number: "+four(i));
        }
        if(i>=10000 &&i<=99999){
            System.out.print("sum of given number: "+five(i));
        }
    }
}
