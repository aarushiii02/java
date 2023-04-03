package loops;

import java.util.Scanner;

public class drivenprgm {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n==1){
            do{
                int m=sc.nextInt();
                if(m>=90){
                    System.out.println("this is good");
                }
                else if(m>=60 && m<=89){
                    System.out.println("this is also good");
                }
                else if(m>0 && m<=59){
                    System.out.println("this is good as well");
                }
                else if(m==0){
                    break;
                }
            }while(n>0);
        
        }
        else if(n==0){
            System.out.println("cant detemined");
            
        }
    
}
}
