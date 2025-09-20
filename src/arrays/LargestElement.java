package arrays;

public class LargestElement {
    public static void main(String[] args) {
        int arr[]={100,2,5,1,3,0,15,20},n= arr[1];
        for(int i=0;i< arr.length;i++){
            if(n<arr[i]){
                n=arr[i];
            }
        }
        System.out.println(n);
    }
}
