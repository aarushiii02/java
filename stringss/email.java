package stringss;

import java.util.Scanner;

import javax.xml.transform.Source;

public class email {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String email=sc.next();
        String usernanme="";
        for(int i=0;i<email.length();i++){
            if(email.charAt(i)=='@'){
                break;
            }
            else{
                usernanme+=email.charAt(i);
            }
        }
        System.out.println(usernanme);
    }
}
