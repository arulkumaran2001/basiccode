public class recursionfebonicci {
    static int feno(int c){
        if(c==0){
            return 0;
        }//0th is 0

        if(c==1 || c==2){
            return 1;
        }//1st & 2nd is 1
        return feno(c-1)+feno(c-2);// calling recursively

    }
    public static void main(String[]args){
        int len=6;
        for (int i=0;i<len;i++)
        System.out.print(feno(i));
    }
}
