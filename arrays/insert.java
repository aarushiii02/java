
package arrays;
import java.util.*;

public class insert {
    public static int[] insertidx(int n,int pos,int arr[],int ele){
        int newarr[]=new int[n+1];
        for(int i=0;i<n+1;i++){
            if(i<pos-1){
                newarr[i]=arr[i];
            }
            else if(i==pos-1){
                newarr[i]=ele;
            }
            else{
                newarr[i]=arr[i-1];
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
        int pos=sc.nextInt();
        int ele=sc.nextInt();
        // System.out.println(insertidx(n,idx,arr,ele));
        arr=insertidx(n, pos, arr, ele);
        System.out.println(Arrays.toString(arr));

    }
}
