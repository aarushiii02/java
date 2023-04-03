package function;

import java.util.Scanner;

public class sum2no {
    public static int Sum(int n,int m){
int sum=n+m;
return sum;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int sum=Sum(n,m);
        System.out.println(sum);
    }
}
