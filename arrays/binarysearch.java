package arrays;

public class binarysearch {
    public static int search(int arr[],int k){
        int s=0;int e=arr.length-1;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(arr[mid]==k){
                return mid;
            }
            else if(arr[mid]>k){
                e=mid-1;
            }else{
                s=mid+1;
            }
           
        }
         return -1;
    }
    public static void main(String args[]){
        int a[]={1,2,3,4,5,6};
        int k=3;
        System.out.println(search(a, k));

    }
}
