
class Node{
    Node head;
    Node next;
    int data;
    Node(){
        head=next=null;
    }
    Node(int data){
        this.data=data;
        next=null;
    }
    void insert(int data){
        Node node = new Node(data);
        if(head == null){
            head=node;
        }
        else{
            Node curr = head;
            while(curr.next!=null){
                curr=curr.next;
            }
            curr.next = node;
        }
    }
    void delete(int data){
        if(head==null)
        return;
        if(head.data==data){
            head=head.next;
            return;
        }
        Node curr = head.next;
        Node prev = head;
        while(curr!=null){
            if(curr.data==data){
                prev.next=curr.next;
                return;
            }
            curr=curr.next;
            prev=prev.next;
        }
    }
    void printlist(){
        Node curr = head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
    }
    
}
public class InsertAndDelete {
    public static void main(String args[]) {
      int x=10;
      int y=25;
      int z=x+y;
        Node list = new Node();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.delete(4);
        list.printlist();
      System.out.println("Sum of x+y = ");
    }
}
