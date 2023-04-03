package linkedlist;

// import function.prime;

// import patterns.solidrect;

public class llstring {
    node head;
    private int size;
    llstring()
    {
        this.size=0;
    }
    class node{
        String data;
        node next;

        node(String data){
            this.data=data;
            this.next=null;
            size++;
        }
    }


    public void addatfirst(String data){
        node temp=new node(data);
        if(head==null){
            head=temp;
            return;
        }
        temp.next=head;
        head=temp;
    }
    public void addatlast(String data){
        node newnode=new node(data);
        if(head==null){
            head=newnode;
            return;
        }
        node currnode=head;
        while(currnode.next!=null){
            currnode=currnode.next;
        }
        currnode.next=newnode;

    }
    public void deletefirst(){
        if(head==null){
            System.out.println("the list is null");
            return;
        }
        size--;
        head=head.next;
    }
    public void deletelast(){
        if(head==null){
            System.out.println("this list is null");
            return;
        }
        size--;
        if(head.next==null){
            head=null;
            return;
        }
        node secondlast=head;
        node lastnode=head.next;//agr head.next=null--lastnode=null aur agr null.next kro toh errror hoga

        while(lastnode.next!=null){
            lastnode=lastnode.next;
            secondlast=secondlast.next;
        }
        secondlast.next=null;
    }
    public int getsize(){
        return size;
    }
    public void print(){
        if(head==null){
            System.out.print("list is empty");
        }
        node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public static void main(String args[]){
        llstring list=new llstring();
        list.addatfirst("a");
        list.addatfirst("is");
        list.print();
        list.addatlast("list");
        list.print();
        list.addatfirst("this");
        list.print();
        list.deletefirst();
        list.print();
        list.deletelast();
        list.print();
       System.out.println( list.getsize());
       list.addatfirst("this");
       System.out.println( list.getsize());
    }
}
