package CodeClass;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
class Node{
	int data;
	Node next;
	public Node(int a) {
		this.data=a;
		
	}
	
}
public class Quesations {
//	Q1
public static int findUnique(int arr1[],int arr2[]) {
	HashMap<Integer,Integer>hm=new HashMap<>();
	for(int i=0;i<arr1.length;i++) {
		hm.put(arr1[i], 1);
	}
	for(int i=0;i<arr1.length;i++) {
		hm.put(arr2[i], 1);
	}
	return hm.size();
}
//Q2
public static boolean isEqual(int arr1[],int arr2[]) {
	if(arr1.length==arr2.length) {
		for(int i=0;i<arr1.length;i++) {
			if(arr1[i]!=arr2[i]) {
				return false;
			}
		}
	}else {
		return false;
	}
	return true;
}
//Q4
public static LinkedList<Integer> multipleSorted(int arr[]){
	LinkedList<Integer> list=new LinkedList();
	Arrays.sort(arr);
	HashMap<Integer,Integer>hm=new HashMap<>();
	for(int i=0;i<arr.length;i++) {
		hm.putIfAbsent(arr[i], 0);
		hm.put(arr[i], hm.get(arr[i])+1);
		
	}
	for(int i=0;i<arr.length;i++) {
		if(hm.containsKey(arr[i])&&hm.get(arr[i])>=2) {
			list.add(arr[i]);
			hm.remove(arr[i]);
		}
	}
	return list;
}
//Q5
public static LinkedList<Integer> findSmallestBigest(int arr[]){
	LinkedList<Integer> list=new LinkedList();
	int small=Integer.MAX_VALUE;
	int largest=Integer.MIN_VALUE;
	for(int i=0;i<arr.length;i++) {
		if(arr[i]>largest) {
			largest=arr[i];
		}
		if(arr[i]<small) {
			small=arr[i];
		}
	}
	list.add(small);
	list.add(largest);
	return list;
	
}
//Q6
public static int lengthLinkedlist(Node head) {
	Node temp=head;
	int c=0;
	while(temp!=null) {
		c++;
		temp=temp.next;
	}
	return c;
}
//Q7
public static void deleteNode(Node head,int val) {
	Node pre=null;
	Node cur=head;
	if(head.data==val) {
		System.out.println("A");
		head=head.next;
		return;
	}
	while(cur!=null) {
		if(cur.data==val) {
			pre.next=cur.next;
			cur=cur.next;
			pre=cur;
		}else {
			pre=cur;
			cur=cur.next;
		}
	}	
	
}
public static void print(Node head) {
	Node temp=head;
	while(temp!=null) {
		System.out.print(temp.data+" ");
		temp=temp.next;
	}
	System.out.println();
}
public static void insertTail(Node head,int val) {
	Node newNode=new Node(val);
	Node pre=null;
	Node cur=head;
	while(cur!=null) {
		pre=cur;
		cur=cur.next;
	}
	pre.next=newNode;
}
public static void insertMid(Node head,int val) {
	Node newNode=new Node(val);
	Node pre=head;
	Node cur=head;
	while(cur!=null&&cur.next!=null) {
		pre=pre.next;
		cur=cur.next.next;
	}
	newNode.next=pre.next;
	pre.next=newNode;
}
public static void reversePrint(Node head) {
	if(head==null) {
		return;
	}
	reversePrint(head.next);
	System.out.println(head.data);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
////		Q1 ans
//int arr1[]= {1,2,3,4};
//int arr2[]= {1,2,3,4};
//System.out.println(findUnique(arr1, arr2));
		
////		Q2
//		int arr1[]= {1,2,3,4};
//		int arr2[]= {1,2,3,4};
//		System.out.println(isEqual(arr1, arr2));
		
////		Q4
//		int arr[]= {1,2,3,4,5,2,3,};
//		System.out.println(multipleSorted(arr));
		
////		Q5
//		int arr[]= {1,2,3,4,5,6};
//		System.out.println(findSmallestBigest(arr));
		
////		Q6
		Node head=new Node(1);
		Node temp=head;
		for(int i=2;i<9;i++) {
			Node newNode=new Node(i);
			temp.next=newNode;
			temp=temp.next;
		}
//		System.out.println(lengthLinkedlist(head));
//		
//////		Q7
//		print(head);
//		deleteNode(head, 4);
//		print(head);
//		deleteNode(head, 2);
//		print(head);
//		
////		Q8
//	insertTail(head, 12);
//	print(head);
//	Q9
		print(head);
		insertMid(head, 16);
		print(head);

//		Q10
//		print(head);
//		reversePrint(head);
		
	}

}
