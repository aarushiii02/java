package arrays;

import java.util.Scanner;

public class palindrome {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        boolean flag=false;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n/2 && n!=0;i++){
            if(arr[i]!=arr[n-i-1]){
                flag=true;
                break;

            }
        }
        if(flag==true){
            System.out.println("non palindrome");
        }
        else{
            
            System.out.println("palindrome");
        }
    }
}
