package sorting;

import java.util.Arrays;

public class InsersionSort {
    public static void main(String[] args) {
        int arr[]={19,3,4,12,8},n=5;
         for(int i=1;i< arr.length;i++){
             int j=i;
             while(j>0 && arr[j-1]>arr[j]){
                 int temp=arr[j-1];
                 arr[j-1]=arr[j];
                 arr[j]=temp;
                 j--;
             }
         }
        System.out.println(Arrays.toString(arr));
    }
}
