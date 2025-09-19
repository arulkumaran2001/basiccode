import java.util.Scanner;

public class searchnum {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        int arr[]={4,3,2,6,8,6,6},a,i,count=0;
        System.out.print("enter the number to find place:");
        a=in.nextInt();
        System.out.print("the number "+a+" is in ");
        for (i=0;i<arr.length;i++){
            if(a==arr[i]){
                System.out.print(i+1+" ");
                count++;
            }
        }
        System.out.println("indexs");

        System.out.println("no of duplicates"+count);

    }
}
