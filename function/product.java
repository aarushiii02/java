package function;

import java.util.Scanner;

public class product {
    public static int mul(int a,int b){
        return a*b;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        // int multi=mul(n,m);
        System.out.println(mul(n,m));
    }
}
