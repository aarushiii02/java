package patterns;

import java.util.Scanner;

public class floyds {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int num=1;
        for(int i=0;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
        sc.close();
    }
}
