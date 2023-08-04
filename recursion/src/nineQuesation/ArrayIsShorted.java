package nineQuesation;

public class ArrayIsShorted {
public static boolean isShorted(int arr[],int idx) {
	if(idx==arr.length-1) {
		return true;
	}
	if(arr[idx]<arr[idx+1]) {
		return isShorted(arr, idx+1);
	}else {
		return false;
	}	

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]={1,2,21,4,56,};
System.out.println(isShorted(arr, 0));
	}

}
