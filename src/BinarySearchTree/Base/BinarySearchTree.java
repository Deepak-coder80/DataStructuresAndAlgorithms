package BinarySearchTree.Base;

import Queues.MyNodeQueue;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinarySearchTree {
    private BSTNode root;

    public BinarySearchTree(){
        root =null;
    }

    //recursive insert
    private BSTNode insert(BSTNode local_root,int data){
        if(local_root==null){
            BSTNode newNode = new BSTNode(data);
            return newNode;
        }else if(local_root.data>data){
            local_root.lchild=insert(local_root.lchild,data);
            return local_root;
        }
        local_root.rchild=insert(local_root.rchild,data);
        return local_root;
    }
    public void insert(int data){
        BSTNode newNode = new BSTNode(data);
        if(root==null){
            root=newNode;
            return;
        }
        insert(root,data);
    }

    //recursive preorder
    private void preOrder(BSTNode node){
        if(node==null){
            return;
        }
        System.out.print(node.data+" , ");
        preOrder(node.lchild);
        preOrder(node.rchild);
    }

    public void preOrder(){
        if(root==null){
            return;
        }
        preOrder(this.root);
    }
    //recursive inOrder
    private void inOrder(BSTNode node){
        if(node==null){
            return;
        }
        inOrder(node.lchild);
        System.out.print(node.data+" , ");
        inOrder(node.rchild);
    }

    public void inOrder(){
        if(root==null){
            return;
        }
        inOrder(this.root);
    }
    //recursive postorder
    private void postOrder(BSTNode node){
        if(node==null){
            return;
        }
        preOrder(node.lchild);
        preOrder(node.rchild);
        System.out.print(node.data+" , ");
    }

    public void postOrder(){
        if(root==null){
            return;
        }
        postOrder(this.root);
    }

    //level order
    public void levelOrder(){
        BSTNode node = root;
        MyNodeQueue queue = new MyNodeQueue(count());
        System.out.println(node.data);
        queue.enqueue(node);
        while(!queue.isEmpty()){
            BSTNode p = queue.dequeue();
            if(p.lchild!=null){
                System.out.println(p.lchild.data);
                queue.enqueue(p.lchild);
            }
            if(p.rchild!=null){
                System.out.println(p.rchild.data);
                queue.enqueue(p.rchild);
            }
        }
    }

    //count of tree
    private int count(BSTNode node){
        int x,y;
        if(node != null){
            x = count(node.lchild);
            y= count(node.rchild);
            return x+y+1;
        }
        return 0;
    }

    public int count(){
        if(root==null){
            return 0;
        }
        int data=count(this.root);
        return data;
    }

    //height of tree
    public int height(){
        if(root==null){
            return  0;
        }

        return height(this.root);
    }

    private int height(BSTNode node){
        int x,y;
        if(node!=null){
            x=height(node.lchild);
            y=height(node.rchild);
            if(x>y){
                return x+1;
            }else{
                return y+1;
            }
        }
        return 0;
    }

    //Iterative insert
    public void insertIteratively(int data){
        BSTNode newNode = new BSTNode(data);

        BSTNode x= root;
        BSTNode y = null;

        while(x != null){

            y=x;
            if(data<x.data){
                x=x.lchild;
            }else{
                x=x.rchild;
            }

        }

        if(y==null){
            y=newNode;
        }else if(data<y.data){
            y.lchild=newNode;
        }else{
            y.rchild=newNode;
        }

    }

    //iterative
    //postorder
    public List<Integer> ItepostOrder(){
        Stack<BSTNode> st1 = new Stack<BSTNode>();
        Stack<BSTNode> st2 = new Stack<BSTNode>();
        List<Integer> postOrder = new ArrayList<Integer>();

        if(root==null){
            return  null;
        }
        BSTNode Temp = root;
        st1.push(Temp);
        while(!st1.isEmpty()){
            Temp=st1.pop();
            st2.push(Temp);
            if(Temp.lchild!=null){
                st1.push(Temp.lchild);
            }
            if(Temp.rchild!=null){
                st1.push(Temp.rchild);
            }
        }
        while(!st2.isEmpty()){
            postOrder.add(st2.pop().data);
        }
        return postOrder;
    }

    public void ItepreOrder(){
        BSTNode t= root;
        Stack<BSTNode> stack = new Stack<>();
        while(t!=null || !stack.isEmpty()){
            if(t!=null){
                System.out.print(t.data+",");
                stack.push(t);
                t=t.lchild;
            }else{
                t=stack.pop();
                t=t.rchild;
            }
        }
    }
}
