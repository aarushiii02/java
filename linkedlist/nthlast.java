package linkedlist;

public class nthlast {
    node head=null;
    node tail=null;
    int size=0;
    class node{
        int data;
        node next;
        node(int data){
            this.data=data;
            this.next=null;
            size++;
        }
    }
    public void athead(int data){
        node temp=new node(data);
        if(head==null){
            head=temp;
            tail=temp;
            return;
        }
        temp.next=head;
        head=temp;
    }
    public void attail(int data){
        node temp=new node(data);
        if(head==null){
            head=temp;
            tail=temp;
            return;
        }
        tail.next=temp;
        tail=temp;
    }
    public void display(){
        node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    // public void findnode(int pos){
    //     if(head.next==null){
    //         return;
    //     }
    //     int size=0;
    //     node curr=head;
    //     while(curr!=null){
    //         curr=curr.next;
    //         size++;
    //     }
    //     // node temp=head.next;
    //     if(pos==size){
    //         return;
    //     }
    //     curr=head;
    //     int indextosearch=size-pos+1;
    //     for(int i=1;i<indextosearch;i++){
    //         curr=curr.next;
    //         System.out.print(curr.data+" ");
    //     }
       
    // }
    public node removenth(int pos){
        if(head.next==null){
            return null;
        }
        int size=0;
        node curr=head;
        while(curr!=null){
            curr=curr.next;
            size++;
        }
        if(pos==size){
            return head.next;
        }
        int indextosearch=size-pos;
        node prev=head;
        int i=1;
        while(i<indextosearch){
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;
        return head;
        
    }
    public static void main(String args[]){
        nthlast list=new nthlast();
        list.athead(20);
        list.athead(10);
        list.attail(30);
        list.attail(40);
        list.attail(50);
        list.display();
        
        // list.findnode(2);
        // list.display();
        list.removenth(2);
        list.display();
    }
}
