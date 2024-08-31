import java.util.Scanner;

class Graph
{
 class Edge
{
 int src,dest;
}
int no_vertices,no_edges;
Edge[] e;
Graph(int no_vertices,int no_edges)
{
 this.no_vertices=no_vertices;
 this.no_edges=no_edges;

 e = new Edge[no_edges];
 for(int i=0;i<no_edges;i++)
{
 e[i]=new Edge();
}

}
public static void main(String []args)
{
  Scanner s=new Scanner(System.in);
  System.out.println("Enter Number of Edges");
  int edges=s.nextInt();
  System.out.println("Enter Number of Vertices");
  int vertices=s.nextInt();
  Graph g=new Graph(vertices,edges);
  for(int i=0;i<edges;i++)
{
  System.out.println("Enter Source");
  g.e[i].src=s.nextInt();
 System.out.println("Enter Source");
  g.e[i].dest=s.nextInt(); 
}
System.out.println("Print Data of Graph");
for(int i=0;i<edges;i++)
{
 System.out.println("Edge no is-"+(i+1)+"Source is- "+g.e[i].src+"Destination is- "+g.e[i].dest);
}
  }

}
