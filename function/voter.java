package function;

import java.util.Scanner;

public class voter {
    public static void vote(int n){
        if(n>=18){
            System.out.println("eligible");
        }
        else{
            System.out.println("not eligible");
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int v=sc.nextInt();
        vote(v);
    }
}
