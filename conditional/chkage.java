package conditional;

import java.util.Scanner;

public class chkage {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter age");
        int age=sc.nextInt();
        if(age>18){
            System.out.println("Adult");
        }
        else{
            System.out.println("child");
        }
    }
    
}
