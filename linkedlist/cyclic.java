package linkedlist;



public class cyclic {
    node head=null;
    node tail=null;
    class node{
        int data;
        node next;
        node(int data){
            this.data=data;
            this.next=null;
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
    // public boolean cyclicdet(node head){
    //     if(head==null || head.next==null){
    //         return false;
    //     }
    //     node slow=head;
    //     node fast=head;
    //     while(fast!=null && fast.next!=null){
    //         slow=slow.next;
    //         fast=fast.next.next;
    //         if(slow==fast){
    //             return true;
    //         }

    //     }
    //     return false;
    // }
    public node middleNode(node head) {
        if(head==null){
            return head;
        }
        node slow=head;
        node fast=head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
   }
    public static void main(String args[]){
        cyclic ll=new cyclic();
        ll.athead(10);
        ll.attail(20);
        ll.attail(30);
        ll.attail(40);
        ll.attail(50);
        ll.display();
        // boolean cycle=ll.cyclicdet(ll.head);
        // System.out.println(cycle);

    }
}
