package array;

public class Q1 {
	 public static int findSum(int A[], int N)
	    {
	    	//code here.
	    	
	    	int min=A[0];
	    	int max=A[0];
	    	for(int i=1;i<A.length;i++){
	    	    if(A[i]>max){
	    	        max=A[i];
	    	    }
	    	    if(A[i]<min){
	    	        min=A[i];
	    	    }
	    	}
	    	int sum=max+min;
	    	return sum;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {-2,-4,-5,6,7};
int a=findSum(arr, arr.length);
System.out.println(a);
	}

}
