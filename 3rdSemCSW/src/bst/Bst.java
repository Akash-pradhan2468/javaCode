package bst;
class bstNode{
	int data;
	bstNode left;
	bstNode right;
	bstNode(int data){
		this.data=data;
	}
}
public class Bst {
public static bstNode insert(bstNode root,int val) {
	if(root==null) {
		root=new bstNode(val);
		return root;
	}
	if(val>root.data) {
		root.right=insert(root.right,val);
	}else {
		root.left=insert(root.left, val);
	}
	return root;
}
public static void inorderTraversal(bstNode root) {

	if(root==null) {
		return;
	}
	inorderTraversal(root.left);
	System.out.print(root.data+" ");
	inorderTraversal(root.right);
}
public static boolean search(bstNode root,int x) {
	if(root==null) {
		return false;
	}
	if(root.data==x) {
		return true;
	}
	if(x>root.data){
		return search(root.right, x);
	}else {
	return  search(root.left, x);
	}
	
}
public static bstNode delete(bstNode root,int x) {
	if(x>root.data) {
		root.right=delete(root.right,x);
	}else if(x<root.data) {
		root.left=delete(root.left,x);
	}else {
		if(root.left==null&&root.right==null) {
			return null;
		}else if(root.left==null) {
			return root.right;
		}else if(root.right==null){
			return root.left;
		}else {
			bstNode temp=inorderSuccerer(root.right);
			root.data=temp.data;
			root.right=delete(root.right,temp.data);
		}
		
	}
	return root;
}
public static bstNode inorderSuccerer(bstNode root) {
	while(root.left!=null) {
		root=root.left;
	}
	return root;
}
public static void printInRange(bstNode root,int x,int y) {
	if(root==null) {
		return;
	}
	printInRange(root.left, x, y);
	if(root.data>=x&&root.data<=y)
		System.out.print(root.data+" ");
	printInRange(root.right, x, y);
}
public static void rootToleafPath(bstNode root,String a) {
	if(root.left==null&&root.right==null) {
		a=a+root.data;
		System.out.println(a);
		return;
	}
	a=a+root.data+" ";
	if(root.left==null) {
	rootToleafPath(root.right, a);
	}else if(root.right==null) {
	rootToleafPath(root.left, a);
	}else {
		rootToleafPath(root.left, a);
		rootToleafPath(root.right, a);
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {8,5,3,1,4,6,10,11,14};
bstNode root=null;
for(int i=0;i<arr.length;i++) {
root=insert(root, arr[i]);
 }
inorderTraversal(root);
System.out.println();
//System.out.println(search(root, 50));
//delete(root,4);
//inorderTraversal(root);
//System.out.println();
//delete(root,5);
//inorderTraversal(root);
//System.out.println();
//delete(root,8);
inorderTraversal(root);
System.out.println();
printInRange(root, 5, 11);
System.out.println();
rootToleafPath(root, "");

	}

}
