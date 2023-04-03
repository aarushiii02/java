
package recursion.ques;

import java.util.Scanner;

public class towerofhanoi {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in); 
        int n=sc.nextInt();
        toh(n,"S","H","D");
    }
    public static void toh(int n,String source,String helper,String dest){
        if(n==1){
            System.out.println("transfer " + n +" from " +source+" to " +dest);
            return;
        }
        toh(n-1,source,dest,helper);
        System.out.println("transfer " + n +" from " +source+" to " +dest );
        toh(n-1,helper,source,dest);
    }
    
}

