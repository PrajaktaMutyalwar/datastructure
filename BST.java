
public class BST {
	Node root;

	public BST()
	{
		root=null;
	}

	public void insert(int value)
	{
		Node temp=new Node(value);
		if(root==null)
		{
			root=temp;
		}
		else
		{
			Node it=root;
			while(true)
			{

				if(it.data>value)
				{
					if(it.left==null)
					{
						it.left=temp;
						break;
					}
					else
					{
						it=it.left;
					}
				}
				else if(value>it.data)
				{
					if(it.right==null)
					{
						it.right=temp;
						break;
					}
					else
					{
						it=it.right;
					}
				}
				else
					break;
			}
		}

	}

	public void inorder()
	{
		System.out.print("InOrder: ");
		printInorder(root);
		System.out.println();

	}

	private void printInorder(Node it)
	{
		if(it != null)
		{
			printInorder(it.left);
			System.out.println(it.data + " ,");
			printInorder(it.right);
		}

	}


	public void preorder() 
	{
		System.out.print("PreOrder: ");
		printPreorder(root);
		System.out.println();
	}

	private void printPreorder(Node it) 
	{
		if(it != null)
		{
			System.out.print(it.data + " ,");
			printPreorder(it.left);
			printPreorder(it.right);
		}

	}

	public void postorder() 
	{
		System.out.print("PostOrder: ");
		printPostorder(root);
		System.out.println();

	}

	private void printPostorder(Node it)
	{
		if(it != null)
		{
			printPostorder(it.left);
			printPostorder(it.right);
			System.out.print(it.data + ", ");
		}

	}
	
	private int getSmallestNumber(Node it) {
		while(it.left != null)
			it = it.left;
		return it.data;
	}

	public void printLargestNumber() {
		
		Node it = root;

		if(it == null)
		{
			System.out.println("Empty..");
		}
		else
		{
			while(it.right != null)
				it = it.right;

			System.out.println("Largest:" + it.data);
		}
	}

	public void printSmallestNumber() {
		Node it = root;

		if(it == null)
		{
			System.out.println("Empty..");
		}
		else
		{
			while(it.left != null)
				it = it.left;
			System.out.println("Smallest:" + it.data);
		}
		
	}



}
