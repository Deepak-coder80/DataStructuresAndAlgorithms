package Queues;


public class MyIntQueue {
    int array[];
    int size;
    int front;
    int rare;

    public MyIntQueue(int size){
        this.size=size;
        this.array=new int[size];
        this.front=-1;
        this.rare=0;
    }

    public boolean isEmpty(){return (front==-1||rare==size-1);}

    public boolean isFull(){return (front==size-1);}

    public void enqueue(int data){
        if(isFull()){
            return;
        }
        array[++front]=data;
    }

    public int dequeue(){
        if(isEmpty()){
            return -1;
        }
        int data = array[rare];
        rare++;
        return data;
    }
}
