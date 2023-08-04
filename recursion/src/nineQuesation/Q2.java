package nineQuesation;

public class Q2 {
public static int st=-1;
public static int end=-1;

public static <t> void find(t arr[],t x,int a) {

	if(a==arr.length) {
		System.out.println("First occurance "+st);
		System.out.println("Last occurance "+end);
		st=-1;
		end=-1;
		return;
	}
	if( arr[a].equals(x)) {	
		if(st==-1) {
			st=a;
			a++;
			find(arr, x,a);
		}else {
			end=a;
			a++;
			find(arr,x,a);
		}
	}else {
		a++;
		find(arr, x,a);
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Integer arr[]= {2,34,56,65,76,23,45,54,23};
String arr1[]= {"Akash","Satyam","Mrinal","Akash","Priyansu"};
Character arr3[]= {'a','b','c','d','b','d'};
find(arr, 23,0);
find(arr3, 'b',0);
	}

}
