package recursion.ques;

import java.util.HashSet;

public class uniquesubseq {
    public static void unique(String str,int idx,String newstr,HashSet<String>set){
        if(idx==str.length()){
            if(set.contains(newstr)){
                return;
            }
            else{
                System.out.println(newstr);
                set.add(newstr);
                return;
            }
            
            
        }
        char currchar=str.charAt(idx);
        //to go
        unique(str, idx+1, newstr+currchar, set);
        //not to go
        unique(str, idx+1, newstr, set);

    }
    public static void main(String args[]){
        String str="aaa";
        HashSet<String>set=new HashSet<>();
        unique(str, 0, "", set);
    }
}
