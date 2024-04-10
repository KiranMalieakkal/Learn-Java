
class Node {
    int data;
    Node next;

 Node(int data){
        this.data=data;
        this.next=null;
    }
    
}

class LinkedList{
    public static void main(String[] args) {
        Node head = new Node(10);
        Node node1 = new Node(20);
        Node node2 = new Node(30);
        head.next = node1;
        node1.next= node2;  
        print(head);
        System.out.println(search(head,20));
        Node head1= new Node(200);
        insert(head1,11111);
        print(head1);
        head1=insert(head1,99);
        System.out.println("b4r");
        print(head1);
        System.out.println("after");
        head1=insert2(head1,999);
        print(head1);
        Node head2= null;
        head2= insert(head2,88);
        print(head2);


    }
    public static Node insert(Node head,int x){
        Node newnode= new Node(x);
        Node last=head;
        if(head== null){
            return newnode;
        }
        while(last.next!=null){
            last=last.next;
        }
        last.next=newnode;
        return head;
        }
        public static Node insert2(Node head,int x){
            head= head.next;
            return head;
            }
    public static Node insertBegin(Node head,int x){
        Node temp= new Node(x);
        temp.next=head;
        return temp;
        }
    
    public static void print(Node head){
        Node x= head;
        
        while (x!=null){
            System.out.println(x.data);
            x=x.next;
        }
    }

    public static int search(Node head,int x){
        Node Y= head;
        int j=0;
        while(Y!=null){
            if (Y.data==x) return j;
            Y=Y.next;
            j++;
        }
        return -1;
    }


}
