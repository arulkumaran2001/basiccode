import java.util.Scanner;

public class GetInputArry {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        int a;
        System.out.print("enter the array size: ");
        a=in.nextInt();
        int arr[]=new int[a];
        System.out.print("enter the numbers: ");
        for (int i=0;i<arr.length;i++){
            arr[i]=in.nextInt();
        }
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
}
