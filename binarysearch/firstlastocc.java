package binarysearch;

import java.util.Scanner;

public class firstlastocc {
    public static int firstocc(int arr[],int n,int key){
        int s=0;int e=n-1;int mid=s+(e-s)/2;
        int ans=-1;
        while(s<=e){
            if(arr[mid]>key){
                e=mid-1;
            }
            else if(arr[mid]==key){
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
    public static int lastocc(int arr[],int n,int key){
        int s=0;int e=n-1;int mid=s+(e-s)/2;
        int ans=-1;
        while(s<=e){
        if(arr[mid]>key){
            e=mid-1;
        }
        else if(arr[mid]==key){
            ans=mid;
            s=mid+1;
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
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int key=sc.nextInt();
        System.out.print(firstocc(arr, n, key)+" ");
        System.out.println(lastocc(arr, n, key));
    }
}
