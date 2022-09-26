package LinkedList.Nodes;

public class DLLNode {
    int data;
    Node next;
    Node prev;

    public DLLNode(int data){
        this.data=data;
        this.next = this.prev=null;
    }

    public void displayNode(){
        System.out.print(this.data);
    }
}
