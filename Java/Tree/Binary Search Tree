import java.util.Scanner;
class Node
{
 int key;
 Node right,left;
 public Node(int key)
 {
  this.key=key;
  right=left=null;
 }
}
class ST
{
 Node root;
 public  ST()
 {
  root=null;
 }
 public void insert(int key)
 {
    root=insertAT(root,key);
 }
 private Node insertAT(Node root,int key)
 {
  if(root==null)
  {
   root=new Node(key);
   return root;
  }
  else if(root.key>key)
  {
     root.left=insertAT(root.left,key);
    
  }
  else if(root.key<=key)
  {
   root.right=insertAT(root.right,key);
  }
  return root;
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
       System.out.println(current.key);
       in_order_traversal(current.right);
       
       
      }
    }
public void Search()
{
       Scanner s=new Scanner(System.in);
       System.out.println("Enter the number to serach-");
       int a=s.nextInt();
       if(searchIn(root,a))
       {
          System.out.println("Element is found in the tree!!!!");
	}
	else
	{
	  System.out.println("Element is not found");
	}
    }
    public boolean searchIn(Node root,int a)
    {
       if(root==null)
       {
         return false;
       }
       if(root.key==a)
       {
         return true;
       }
       else if(root.key>a)
       {
	return searchIn(root.left,a);
       }
       else 
       {
	return searchIn(root.right,a);
       }
    }
     public int miniValue(Node root)
    {
      
      while(root.left!=null)
      {
        
        root=root.left;
        
      }
      return root.key;
}
   public int maxiValue(Node root)
    {
      
      while(root.right!=null)
      {
        
        root=root.right;
        
      }
      return root.key;
    }
    
    public Node Del(Node root,int a)
    {
    
    if(root==null)
      {
         return root;
      }
    if(a<root.key) 
      {
        root.left=Del(root.left,a);
      }
    else if(a>root.key)
    {
      root.right=Del(root.right,a);
    }
    else
    {
       if(root.left==null)
       {
          return root.right;
	}
	else if(root.right==null)
       {
          return root.left;
	}
	else
	{
	   root.key=miniValue(root.right);
	   root.right=Del(root.right,root.key);
	}
    }
    return root;  
  }

    }


public class Binary_Search_Tree
{
  public static void main(String []args)
 { 
  int n;
  ST b=new ST();
  Scanner s=new Scanner(System.in);
   do{
  System.out.print("Enter your choice \n1.Insert a node \n2.Display\n3.Search element \n4.Minimum\n5.Maximum\n6.Delete element");
  int key,ch;
  ch=s.nextInt();
  switch(ch)
  {
    case 1:
           System.out.print("Enter a node value");
           key=s.nextInt();
           b.insert(key);
           break;
    case 2:
           b.display();
           break;
    case 3:b.Search();
           break; 
    case 4:System.out.print("Minimum value is-"+b.miniValue(b.root));
           break;
    case 5:System.out.print("Maximum value is-"+b.maxiValue(b.root));
           break;
    case 6:
           System.out.println("Enter the element to Delete-");
           int a=s.nextInt();
   	   b.Del(b.root,a);
           break;              
    default:System.out.print("Invalid choice");
            break;
            
   } 
    System.out.print("Do you want to continue?(1 for Yes\0 for No 0)");
    n=s.nextInt();               
  }
    while(n!=0);
}
}
