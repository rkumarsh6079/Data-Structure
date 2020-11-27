class Node{
    int data;
    Node head;
    Node next;
    Node(){
        head=next=null;
    }
    Node(int data){
        this.data = data;
        next=null;
    }
    public Node insert(int data){
        if(head == null)
        {
            head = new Node(data);
            return head;
        }
        Node curr = head;
        while(curr.next!=null){
            curr = curr.next;
        }
        curr.next = new Node(data);
        return head;
    }
    
    public void printlist(){
        if(head == null){
            return;
        }
        Node curr = head;
        while(curr!=null){
            System.out.print(curr.data+" ");
            curr = curr.next;
        }
    }
    
    public void reverse(){
        head = reverseList(head);
    }
    
    private Node reverseList(Node head){
        if(head == null){
            return head;
        }
        Node prev = null;
        Node curr = head;
        Node run = head;
        
        while(curr!=null){
            curr=curr.next;
            run.next=prev;
            prev = run;
            run = curr;
        }
        head = prev;
        return head;
    }
}
public class ReverseLinkedList {
    public static void main(String args[]) {
      Node node = new Node();
      node.insert(1);
      node.insert(2);
      node.insert(3);
      node.printlist();
      node.reverse();
      node.printlist();
    }
}