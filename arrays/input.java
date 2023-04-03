package arrays;
//linear search

import java.util.Scanner;

public class input {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=sc.nextInt();
        int num[]=new int[n];
        boolean flag=false;
for(int i=0;i<n;i++){
    num[i]=sc.nextInt();
}
        for(int i=0;i<n;i++){
            System.out.print(num[i]+" ");
        }
        System.out.println();
        for(int i=0;i<num.length;i++){
            if(num[i]==x){
                System.out.println(i);
                flag=true;
            }
            
        }
        if(flag==true){
            System.out.println("found");
        }
        else{
            System.out.println("not found");
        }
    }
}
