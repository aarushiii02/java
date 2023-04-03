package basics;

import java.util.Scanner;

public class primefct {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        primefact(n);
    }
    public static void primefact(int n){
        int i=2;
        while(i<=n){
            while(n%i==0){
                 System.out.println(i);
                n=n/i;
            }
                i++;
               
        }
    }
}
