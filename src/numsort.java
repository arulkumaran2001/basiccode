//sorting number from array
public class numsort {
    public static void main(String[]args){
        int arr[]={1,2,5,3},i,j,temp=0;

        for (i=0;i<arr.length;i++){
            for (j=i+1;j<arr.length;j++){
                if (arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }System.out.print(arr[i]);
        }
    }
}
