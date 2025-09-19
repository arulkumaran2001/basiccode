public class repeatedchar {
    public static void main(String[] args){
        String s="sucecs", n=" ";
        int a=0;
        for(int i=0;i<s.length();i++){
            for (int j=0;j<n.length();j++){
                if(s.charAt(i)== n.charAt(j)){
                    a=1;
                }
                }
            if(a!=0){
                a=0;
            }else{
                n=n+s.charAt(i);
            }
            }
        System.out.println(n);
        }

    }
