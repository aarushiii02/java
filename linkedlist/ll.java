package linkedlist;



// import org.w3c.dom.Node;

public class ll {
    node head=null;
    node tail=null;
    int size=0;
    ll(){
        this.size=0;
    }
     class node{
       int data;
       node next;
       node(int data){
        this.data=data;
        this.next=null;
        size++;
       }
      
    }
    // private node head;
    // private node tail;
    // private int size;
    public void display(){
        node temp=this.head;
        while(temp!=null){
            System.out.print(temp.data +" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public void insertathead(int data){
        node temp=new node(data);
        if(head==null){
            head=temp;
            tail=temp;
            return;
        }
        temp.next=head;
        head=temp;
        

    }
    public void insertattail(int data){
        node temp=new node(data);
        if(head==null){
            head=temp;
            tail=temp;
          size++;
          return;
        }
        
        else{
            tail.next=temp;
        tail=temp;
        size++;
        return;
        }
        
        // if(head==null){
        //     head=temp;
        //     return;
        // }
        // node currnode=head;
        // while(currnode.next!=null){
        //     currnode=currnode.next;
        // }
        // currnode.next=temp;

        
        
    }
    public void insertatpos(int data,int pos){
        if(pos==1){
            insertathead(data);
            return;
        }
        node temp=head;
        int cnt=1;
        while(cnt<pos-1){
        temp=temp.next;
        cnt++;
        }
        if(temp.next==null){
            insertattail(data);
            return;
        }
        node nodetoinsert=new node(data);
        nodetoinsert.next=temp.next;
        temp.next=nodetoinsert;

    }
    public void getfirst(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        System.out.println(head.data);
    }
    public void getatlast(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        node currnode=head;
        while(currnode.next!=null){
            currnode=currnode.next;
        }
        System.out.println(currnode.data);


    }
    public void getsize(){
        int size=0;
        node temp=head;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        System.out.println(size);
    }
    public void getat(int idx){
   
    if(idx==0){
        System.out.println("empty");
        return;
    }
    if(idx<0 || idx>=this.size){
        System.out.println("invalid");
        return;
    } 
    node temp=this.head;
    for(int i=0;i<=idx-1;i++){
        temp=temp.next;
    }
    System.out.println(temp.data);
        
    }
    public void deletenode(int pos){
        if(pos==1){
            node temp=head;
            head=head.next;
            temp.next=null;
            return;

        }
        
        else{
            node curr=head;
            node prev=null;
            int cnt=1;
            while(cnt<pos){
                prev=curr;
                curr=curr.next;
                cnt++;
            }size--;
            prev.next=curr.next;
            curr.next=null;
            return;
        }
        

    }
    public void removefrome(int pos){

    }
    // public static node[] makeLL(node head, node tail, int ele){
    //     node n=new node(ele);
    //     n.data=ele;
    //     node a[] = new node[2];
    //     if(head == null){
    //         head = n;
    //         tail = n;
            
    //         a[0] = head;
    //         a[1] = tail;
            
    //         return a;
    //     }
        
    //     tail.next = n;
    //     tail = n;
        
    //     a[0] = head;
    //     a[1] = tail;
        
    //     return a;
    // }
    public static void main(String args[]){
        // Scanner sc=new Scanner(System.in);
        // int n=sc.nextInt();
        // node head = null;
        // node tail = null;
        // for(int i=0; i<n;i++){
        // int ele = sc.nextInt();
        // node a[] = makeLL(head, tail, ele);
        // head = a[0];
        // tail = a[1];
        ll list=new ll();
        // list.display();
        // list.makeLL(null, null, 0)
        list.insertathead(10);
        list.insertathead(20);
        list.insertathead(30);
        list.display();
        list.insertattail(40);
        list.display();
        list.getfirst();
        // list.display();
        list.getatlast();
        list.insertatpos(32, 2);
        list.display();
        list.getsize();
        list.deletenode(2);
        list.display();
        list.getat(3);


    }
}

