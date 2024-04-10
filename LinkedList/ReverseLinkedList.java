class Node{
    int data;
    Node next;
    Node(int data){
        this.data= data;
        next=null;
    }
}
 class ReverseLinkedList {

    public static void main(String[] args) {
        Node head = new Node(10);
        Node node1 = new Node(20);
        Node node2 = new Node(30);
        Node node3 = new Node(40);
        //c is for circular linked list and function delete(is written for deleting the head of a circular linked list)
        Node chead = new Node(10);
        Node cnode1 = new Node(20);
        Node cnode2 = new Node(30);
        Node cnode3 = new Node(40);

        head.next=node1;
        node1.next=node2;
        node2.next=node3;
        chead.next=cnode1;
        cnode1.next=cnode2;
        cnode2.next=cnode3;
        cnode3.next=chead;
       // System.out.print(chead==cnode3.next);
       // print(head);
        //head= reverse(head);
        //print(head);
        //print(chead);
      // cprint(chead);  
       Node rear =null;
       Node front=null;
       Node newnode1= new Node(333);
       rear=front=newnode1;
       Node newnode2=new Node(444);
       rear.next=newnode2;
       rear=newnode2;
       System.out.println(rear.next.data);
       System.out.println(front);  
        
    }



    public static Node reverse(Node head){
        Node prev=null;
        Node curr=head;
        if (head== null) return null;
        if (head.next==null) return head;
        while(curr!=null){
            Node next= curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;

    }
    public static Node delete(Node chead){
        Node curr;
        curr=chead;
        while(curr.next!=chead) curr=curr.next;
        curr.next= chead.next;
        return curr.next;


    }
    public static void print(Node head){
        Node x= head;
        
        while (x!=null){
            System.out.println(x.data);
            x=x.next;
        }
    }
    public static void cprint(Node chead){
        Node x= chead;
        if(x==chead){
        System.out.println(x.data);
        System.out.println(chead.data);    
        }
        System.out.println(x);
        System.out.println(chead);
        do{
            System.out.println(x.data);
            x=x.next;
        }while(x!=chead);
        
    }

}