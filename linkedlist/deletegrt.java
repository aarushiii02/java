package linkedlist;

import java.util.LinkedList;
import java.util.Scanner;

public class deletegrt {
    public static void main(String args[]){
        LinkedList<Integer> list=new LinkedList<Integer>();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n>0){
            list.add(sc.nextInt());
            n--;
        }
        for(int i=0;i<list.size();i++){
            if(list.get(i)>=25){
                list.remove();
            }
        }
       System.out.println(list);
       sc.close();
    } 
}
