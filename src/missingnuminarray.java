import java.util.Arrays;

public class missingnuminarray {
    public static void main(String args[]){
        int arr[]={2,5,4,3,7};
        Arrays.sort(arr);
        int j=arr[0];
        for (int i=0;i<arr.length;i++){
            if(j!=arr[i]){
                System.out.println("the missing number is: "+j);
                break;
            }j++;
        }
    }
}
