import BinarySearchTree.Base.BinarySearchTree;
import Graph.Graphs;
import Stack.StackApplications.Conversion;

public class Main {

    public static void main(String args[]){
        BinarySearchTree bst = new BinarySearchTree();

        bst.insert(20);
        bst.insert(10);
        bst.insert(30);

        bst.preOrder();
        System.out.println();
        bst.inOrder();
        System.out.println();
        bst.postOrder();
        System.out.println();
        bst.levelOrder();
        System.out.println();
        System.out.println(bst.count());
        System.out.println(bst.height());

    }
}
