//it can work for both string and intiger palandrome
import java.util.Scanner;

public class stringpalandrome {
    public static void main(String[]args){
        /*int i;
        String str,rev="";
        char ch;
        Scanner in= new Scanner(System.in);
        System.out.print("enter the string: ");
        str=in.nextLine();

        for (i=str.length()-1;i>=0;i--){
            ch=str.charAt(i);
            rev=rev+ch;
        }*/

        /*
        for (i=0;i<=str.length()-1;i++){
            ch=str.charAt(i);
            rev=ch+rev;
        }
        */

        /*System.out.println("the reversed string is: "+rev);
        if(str.equals(rev)){
            System.out.println("given string is a palandrome");
        }
        else {
            System.out.println("given string is not a palandrome");
        }*/
        String str;
        Scanner in= new Scanner(System.in);
        System.out.print("enter the string: ");
        str=in.nextLine();
        int left, right=str.length()-1;
        for(left=0;left<right;left++){
            if(str.charAt(left)!= str.charAt(right)){
                System.out.println("not palandeome");
                break;
            }
            right--;
        }
            System.out.println("palandrome");
    }
}
