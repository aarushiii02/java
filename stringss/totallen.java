package stringss;

import java.util.Scanner;

public class totallen {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String arr[]=new String[n];
        int tlen=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.next();
            tlen+=arr[i].length();
        }

        System.out.println(tlen);
        // sc.close();
    }
    
}
