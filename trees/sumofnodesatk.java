package trees;

import java.util.LinkedList;
import java.util.Queue;

public class sumofnodesatk {
    static class node{
        int data;
        node left;
        node right;
        node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    static class binarytree{
        static int idx=-1;
        public static node buildtree(int nodes[]){
            idx++;
            if(nodes[idx]==-1){
                return null;
            }
            node newnode=new node(nodes[idx]);
            newnode.left=buildtree(nodes);
            newnode.right=buildtree(nodes);
            return newnode;

        }
    }
    public static int levelsum(node root,int k){
        if(root==null){
            return 0;
        }
        Queue<node> q=new LinkedList<>();
        q.add(root);
        int level=0;
        int sum=0;
        int flag=0;
        while(!q.isEmpty()){
           int size=q.size();
           while(size-->0){
            node newnode=q.peek();
            q.remove();
            if(level==k){
                flag=1;
                sum+=newnode.data;
            }
            else{
                if(newnode.left!=null){
                    q.add(newnode.left);
                }
                if(newnode.right!=null){
                    q.add(newnode.right);
                }
            }
        }
            level++;
            if(flag==1){
                break;
            }
           }
        return sum;

    }

    

    public static void main(String args[]){
        int nodes[]={1,2,3,-1,-1,4,-1,-1,5,-1,6,-1,-1};
        binarytree tree=new binarytree();
        node root=tree.buildtree(nodes);
        System.out.println(root.data);
        // Queue<node>q=new LinkedList<>();
        int k=1;
        int result=levelsum(root, k);
        System.out.println(result);

    }
}
