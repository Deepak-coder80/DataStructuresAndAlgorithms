package Graph;

import Queues.MyIntQueue;

public class Graphs {
    // implement graph by adj. matrix
    int array[][];
    int size;

    public Graphs(int size){
        array = new int[size][size];
        this.size=size;
    }
    public Graphs(int[][] array,int size){
        this.array = array;
        this.size=size;
    }

    //BFS
    public void breadthFirstSearch(int u){
        MyIntQueue queue = new MyIntQueue(size+1);
        int visited[]=new int[size+1];
        System.out.print("BFS : "+u+", ");
        visited[u]=1;
        queue.enqueue(u);

        while(!queue.isEmpty()){
            int data = queue.dequeue();
            for(int v=1;v<=size;v++){
                if(array[data][v]==1 && visited[v]!=1){
                    System.out.print(v+", ");
                    visited[v]=1;
                    queue.enqueue(v);
                }
            }
        }

    }

    public void depthFirstSearch(int u){
        int visited[]=new int[size+1];
        if(visited[u]!=1){
            System.out.print(u+", ");
            visited[u]=1;

            for(int i=1;i<=size;i++){
                if(array[u][i]==1){
                    depthFirstSearch(i);
                }
            }
        }
        return;
    }
}
