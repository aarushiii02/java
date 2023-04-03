package linkedlist;

public class reverse {
    node head=null;
    node tail=null;

    class node{
        int data;
        node next;
        node(int data){
            this.data=data;
            next=null;
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
    public void atlast(int data){
        node temp=new node(data);
        if(head==null){
            head=temp;
            tail=temp;
            return;
        }
        tail.next=temp;
        tail=temp;
    }
    public void atpos(int data,int pos){
        if(pos==1){
            athead(data);
            return;
        }
        node temp=head;
        int cnt=1;
        while(cnt<pos-1){
            temp=temp.next;
            cnt++;
        }
        if(temp.next==null){
            atlast(data);
            return;
        }
        node newnode=new node(data);
        newnode.next=temp.next;
        temp.next=newnode;
    }
    public void display(){
        node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public void reverseiterater(){
        if(head==null || head.next==null){
            return;
        }
        node prevnode=head;
        node currnode=head.next;
        while(currnode!=null){
            node nextnode=currnode.next;
            currnode.next=prevnode;
            //updation
            prevnode=currnode;
            currnode=nextnode;
        }
        head.next=null;
        head=prevnode;
    }
    public node reverserec(node head){
        if(head==null || head.next==null){
            return head;
        }
        node newhead=reverserec(head.next);
        head.next.next=head;
        head.next=null;
        return newhead;
    }
    public static void main(String args[]){
        reverse ll=new reverse();
        ll.athead(10);
        ll.atlast(20);
        ll.atlast(30);
        ll.atlast(50);
        ll.atpos(40,4);
        ll.display();
        ll.reverseiterater();
        ll.display();
        ll.head= ll.reverserec(ll.head);
        ll.display();

    }
}
