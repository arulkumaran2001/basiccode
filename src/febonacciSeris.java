public class febonacciSeris {
    public static void main(String[]args){
        int a=0,b=1,temp=0;
        int stop=10;
        for(int i=0;i<stop;i++){
            System.out.println(a);
            temp=a+b;
            b=a+b;
            a=b;
            b=temp;
        }
    }
}
