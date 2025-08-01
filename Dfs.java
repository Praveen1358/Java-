package twentynine;
import java.util.*;

public class Dfs {
    static void dfs(int node,boolean[] visited,List<List<Integer>>adj){
        visited[node]=true;
        System.out.print(node+" ");
        for(int it:adj.get(node)){
            if(!visited[it])
            dfs(it,visited,adj);
        }}
        public static void main(String[] args) {
            int v=5;
            List<List<Integer>> adj = new ArrayList<>();
            for(int i=0;i<v;i++)
            adj.add(new ArrayList<>());
            adj.get(0).add(1);
            adj.get(0).add(4);
            adj.get(1).add(0);
            adj.get(1).add(3);
            boolean[] visited=new boolean[v];
            System.out.println("DFS Traversal:");
            dfs(0,visited,adj);
        
    }
    
}
