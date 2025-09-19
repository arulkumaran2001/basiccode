import java.io.*;
import java.util.Scanner;

public class exceptionhandle {
    public static void main(String[]args){
        int a=10,b=0,c;
        try {/* if any error occurs it brack at that point go out of try block
            / and go to its currosponding exception*/
            int arr[]=null;
            System.out.println(arr[2]);// throw
            c = a / b;
        }
        //System.out.println("d"); - it is not posible to type code between try and catch, why i don't know
        catch (ArithmeticException e){
            System.out.println("arithmatic error");
        }
        catch (NullPointerException n){
            System.out.println("null error");
        }
        catch (Exception e){
            System.out.println("error");
        }
        finally {//it will definitly runs even if error occurs or not
            System.out.println("s");
        }
        System.out.println(a);

        /*File file=new File("BE Consolidate.pdf");
        try {// checked exception compiler can identify it mite cause error
            FileInputStream f=new FileInputStream(file);
        } catch (FileNotFoundException e) {
            //throw new RuntimeException(e);
        }
        int i;
        try(Scanner in= new Scanner(System.in)) {//to close scanner,buffer reader proper-try with resource
            i = in.nextInt();
        }*/
        double bal=500,with=600;
        try {
            if (bal < with) {
                throw new lowbal(with - bal);

            }
        }
        catch (lowbal e) {
               // throw new RuntimeException(e);
                System.err.println("low balance");
            }

    }
}
