import java.util.*;
public class evenoddplace{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        String str2=sc.nextLine();
         func(str1,str2);
    }
    static void func(String str1,String str2){
        char[] str3=new char[str1.length()+str2.length()];
      
        for(int i=0;i<str1.length()||i<str2.length();i++ )
        {
           if(i<str1.length()){
            str3[i]=str1.charAt(i);
           }
           if(i<str2.length()){
            str3[i]=str2.charAt(i);
           }
        }

        System.out.println("Concatenated string is :");
        
        for(int i=0;i<str3.length;i++){
            System.out.print(str3[i]);
        }
    }
}
