package arraylist;

import java.util.ArrayList;
import java.util.Collections;



public class basic {
    public static void main(String args[]){
        ArrayList<Integer> list=new ArrayList<>();
        list.add(0);
        list.add(1);
        list.add(2);
        System.out.println(list);
        int ele=list.get(1);
        System.out.println(ele);
        list.add(1,2 );
        System.out.println(list);
        list.set(0, 5);
        System.out.println(list);
        list.remove(2);
        System.out.println(list);
        int size=list.size();
        System.out.println(size);
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i));
        }
        System.out.println();
        Collections.sort(list);
        System.out.println(list);


    }
  
}
