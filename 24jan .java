public class connection3{
    public static void main(String args[]){
        String str="java";
        String str2="Hello";
        func(str,str2);
    }
    static void func(String str1,String str2){
        if(str1.length()>str2.length()){
            System.out.println(str1.substring(str1.length()-str2.length(),str1.length())+str2);
        }
        else{
            System.out.println(str1+str2.substring(str2.length()-str1.length(),str2.length()));
        }
    }
}
