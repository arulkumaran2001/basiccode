import java.util.Scanner;

public class ReverseIntiger {
    public static void main(String[]args){
        int a,sum=0;
        Scanner in= new Scanner(System.in);
        System.out.println("enter the number within range(1<=N<=10000):");
        a=in.nextInt();
        if (a < 1 || a > 10000) {
            System.out.println("Input is out of the specified range.");
        }
        else{
            String str = Integer.toString(a);
            int s=str.length()-1;
            System.out.println("reversed number:");
            for(int i=s;i>=0;i--){
                System.out.print(str.charAt(i) );
            }
        }
    }
}
