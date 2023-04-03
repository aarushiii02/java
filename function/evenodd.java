
package function;

import java.util.Scanner;

public class evenodd {
    public  static void eo(int n){
      
            if(n%2==0){
                System.out.println("evem");
            }
            else{
                System.out.println("odd");
            }
        }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        eo(n);
    }
}
