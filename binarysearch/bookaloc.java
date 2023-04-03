
package binarysearch;

import java.util.Scanner;

public class bookaloc {
    public static boolean ispossible(int arr[],int n,int m,int mid){
        int studentcount=1;
        int pagesum=0;
        for(int i=0;i<n;i++){
            if(pagesum +arr[i]<=mid){
                pagesum+=arr[i];
            }
            else{
                studentcount++;
                if(studentcount>m || arr[i]>mid){
                    return false;
                }
                pagesum+=arr[i];
            }
        }
        return true;
    }
    public static int allocatebook(int arr[],int n,int m){
        int s=0;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        int e=sum;
        int ans=-1;
        int mid=s+(e-s)/2;
        while(s<=e){
            if(ispossible(arr,n,m,mid)){
                ans=mid;
                e=mid-1;
            }
            else{
                s=mid+1;
            }
            mid=s+(e-s)/2;

        }
        return ans;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(allocatebook(arr, n, m));
    }
}
