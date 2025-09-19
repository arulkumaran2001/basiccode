//adding number by char and this is short code
import java.util.Scanner;

public class addnumshortcode {
    public static void main(String[]args){
        int a,sum=0;
        Scanner in= new Scanner(System.in);
        System.out.print("enter the number: ");
        a=in.nextInt();
        String str = Integer.toString(a);

        for(int i=0;i<str.length();i++){
            sum=sum+str.charAt(i)-48;

        }
        System.out.print("the sum of the number: "+sum);
    }
}
