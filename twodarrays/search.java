package twodarrays;

import java.util.Scanner;

public class search {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int a[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                a[i][j]=sc.nextInt();
            }
        }
        int x=sc.nextInt();
        boolean flag=false;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(a[i][j]==x){
                    flag=true;
                    System.out.println(i +" "+j);
                }
                
            }
        }
        if(flag){
            System.out.println("found");
        }
        else{
            System.out.println("not found");
        }
    }
}
