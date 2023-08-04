package exam;

public class Q4 {
public static void substring() {
	char arr[]= {'a','b','c'};
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr.length;j++) {
			for(int k=0;k<arr.length;k++) {
				if(i==j||i==k||j==k) {
					continue;
					
				}else {
					System.out.println(" "+arr[i]+arr[j]+arr[k]);
				}
			}
		}
	}
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
substring();
	}

}
