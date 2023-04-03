package function;

import java.util.Scanner;

public class avg {
    public static void average(int a,int b,int c){
        int avge=(a+b+c)/3;
System.out.println(avge);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        average(a, b, c);

    }
}
