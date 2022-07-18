
public class Main {
  public static void main(String []args)
  {
	  BST bst=new BST();
	  bst.insert(23);
	  bst.insert(3);
	  bst.insert(13);
	  bst.insert(1);
	  bst.insert(48);
	  bst.insert(34);
	  bst.insert(110);
	  bst.insert(8);
	  bst.insert(6);
	  //bst.insert(56);
	  
	  bst.preorder();
	  bst.inorder();
	  bst.postorder();
	  
	  bst.printLargestNumber();
	  bst.printSmallestNumber();

		//bst.delete(195);
		bst.inorder();
	  
	//  System.out.print(bst);
  }
}
