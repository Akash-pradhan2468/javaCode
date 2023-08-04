package Array;

public class Q3MaxSumSubArray {
public static int maxSum(int a[]) {
	int maxsum=a[0];
	int cursum=0;
	for(int i=0;i<a.length;i++) {
		cursum=cursum+a[i];
		if(cursum>maxsum) {
			maxsum=cursum;
		}
		if(cursum<0) {
			cursum=0;
		}
	}
	return maxsum;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {2,4,-8,6,7,8,-2,13};
System.out.println(maxSum(arr));
	}

}
