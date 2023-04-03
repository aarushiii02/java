package function;

import java.util.Scanner;

public class infine{
    public static void infinite(int n){
        do{
            System.out.println(n);
        }while(n>0);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
infinite(n);
    }


}