package LinkedList.Lists;
import LinkedList.Nodes.Node;

public class SinglyLinkedList {
    private Node head;

    public SinglyLinkedList(){
        head=null;
    }

    //isEmpty
    public boolean isEmpty(){return (head==null);}

    //insert
    public void insertAtBeg(int data){
        Node newNode = new Node(data);

        if(isEmpty()){
            head = newNode;
        }

        Node temp = head;

        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
    }

}
