//printing the last set of number in array
import java.util.Scanner;

public class lastset {
    public static void main(String[]args){
        int arr[]={1,2,3,4,5,6,7,8,9,10},n1,n2;

        Scanner in=new Scanner(System.in);
        System.out.print("enter how many number should be printer last: ");
        n1=in.nextInt();
        n2=arr.length-n1;

        for(int i=n2;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        for (int i=0;i<n2;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
