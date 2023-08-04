package exam;

public class Q1 {
	public static int fun(int k,int sum)
	{ if(k>0)
	{
	fun(k-1,sum);
	//System.out.println(k);
	sum=sum+k;
	System.out.println(sum);
	}return sum;
	}
	public static void main(String[] args) {
		int a=fun(4,0);
		System.out.println(a);
	}

}
