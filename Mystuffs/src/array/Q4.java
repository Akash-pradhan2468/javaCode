package array;

import java.util.HashSet;

public class Q4 {
	  public static boolean containsDuplicate(int[] nums) {
		  HashSet<Integer>set=new HashSet<>();
		  int a=0; 
		  for(int i=0;i<nums.length;i++) {
			  set.add(nums[i]);
			  a++;
			  if(a>set.size()) {
				  return true;
			  }
		  }
		  return false;
		        }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//int arr[]= {1,2,3,1};
//System.out.println(containsDuplicate(arr));
int arr1[]= {1,2,3,4};
System.out.println(containsDuplicate(arr1));
	}

}
