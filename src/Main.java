import BinarySearchTree.Base.BinarySearchTree;
import Graph.Graphs;
import Stack.StackApplications.Conversion;

public class Main {

    public static void main(String args[]){
        BinarySearchTree bst = new BinarySearchTree();

        bst.insert(20);
        bst.insert(10);
        bst.insert(30);
        System.out.println();
        bst.ItepreOrder();
        System.out.println();
        System.out.println(bst.ItepostOrder().toString());
    }
}
