package recursion;

import java.util.Scanner;

public class factorial {
    public static int facto(int n){
        int fact=1;
        if(n==1 || n==0){
            return fact;
        }
        int factofnm1=facto(n-1);
        int factofn=n*factofnm1;
        return factofn;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(facto(n));
    }
}
