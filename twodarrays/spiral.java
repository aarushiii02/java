package twodarrays;

import java.util.Scanner;

public class spiral {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int a[][]=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                a[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
        int rowS=0,rowE=n-1,colS=0,colE=m-1,cnt=n*m;
        //for rowst
    //     while(rowst<=rowend && colst<=colend){


    //     for(int col=colst;col<=colend;col++){
    //         System.out.print(a[rowst][col]+" ");
    //     }rowst++;
    //     //for colend


    //     for(int row=rowst;row<=rowend;row++){
    //         System.out.print(a[row][colend]+" ");
    //     }colend--;
    //     //for rowend


    //     for(int col=colend;col>=colst;col--){
    //         System.out.print(a[rowend][col]+" ");
    //     }rowend--;
    //     //for colst


    //     for(int row=rowend;row>=rowst;row--){
    //         System.out.print(a[row][colst]+" ");
    //     }colst++;
    // }
    int count=0;
    while(rowS<=rowE && colS<=colE){
        for(int col=colS; col<=colE && count<cnt ; col++){
            // cout<<arr[rowS][col]<<" ";
            System.out.print(a[rowS][col]);
            count++;
        }
        rowS++;
        for(int row = rowS; row<=rowE && count<cnt; row++){
            // cout<<arr[row][colE]<<" ";
            System.out.print(a[row][colE]);
           count++;
        }
        colE--;
        for(int col = colE; col>=colS && count<cnt; col--){
            // cout<<arr[rowE][col]<<" ";
            System.out.print(a[rowE][col]);
            count++;
        }
        rowE--;
        for(int row = rowE; row>=rowS && count<cnt; row--){
            // cout<<arr[row][colS]<<" ";
            System.out.print(a[row][colS]);
            count++;
        }
        colS++;
    }
    }
}
