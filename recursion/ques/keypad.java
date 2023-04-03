package recursion.ques;

public class keypad {
    public static String[] keys={"","abc","def","ghi","jkl","mno","pors","tu","vwx","yz"};
    public static void printcomb(String str,int idx,String combination){
        if(idx==str.length()){
            System.out.println(combination);
            return;
        }
        char currchar=str.charAt(idx);
        String keyidx=keys[currchar-'0'];
        for(int i=0;i<keyidx.length();i++){
             printcomb(str, idx+1, combination+keyidx.charAt(i));
        }
       

    }
    public static void main(String args[]){
        String str="23";
        printcomb(str, 0, "");
    }
}
