
public class BinarySearchTree {
	private Node root;

	public BinarySearchTree() {
		root = null;
	}

	public boolean isEmpty() {
		return root == null;
	}

	public void insertNode(int n) {
		Node temp = new Node(n);

		if (isEmpty()) {
			root = temp;
		} else {
			Node travel = root;
			while (true) {
				if (temp.n < travel.n) {
					if (travel.left != null) {
						travel = travel.left;
					} else {
						travel.left = temp;
						break;
					}
				} else if (temp.n > travel.n) {
					if (travel.right != null) {
						travel = travel.right;
					} else {
						travel.right = temp;
						break;
					}
				} else {
					break;
				}
			}
		}
	}

	public void deleteNode(int n) {
		Node temp = root;
		Node parent = null;

		while (temp != null) {
			if (temp.n == n) 
				break;
			else if (n < temp.n) {
				parent = temp;
				temp = temp.left;
			}
			else {
				parent = temp;
				temp = temp.right;
			}
		}

		if (temp == null) {
			return;
		}
		// IF temp HAS 0 OR 1 CHILD
		if (temp.left == null || temp.right == null) {
			Node child;
			if (temp.left == null) {
				child = temp.right;
			} else {
				child = temp.left;
			}
			
			if (parent == null) {
				root = child;
			} else if (parent.left == temp) {
				parent.left = child;
			} else {
				parent.right = child;
			}
			return;
		}
		// IF temp HAS 2 CHILDREN	
		Node smallestParent = temp;
		Node smallest = temp.right;
		while (smallest.left != null) {
			smallestParent = smallest;
			smallest = smallest.left;
		}
		
		temp.n = smallest.n;
		if(smallestParent==temp) {
			smallestParent.right=smallest.right;
		} else {
			smallestParent.left=smallest.right;
		}
	}
	
	public Node getRoot() {
		return root;
	}
}
