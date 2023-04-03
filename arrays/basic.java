package arrays;

public class basic {
    public static void main(String args[]){
        // int[] marks=new int[3];
        int marks[]={97,98,91};
        // int marks[]=new int[3]; 
        marks[0]=97;
        marks[1]=98;
        marks[2]=91;
        // System.out.println(marks[0]);
        // System.out.println(marks[1]);
        // System.out.println(marks[2]);
        for(int i=0;i<3;i++){
            System.out.println(marks[i]);
        }
    }
}
