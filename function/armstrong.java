package function;

import java.util.Scanner;

public class armstrong {
    public static boolean armstrng(int n){
        int temp=n;int last=0;int sum=0;int digit=0;
        while(temp>0){
            temp/=10;
            digit++;
        }temp=n;
        while(temp>0){
            last=temp%10;
            sum+=Math.pow(last,digit);
            temp/=10;
        }
        if(n==sum){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(armstrng(n));
        
    }
}
