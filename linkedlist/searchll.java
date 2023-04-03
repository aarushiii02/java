package linkedlist;

import java.util.LinkedList;
import java.util.*;

public class searchll {
    public static void main(String args[]){
        LinkedList<String> list=new 
        LinkedList<String>();
        // LinkedList<Integer> list1=new LinkedList<Integer>();
        // list1.add(1);
        // System.out.println(list1);
        list.addFirst("1");
        list.addLast("5");
         list.addLast("7");
          list.addLast("3");
         list.addLast("8");
        
         list.addLast("2");
         list.addLast("3");
         System.out.println(list);
         String val="7";
         for(int i=0;i<list.size();i++){
            if(list.get(i)==val){
                System.out.println(i);
                break;
            }
         }

    }
}
