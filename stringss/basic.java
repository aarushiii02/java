package stringss;

import java.util.Scanner;

public class basic {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        // String name="tony";
        // String namef=sc.nextLine();
        // String namel=sc.nextLine();
        // String name=namef +" "+namel;
        // System.out.println(name);
        // System.out.println(name.length());
        // for(int i=0;i<name.length();i++){
        //     System.out.println(name.charAt(i));
        // }
        String namef="aaru";
        String namel="pyaru";
        // if(namef.compareTo(namel)==0){
        //    System.out.println("are equal");
        // }
        // else{
        //     System.out.println("not equal");
        // }
        // if(namef==namel){
        //     System.out.println("are equal");
        //  }
        //  else{
        //      System.out.println("not equal");
        //  }
        if(new String("tony")==new String("tony")){
            System.out.println("strings are equal");
        }
        else{
            System.out.println("strings are not");
        }
        sc.close();

    }
    
}
