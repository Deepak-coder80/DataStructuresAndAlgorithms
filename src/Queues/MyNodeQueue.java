package Queues;

import BinarySearchTree.Base.BSTNode;
import LinkedList.Nodes.Node;

public class MyNodeQueue {
    BSTNode array[];
    int size;
    int front;
    int rare;

    public MyNodeQueue(int size){
        this.size=size;
        this.array=new BSTNode[size];
        this.front=-1;
        this.rare=0;
    }

    public boolean isEmpty(){return (front==-1||rare==size-1);}

    public boolean isFull(){return (front==size-1);}

    public void enqueue(BSTNode data){
        if(isFull()){
            return;
        }
        array[++front]=data;
    }

    public BSTNode dequeue(){
        if(isEmpty()){
            return null;
        }
        BSTNode data = array[rare];
        rare++;
        return data;
    }
}
