//count of even number in array
public class counteven {
    public static void main(String[]args){
        int arr[]={2,8,1,9,4};
        int i=0,count=0;
        System.out.print("even numbers are: ");
        for(i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                System.out.print(arr[i]);
                count++;
            }

        }
        System.out.println();
        System.out.println("count of even num: "+count);
    }
}
