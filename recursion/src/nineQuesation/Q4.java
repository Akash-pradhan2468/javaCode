package nineQuesation;

public class Q4 {
	public static boolean ArrayShorrted( int arr[],int idx){ 
		if(idx==arr.length-1) {
		
		
			if(arr[idx]<arr[idx+1]) {
		//System.out.println("Akash");
				 ArrayShorrted(arr, idx+1);
		}else {
			System.out.println("sagar");
			return false;

		}
			}else {
		System.out.println("Akash");
		return true;}
		}
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {1,21,32,43,32};
System.out.println(ArrayShorrted(arr, 0));
	}

}
