package binarysearch;

import java.util.Scanner;

public class rotatedsearch {
    public static int pivotelement(int arr[],int n){
        int s=0;int e=n-1;int mid=s+(e-s)/2;
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
    public static int binarysearch(int arr[],int s,int e,int key){

        int mid=s+(e-s)/2;
        while(s<=e){
            if(arr[mid]>key){
                e=mid-1;
            }
            else if(arr[mid]==key){
                return mid;
            }
            else{
                s=mid+1;
            }
            mid=s+(e-s)/2;
        }
return -1;

    }
    public static int findpos(int arr[],int n,int key ){
        int pivot=pivotelement( arr, n);
        if(key>=arr[pivot] && key<=arr[n-1]){
               return binarysearch(arr,pivot,n-1,key); 
        }
        else{
            return binarysearch(arr,0,pivot-1,key);
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int key=sc.nextInt();
        System.out.println(findpos(arr, n, key)); 
        
    }
}
