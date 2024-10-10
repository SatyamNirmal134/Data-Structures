import java.util.*;
class Node
{
  int data;
  Node left,right;
   
  public Node(int v)
  {
    this.data=v;
    left=right=null;
  }
}
class BinaryTree
{
  Node root;
  public void insert_node(int v)
  {
    
    Node newnode=new Node(v);
    if(root==null)
    {
     root=newnode;
     }
    else
    {
     where_to_insert(root,newnode);
     }
   }
   private void where_to_insert(Node current,Node newnode)
   {
     int c;
     Scanner sc=new Scanner(System.in);
     do{
     System.out.print("Where you want to insert Left(1)/ Right(0)");
     c=sc.nextInt();
     if(c==1)
     {
       if(current.left==null)
       {
         current.left=newnode;
         break;
        }
      
      current=current.left;
      }
      else if(c==0)
      {
        if(current.right==null)
        {
           current.right=newnode;
           break;
           }
           current=current.right;
      }
      else
      {
         System.out.print("Envalid Choice so enter 1 for Left and 0 for Right ");
      }    
    }
    while(true);
  }     
     public void display()
   {
     System.out.print("Inorder Traversal");
       in_order_traversal(root);
    
    }
    private void in_order_traversal(Node current)
    {
      if(current!=null)
      {
       in_order_traversal(current.left);
       System.out.println(current.data+" ");
       in_order_traversal(current.right);
       
       
      }
    }
    public int count_node()
    {
      return count_node(root);
     }
    public int count_node(Node root)
   {
      if(root==null)
      {
        return 0;
      }
      else
      {
        int count=1;
        count+=count_node(root.left);
        count+=count_node(root.right);
        return count;
      }
    } 
    public int leaf()
    {
      return leaf(root);
     }
    public int leaf(Node root)
    {
       Node c=root;
       int counter=0;
       if(c==null)
       {
           return counter=0;
      }
      else
      {
        if((c.left==null) && (c.right==null))
        {
           counter++;
           System.out.println("Leaf Nodes are-"+c.data+" ");
           return counter;
	}
	else
	{
	   return leaf(c.left)+leaf(c.right);
	}
	   
           }
	}
public int height()
    {
      return height(root);
     }
    public int height(Node root)
    {	
      Node c=root;
      
      if(c==null)
      {
        return 0;
      }
      int leftheight=height(c.left);
      int rightheight=height(c.right);
      
      if(leftheight>rightheight)
      {
       return leftheight+1;
      }
      else
      {
        return rightheight+1;
      
     }
      }
    }	


public class Tree
{
public static void main(String []args)
{
  int n;
  BinaryTree b=new BinaryTree();
  Scanner s=new Scanner(System.in);
  do{
  System.out.print("Enter your choice \n1.Insert a node \n2.Display\n3.Count Node \n4.Leaf\n5.Height");
  int v,ch;
  ch=s.nextInt();
  switch(ch)
  {
    case 1:
           System.out.print("Enter a node value");
           v=s.nextInt();
           b.insert_node(v);
           break;
    case 2:
           b.display();
           break;
    case 3:
           int r;
           r=b.count_node();
           System.out.println("Count of node is- "+r);
           break;
    case 4:
           int q;
           q=b.leaf();
           System.out.println("Count of leaf is- "+q);
           break;   
     case 5:
           int a;
           a=b.height();
           System.out.println("Height of Tree is-"+a);
           break;             
                
           
    } 
    System.out.print("Do you want to continue?(1 for Yes\0 for No 0)");
    n=s.nextInt();               
    }
    while(n!=0);
}
}

