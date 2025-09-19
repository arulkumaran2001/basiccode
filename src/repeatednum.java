//finding the coiunt of repeating number fro 10-10000
import java.util.Scanner;

public class repeatednum {
    public static void main(String[]args){
        int n1,n2,a,b,c,d,e,count=0;

        Scanner in=new Scanner(System.in);
        System.out.print("enter the starting num: ");
        n1=in.nextInt();
        System.out.print("enter the ending num: ");
        n2=in.nextInt();

        for(int i=n1;i<=n2;i++){
            if(i>=10 && i<=99){
                a=i%10;
                b=i%100/10;
                c=i%1000/100;
                d=i%10000/1000;
                e=i%100000/10000;
                if(a==b){
                    count=count+1;
                }

            }
        }

        for(int i=n1;i<=n2;i++){
            if(i>=100 && i<=999){
                a=i%10;
                b=i%100/10;
                c=i%1000/100;
                d=i%10000/1000;
                e=i%100000/10000;
                if(a==b || a==c || b==c){
                    count=count+1;
                }

            }
        }

        for(int i=n1;i<=n2;i++){
            if(i>=1000 && i<=9999){
                a=i%10;
                b=i%100/10;
                c=i%1000/100;
                d=i%10000/1000;
                e=i%100000/10000;
                if(a==b || a==c || a==d || b==c || b==d || c==d){
                    count=count+1;
                }

            }
        }

        for(int i=n1;i<=n2;i++){
            if(i>=10000 && i<=99999){
                a=i%10;
                b=i%100/10;
                c=i%1000/100;
                d=i%10000/1000;
                e=i%100000/10000;
                if(a==b || a==c || a==d || a==e || b==c || b==d || b==e || c==d || c==e){
                    count=count+1;
                }

            }
        }

        for(int i=n1;i<=n2;i++){
            if(i>=100000 && i<=999999){
                a=i%10;
                b=i%100/10;
                c=i%1000/100;
                d=i%10000/1000;
                e=i%100000/10000;
                if(a==b){
                    count=count+1;
                }

            }
        }
        System.out.println("the count of repeating numbers are: "+count);
    }
}
