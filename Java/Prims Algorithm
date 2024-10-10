import java.util.Arrays;
import java.util.Scanner;

public class Prims_Algorithm {
    static void primsgraph(int[][] cost,int v){
        int mincost=0;
        int edge_count=1;
        boolean[] visited=new boolean[v];
        Arrays.fill(visited,false);
        visited[0]=true;
        while(edge_count<v){
            int INF=999;
            int min=INF;
            int x=0,y=0;
            for (int i = 0; i < v; i++) 
            {
                if (visited[i]==true)
                {
                    for (int j = 0; j < v; j++)
                      {
                        if(visited[j]!=true && min>cost[i][j]){
                            min=cost[i][j];
                            x=i;
                            y=j;
                        }
                    }
                }
            }
            visited[y]=true;
            System.out.printf("Edge is (%d,%d) and min cost is %d\n",x,y,cost[x][y]);
            mincost+=cost[x][y];
            edge_count++;
        }
        System.out.println("Minimum Cost is: "+mincost);
    }
    public static void main(String[] args)
  {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. of Vertices:");
        int v=sc.nextInt();
        System.out.println("Enter the Adjacency Matrix:");
        int cost[][]=new int[v][v];
        for (int i = 0; i < v; i++)
          {
            for (int j = 0; j < v; j++)
              {
                cost[i][j]=sc.nextInt();
            }
        }
        primsgraph(cost,v);

    }
}
