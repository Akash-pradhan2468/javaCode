package array;
import java.util.Scanner;
public class Q13 {
	  static void time(int a[]){
	        int max=0;int sum=0;
	        for(int m=0;m<a.length;m++){
	            if(a[m]>max){
	                max=a[m];
	            }
	            sum=sum+a[m];
	        }
	        System.out.println(sum+max);
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter testCase");
		int t=sc.nextInt();
		for(int i=0;i<t;i++){
			System.out.println("Enter the number of station");
		    int n=sc.nextInt();
		    int arr[]=new int[n];
		    for(int j=0;j<n-1;j++){
		    	System.out.println("Enter time");
		        arr[j]=sc.nextInt();
		    }
		    
		    time(arr);
		    
		}
	}

}
