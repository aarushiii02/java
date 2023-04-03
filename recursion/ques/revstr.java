package recursion.ques;

import java.util.Scanner;

public class revstr {
    public static void printrev(String str,int idx){
        if(idx==0){
            System.out.println(str.charAt(idx));
            return;
        }
        System.out.println(str.charAt(idx));
        printrev(str, idx-1);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        // String str="abcd";
        printrev(str, str.length()-1);

    }
}
