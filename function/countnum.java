package function;

import java.util.Scanner;

public class countnum {
    public static void counting(int n){
        char choice;
        int cntp=0,cntn=0,cntz=0;
        do{
            Scanner sc=new Scanner(System.in);
         n=sc.nextInt();
        
        
        if(n>0){
            cntp++;
        }
        else if(n<0){
            cntn++;

        }
        else if(n==0){
            cntz++;
        }
        System.out.println("do u want to print y/n");
        choice=sc.next().charAt(0);
    }while(choice=='y' || choice=='Y');
    System.out.println(cntp +" " + cntn +" " + cntz);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        counting(n);
    }
}
