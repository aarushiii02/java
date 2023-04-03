package function;

import java.util.Scanner;

public class table {
    public static void tablen(int n){
        for(int i=1;i<=10;i++){
            int tab=n*i;
            System.out.println(tab);
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        tablen(n);
    }
}
