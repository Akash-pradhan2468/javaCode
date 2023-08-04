package Array;
import java.util.HashSet;
public class CointainsDuplicate {
public static boolean cointainDuplicates(int a[]) {
	HashSet<Integer>set=new HashSet<>();
	for(int i=0;i<a.length;i++) {
	set.add(a[i]);	
	}
	return a.length==set.size();	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {1,2,3,2,4};
int arr2[]= {1,2,3};
System.out.println(cointainDuplicates(arr2));
System.out.println(cointainDuplicates(arr));
	}

}
