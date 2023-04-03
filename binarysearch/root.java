package binarysearch;

import java.util.Scanner;

public class root {
    public static int binarysearch(int n){
        int s=0;int e=n;int mid=s+(e-s)/2;
        int ans=-1;
        while(s<=e){
            int square=mid*mid;
            if(square==n){
                return mid;
                // s=mid+1;
            }
            else if(square<n){
                ans=mid;
                s=mid+1;
             
            }
            else{
                e=mid-1;
            }
            mid=s+(e-s)/2;
        }
        return ans;
    }
    public static double root(int n,int tempsol){
        double factor=1;
        double ans=tempsol;
        for(int i=0;i<3;i++){
            factor/=10;
            for(double j=ans;j*j<n;j=j+factor){
                ans=j;
            }
        }
        return ans;

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int tempsol=binarysearch(n);
        System.out.println(tempsol); 
        System.out.println(root(n, tempsol));

    }
}
