package linkedlist;

public class palindrome {
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
        temp=head;
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
            attail(data);
            return;
        }
        node nodetoinsert=new node(data);
        temp.next=nodetoinsert.next;
        temp.next=nodetoinsert;
    }
    public void display(){
        node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public node reverse(node head){
        if(head==null || head.next==null){
            return head;
        }
        node newhead=reverse(head.next);
        head.next.next=head;
        head.next=null;
        return newhead;
    }
    public node findmiddle(node head){
        node slow=head;
        node fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public boolean palindromeno(node head){
        if(head==null || head.next==null){
            return true;
        }
        node middle=findmiddle(head);
        node sechalfst=reverse(middle.next);
        node firsthalfst=head;
        while(sechalfst!=null){
            if(firsthalfst.data!=sechalfst.data){
                return false;
            }
            firsthalfst=firsthalfst.next;
            sechalfst=sechalfst.next;
        }
        return true;

    }
    public static void main(String args[]){
        palindrome list=new palindrome();
        list.athead(10);
        list.attail(20);
        list.attail(30);
        list.attail(40);
        list.attail(50);
        list.display();
        boolean pali=list.palindromeno(list.head);
        System.out.println(pali);
        
    }
}
