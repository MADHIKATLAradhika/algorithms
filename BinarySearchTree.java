package Algorithms;


public class BinarySearchTree {
	public class Node{
		Node left,right;
		int data;
		public Node(int data) {
			left=right=null;
			this.data=data;
		}
	}
	Node root;
	public BinarySearchTree()
	{
		root=null;
	}
	void insert(int data) {
		root=insertRecursive(root,data);
		
		
	}
	Node insertRecursive(Node root, int data) {
		if(root==null) {
			Node newNode=new Node(data);
			root=newNode;
			
			return root;
		}
		if(data < root.data) {
			root.left=insertRecursive(root.left,data);
		}
		else if(data > root.data) {
			root.right=insertRecursive(root.right,data);
		}
		
		// TODO Auto-generated method stub
		return root;
	}
	void preorder(Node root) {
		if(root!=null) {
			System.out.print(root.data+"->");
			preorder(root.left);
			preorder(root.right);
		}
	}
	void inorder(Node root) {
		if(root!=null) {
			inorder(root.left);
			System.out.print(root.data+"->");
	
			inorder(root.right);
		}
	}
	void postorder(Node root) {
		if(root!=null) {
			
			postorder(root.left);
			postorder(root.right);
			System.out.print(root.data+"->");
		}
	}
	public static void main(String[] args) {
		BinarySearchTree bst=new BinarySearchTree();
		bst.insert(5);
		bst.insert(3);
		bst.insert(8);
		bst.insert(2);
		bst.insert(4);
		bst.insert(7);
		bst.insert(9);
		bst.inorder(bst.root);
		System.out.println();
		bst.preorder(bst.root);
		System.out.println();
		bst.postorder(bst.root);
		
	}

}
