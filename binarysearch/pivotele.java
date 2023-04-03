package binarysearch;

import java.util.Scanner;

public class pivotele {
    public static int pivot(int arr[],int n){
        int s=0;int e=n-1;int mid=s+(e-s)/2;
        int ans=-1;
        while(s<e){
            if(arr[mid]>=arr[0]){
                s=mid+1;
            }
            else{
                e=mid;
            }
            mid=s+(e-s)/2;
        }
        return s;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(pivot(arr,n));
    }
}
