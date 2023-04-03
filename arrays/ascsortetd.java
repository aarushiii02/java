package arrays;

import java.util.Scanner;

public class ascsortetd {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        boolean isasc=true;
        for(int i=0;i<a.length-1;i++){
            if(a[i]>a[i+1]){
               isasc=false;
            }
        }
        if(isasc){
            System.out.println("sorted");
        }
        else{
            System.out.println("not sorted");
        }
    }
}
