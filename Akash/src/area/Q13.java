package area;

import java.util.Scanner;

public class Q13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("How many test casses");
		int ter=sc.nextInt();
		for(int i=0;i<ter;i++){
			System.out.println("How many number ");
		     int nu=sc.nextInt();
		     if(nu==1){
		          System.out.println("1");
		          
		     }else{
		    	 System.out.println("Enter your number");
		     int arr[]=new int[nu];
		     for(int j=0;j<nu;j++){
		          arr[j]=sc.nextInt();
		     }
		     int k=1;
		     for(int m=0;m<nu-1;m++){
		          if(arr[m]!=arr[m+1]){
		               k++;
		          }
		          
		     }
		     System.out.println(k);
		      
		}
		}

	}

}
