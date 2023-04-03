package recursion;

import java.util.Scanner;
public class xton {
//for stack heigth n

//     public static int calpow(int x,int n){
//         if(x==0){
//             return 0;
//         }
//         if(n==0){
//             return 1;
//         }
//          int xpnm1=calpow(x, n-1);
//          int xpow=x* xpnm1;
//          return xpow;
//     }
//for stack height logn
public static int calpow(int x,int n){
    if(x==0){
    return 0;
     }
    if(n==0){
      return 1;
     }
//if n is even
if(n%2==0){
    return calpow(x, n/2)* calpow(x, n/2);
}
else{
    return calpow(x, n/2)* calpow(x,n/2)*x;
}
                    
}
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int n=sc.nextInt();
        System.out.println(calpow(x, n));
    }
}
