
class Node{
    int data;
    Node root;
    Node right;
    Node left;
    Node(){
        root=right=left=null;
    }
    Node(int data){
        this.data = data;
        right=left=null;
    }
    public void insert(int data){
        root = insertNode(root,data);
    }
    private Node insertNode(Node root, int data){
        if(root == null){
            root = new Node(data);
            return root;
        }
        if(root.data > data){
            root.left = insertNode(root.left,data);
        }else{
            root.right = insertNode(root.right,data);
        }
            
        return root;
    }
    
    public void print(){
        int len = calLen(root);
        for(int i=0;i<len;i++){
            printNode(root,i);
        }
    }
    void printNode(Node root, int len){
        if(root == null){
            return;
        }else if(len == 0){
            System.out.print(root.data+" ");
        }else if(len > 0){
            printNode(root.left, len-1);
            printNode(root.right, len -1);
        }
    }
    int calLen(Node root){
        if(root == null){
            return 0;
        }else{
            return 1+Math.max(calLen(root.left),calLen(root.right));
        }
    }
    
    public void reverse(){
       root = rev(root);
    }
    Node rev(Node root){
        if(root == null)
        return root;
        Node tmp = root.right;a
        root.right = rev(root.left);
        root.left = rev(tmp);
        return root;
    }
}

public class ReverseBST {
    public static void main(String args[]) {
      int x=10;
      int y=25;
      int z=x+y;
    Node node = new Node();
    node.insert(10);
    node.insert(20);
    node.insert(5);
    node.insert(2);
    node.insert(6);
    node.print();
    System.out.println();
    node.reverse();
    node.print();
      
    }
}
