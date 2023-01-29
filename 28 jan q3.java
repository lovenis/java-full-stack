import java.util.*;
public class combination{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("In nCr what is the value of n :");
        int n= sc.nextInt();
        System.out.println("what is value of r");
        int r=sc.nextInt();
        if(n>r){
        comb(n,r);}
        else{
            System.out.println("Thats invalid ...In nCr what is the value of n :");
            int n1=sc.nextInt();
            System.out.println("what is value of r");
            int r1=sc.nextInt();
            comb(n1,r1);
        }
    }
    static void comb(int n,int r){
        if(n>r){
        System.out.println(fact(n)/(fact(r)*fact(n-r)));
        }
        else{
            System.out.println("Can't do for this sorry");
        }
    }
    static int fact(int n){
        int prod=1;
        while(n>=1){
            prod*=n;
            n--;
        }
        return prod;
    }
}
