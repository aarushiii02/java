package recursion.ques;
class guest{
    public  static int call(int n){
        if(n<=1){
            return 1;
        }
        //for single
        int sig=call(n-1);
        //for pair
        int pair=(n-1)*call(n-2);
        return sig+pair;
    }
    public static void main(String args[]){
        int n=4;
        System.out.println(call(n));
    }
}