package function;

import java.util.Scanner;

public class circum {
    public static double circumfernce(int r){
        double pi=3.14;
        double per=2*pi*r*r;
        return per;

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        System.out.println(circumfernce(r));
    }
}
