package Stack.Base;

public class MyIntStack {
    private int array[];
    private  int size;
    private int top;

    //constructor
    public MyIntStack(int size){
        this.size=size;
        array=new int[size];
        top=-1;
    }

    //is Empty
    public boolean isEmpty(){return (top==-1);}

    //is Full
    public boolean isFull(){return (top==size-1);}

    //push
    public void push(int data){
        if(isFull()){
            System.out.println("Stack is Full");
            return;
        }
        array[++top]=data;

    }

    //pop
    public int pop(){
        if(isEmpty()){
            System.out.println("Stack is Empty");
            return '0';
        }
        int data = array[top];
        top--;
        return  data;
    }

    //peek
    public  int peek(){return array[top];}
}
