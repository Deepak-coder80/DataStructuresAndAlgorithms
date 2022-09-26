package LinkedList.Nodes;

public class Node {
    public int data;
    public Node next;

    public Node(int data){
        this.data=data;
        this.next = null;
    }

    public void displayNode(){
        System.out.print(this.data);
    }
}
