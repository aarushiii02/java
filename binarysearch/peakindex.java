package binarysearch;

import java.util.Scanner;

public class peakindex {
    public static int peak(int arr[],int n){
        int s=0;int e=n-1;int mid=s+(e-s)/2;
        int ans=-1;
        while(s<e){
            if(arr[mid]<arr[mid+1]){
                s=mid+1;
            }
            else{
                e=mid;
            }
            mid=s+(e-s)/2;
        }
        return s;
    }
    public static void  main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        // int key=sc.nextInt();
        System.out.println(peak(a, n));
    }
}
