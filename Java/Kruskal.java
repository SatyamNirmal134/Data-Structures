import java.util.Scanner;
 class Kruskal
  {
         static int v;
         static int parent[];
         static int find(int i)
         {
           while(parent[i]!=i)
             {
                     i=parent[i];
             }
              return i;
         }
         static void union(int i,int j)
         {
             int a=find(i);
             int b=find(j);
              parent[a]=b;
         }
         static void kruskalMST(int cost[][])
         {
              int minCost=0;
              for(int i=0;i<v;i++)
                    parent[i]=i;
               int edge_count=1;
               while(edge_count<v)
               {
                   int min=999,x=0,y=0;
                   for(int i=0;i<v;i++)
                   {
                      for(int j=0;j<v;j++)
                      {
                           if(find(i)!=find(j)  && min>cost[i][j])
                             {
                                 min=cost[i][j];
                                 x=i;
                                 y=j;
                             }
                      }    
                   }
                   union(x,y);
                   System.out.printf("Edge %d (%d ,%d) cost %d \n",edge_count++,x,y,min);
                       minCost=minCost+cost[x][y];
             }      
             System.out.println("Minimum Cost is- "+minCost);
         }
         
         
         public static void main(String[]args)
         {
              Scanner sc=new Scanner(System.in);
             
              System.out.print("Enter the number of vertices : ");
              v=sc.nextInt();
              parent=new int[v];
              int arr[][]=new int[v][v];
             
              System.out.print("Enter the weight of the vertices inside the matrix Use 999 as infinity");
              for(int i=0;i<v;i++)
                {
                    for(int j=0;j<v;j++)
                     {
                          arr[i][j]=sc.nextInt();
                     }
                }
                kruskalMST(arr);
         }
  }
