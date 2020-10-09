
public class Tester {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinarySearchTree tree = new BinarySearchTree();
		assert tree.isEmpty();
		
		tree.insertNode(5);
		assert tree.getRoot().n == 5;
		
		tree.insertNode(5);
		assert tree.getRoot().left == null && tree.getRoot().right == null;
		
		tree.insertNode(4);
		tree.insertNode(9);
		assert tree.getRoot().left.n == 4;
		assert tree.getRoot().right.n == 9;
		
		Node left = tree.getRoot().left;
		Node right = tree.getRoot().right;
		assert left.left==null && left.right==null;
		assert right.left==null && right.right==null;
		
		tree.deleteNode(4);
		assert tree.getRoot().n == 5;
		assert tree.getRoot().left == null;
		assert tree.getRoot().right.n == 9;
		
		tree.deleteNode(5);
		assert tree.getRoot().n == 9;
		assert tree.getRoot().left == null && tree.getRoot().right == null;
		
		tree.deleteNode(5);
		assert tree.getRoot().n == 9;
		assert tree.getRoot().left == null && tree.getRoot().right == null;
		
		tree.insertNode(6);
		tree.insertNode(5);
		tree.insertNode(8);
		tree.insertNode(11);
		
		tree.deleteNode(6);
		assert tree.getRoot().n == 9;
		assert tree.getRoot().right.n == 11;
		assert tree.getRoot().left.n == 8;
		assert tree.getRoot().left.left.n == 5;
		assert tree.getRoot().left.right == null;
		
		System.out.print("Successful!");
	}
}
