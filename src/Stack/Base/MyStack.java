package Stack.Base;

public class MyStack {
    private char array[];
    private  int size;
    private int top;

    //constructor
    public MyStack(int size){
        this.size=size;
        array=new char[size];
        top=-1;
    }

    //is Empty
    public boolean isEmpty(){return (top==-1);}

    //is Full
    public boolean isFull(){return (top==size-1);}

    //push
    public void push(char data){
        if(isFull()){
            System.out.println("Stack is Full");
            return;
        }
        array[++top]=data;
    }

    //pop
    public char pop(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
            return '0';
        }
        char data = array[top];
        top--;
        return  data;
    }

    //peek
    public  char peek(){return array[top];}
}
