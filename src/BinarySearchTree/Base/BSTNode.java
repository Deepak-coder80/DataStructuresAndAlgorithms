package BinarySearchTree.Base;

public class BSTNode {
    public int data;
    public BSTNode lchild;
    public BSTNode rchild;

    public BSTNode(int data){
        this.data=data;
        this.lchild=this.rchild=null;
    }
}
