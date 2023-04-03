package function;

import java.util.Scanner;

public class prime {
    public static void primeno(int n){
        boolean flag=false;
        for(int i=2;i<=n;i++){
            if(n%i==0){
                System.out.println("non prime");
                flag=true;
                break;
            }
         }
         if(flag==false){
            System.out.println("prime");
         }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        primeno(n);
    }
    
}
