package function;

import java.util.Scanner;

public class gcd {
    public static int greatest(int n,int m){
        while(m!=0){
            int rem=n%m;
            n=m;
            m=rem;
        }
        return n;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        System.out.println(greatest(n, m));
    }
}
