import java.util.ArrayList;

public class firstnonrepetchar {

    public static void main(String[]args){
        String a="malayalam";
        //char m[]=a.toCharArray();
        ArrayList<Character>al=new ArrayList<>();
        for(int i=0;i<a.length();i++){
            for(int j=i+1;j<a.length();j++){
                if(a.charAt(i)==a.charAt(j)& !(al.contains(a.charAt(i)))){
                    al.add(a.charAt(i));
                }
            }
        }
        System.out.print(al);
    }
}
