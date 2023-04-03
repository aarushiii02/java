package recursion.ques;

public class removeduplicate {
    public static boolean[] map=new boolean[26];
    public static void remove(String str,int idx,String newstr){
        if(idx==str.length()){
            System.out.println(newstr);
            return;
        }
        char currchar=str.charAt(idx);
        if(map[currchar-'a']==true){
            remove(str, idx+1, newstr);
        }
        else{
            newstr+=currchar;
            map[currchar-'a']=true;
            remove(str, idx+1, newstr);
        }
    }
    public static void main(String args[]){
        String str="aabbccda";
        remove(str, 0, "");
    }
}
