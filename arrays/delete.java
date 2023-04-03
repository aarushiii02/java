package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class delete {
    public static int[] deleteidx(int arr[],int n,int idx){
        if(arr==null||idx<0||idx>=arr.length){
            return arr;
        }
        int newarr[]=new int[arr.length-1];
        for(int i=0,k=0;i<arr.length;i++){
            if(i==idx){
            continue;
        }
        else{
            newarr[k++]=arr[i];
        }
        }
        return newarr;

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int idx=sc.nextInt();
        arr=deleteidx(arr, n, idx);
        System.out.println(Arrays.toString(arr));
    }
}
