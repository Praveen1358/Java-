package one;

import java.util.ArrayList;


    class Edge{
        int src;
        int dest;
       public  Edge(int src,int dest){
        this.src=src;
        this.dest=dest;
       }

    }
    public class Graph { 
    public static void creatGraph(ArrayList<Edge>[] graph){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();}
            graph[0].add(new Edge(1,11));
            graph[1].add(new Edge(11,14));
            graph[1].add(new Edge(11,17));
            graph[1].add(new Edge(11,13));
            graph[1].add(new Edge(11,12));
            graph[2].add(new Edge(12,15));
            graph[2].add(new Edge(12,16));


        
        }
   
    public static void main(String[] args){
        int V=4;
        ArrayList<Edge>[] graph=new ArrayList[V];
        creatGraph(graph);
        for(int i=0;i<graph.length;i++){
            System.out.println("Node "+i+" connects to: ");
        for( Edge e:graph[i]){
            System.out.println(e.dest+" ");

        }System.out.println();
    }
    
}
}