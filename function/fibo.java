package function;

import java.util.Scanner;

public class fibo {
    public static void fibonacci(int n){
        int a=0;
        int b=1;
        int newterm;
        for(int i=0;i<n;i++){
            System.out.println(a);
            newterm=a+b;
            a=b;
            b=newterm;
        }
        
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
      fibonacci(n);
    }
}
