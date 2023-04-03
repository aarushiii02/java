package basics;

import java.util.Scanner;

public class reverseno {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int reverse=0;
        int last;
        while(n!=0){
            last=n%10;
            reverse=(reverse*10)+last;
            n/=10;
        }
        System.out.println(reverse);
    }
}
