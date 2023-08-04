package exam;

public class Q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0,n=5,i,j;
		for(i=0;i<n;i++){
		for(j=0;j<=i;j++){
		sum=sum+j;
		}
		sum=sum*i+j;
		System.out.print(sum+" ");
		}

	}

}
