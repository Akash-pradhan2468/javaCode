package array;

public class Q3 {
public static int maxsum(int arr[]){
	int sumMax=-9999;
	for(int i=0;i<arr.length;i++) {
		int sum=0;
		for(int j=i;j<arr.length;j++) {
			sum=sum+arr[i];
			if(sum>sumMax) {
				sumMax=sum;
			}
		}
	}
	return sumMax;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
