package recursion.ques;

public class subseqstr {
    public static void subsequence(String str,int idx,String newstr){
        if(idx==str.length()){
            System.out.println(newstr);
            return;
        }
        char currchar=str.charAt(idx);
        //to go
        subsequence(str, idx+1, newstr+currchar);
        //not to go
        subsequence(str, idx+1, newstr);
    }
    public static void main(String args[]){
        String str="abc";
        subsequence(str, 0, "");
    }
}
