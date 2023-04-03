package recursion.ques;

public class totalpath {
    public static int paths( int i,int j,int n,int m){
        if(i==n || j==m){
            return 0;
        }
        if(i==n-1 && j==m-1){
            return 1;
        }
        int down=paths(i+1, j, n, m);
        int right=paths(i, j+1, n, m);
        return down+right;
    }
    public static void main(String args[]){
        int n=3,m=3;
        System.out.println(paths(0, 0, n, m));
    }
}
