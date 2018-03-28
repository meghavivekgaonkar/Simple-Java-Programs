
public class Node {
	Node next=null;
	int data;

	public Node(int d)
	{
		this.data=d;
	}
	public void appendNode(int d)
	{
		Node newNode=new Node(d);
		Node n= this;
		while(n.next!=null)
		{
			n=n.next;
		}
		n.next=newNode;
	}
	public void print()
	{
		Node n=this;
		while(n.next!=null)
		{
			System.out.print(n.data+"-->");
			n=n.next;
		}
		System.out.print(n.data+"-->");
		System.out.print("null");
		
	}
	public void k_Print(int k)
	{
		int n1=k-1;
		int count=1;
		Node n=this;
		while(n.next!=null)
		{
			if(count>n1)
			{
			  System.out.print(n.data+"-->");
			  count++;
			}
			else
			{
				count++;
			}
			n=n.next;
		}
		System.out.print(n.data+"-->");
		System.out.print("null");
		
		
	}
	public void removeDuplicate()
	{
		Node n=this;
		while(n.next!=null)
		{
			Node runner=n;
			while(runner.next!=null)
			{
				if(runner.next.data==n.data)
				{
					runner.next=runner.next.next;
				}
				else
				{
					runner=runner.next;
				}			
			}
			n=n.next;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Node n=new Node(7);
      n.appendNode(3);
      n.appendNode(3);
      n.appendNode(8);
      n.appendNode(5);
      n.appendNode(8);
      System.out.println("Before");
      n.print();
      System.out.println("\nAfter calling removeDuplicate");
      n.removeDuplicate();
      n.print();
      System.out.println("\n");
      Node n1=new Node(1);
      n1.appendNode(2);
      n1.appendNode(3);
      n1.appendNode(4);
      n1.appendNode(5);
      n1.appendNode(6);
      n1.print();
      System.out.println("\nPrint from kth element");
      n1.k_Print(4);
      
      
	}

}
