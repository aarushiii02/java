package recursion;

import java.util.Scanner;

public class ascno {
    public static void printno(int n){
        if(n==6){
            return;
        }
        // printno(n-1);
        // System.out.println(n);
        //other way
        System.out.println(n);
        printno(n+1);
    }
    public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
printno(n);
    }
}
