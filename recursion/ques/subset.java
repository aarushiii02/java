package recursion.ques;

import java.util.ArrayList;

class subset{
    public static void printsub(ArrayList<Integer> subset){
        for(int i=0;i<subset.size();i++){
            System.out.print(subset.get(i));
        }
        System.out.println();
    }
    public static void findsub(int n,ArrayList<Integer> subset){

        if(n==0){
            printsub(subset);
            return;
        }
        //add krna h 
        subset.add(n);
        findsub(n-1, subset);
        //add nhi krna h 
        subset.remove(subset.size()-1);
        findsub(n-1, subset);

    }
    public static void  main(String args[]){
        int n=3;
        ArrayList<Integer> subset=new ArrayList<>();
        findsub(n, subset);
    }
}