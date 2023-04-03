package arrays;

import java.util.Scanner;

public class minmax {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]<min){
                min=arr[i];
            }
            else if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(min);
        System.out.println(max);
    }
}
