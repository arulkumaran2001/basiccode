import java.util.Arrays;

public class reversearray {
    public static void main(String args[]){
        int arr[]={1,2,5,3};
        int ar[]=new int[arr.length],j=0;
        for (int i= arr.length-1;i>=0;i--){
                ar[j] =arr[i];
                j++;
        }
        int i=0;
        for ( j=0;j<=ar.length-1;j++){
            arr[i]=ar[j];
            i++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
