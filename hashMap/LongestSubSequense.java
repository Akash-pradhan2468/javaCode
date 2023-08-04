package hashMap;
import java.util.ArrayList;
import java.util.HashMap;
public class LongestSubSequense {
	public static ArrayList<Integer> longestConsecutiveIncreasingSequence(int[] arr) {
			HashMap<Integer,Integer>hm=new HashMap<>();
			for(int i=0;i<arr.length;i++) {
				hm.put(arr[i], 1);
			}
			ArrayList<Integer>al=new ArrayList<>();
			int last=0;
			int first=0;
			int count=0;
			for(int i=0;i<arr.length;i++) {
			boolean flag=true;
			int tempfirst=arr[i];
			int templast=arr[i];
			int tempcount=0;
			int cur=arr[i];
				while(flag) {
					if(hm.containsKey(cur)) {
						tempcount++;
						templast=cur;
						cur=cur+1;
						
					}else {
						flag=false;
					}
				}
				if(tempcount>count) {
					count=tempcount;
					last=templast;
					first=tempfirst;
				}
			}
			if(count>1) {
				al.add(first);
				al.add(last);
				return al;
			}else {
				al.add(first);
				return al;
			}
    }
	public static int lengthOfLongestSubsetWithZeroSum(int arr[]) {
		// Write your code here
		HashMap<Integer,Integer>hm=new HashMap<>();
		int sum=0;
		int length=0;
		int templength=0;
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
			if(sum==0) {
				templength=i-0+1;
				if(templength>length) {
					length=templength;
				}
			}else if(hm.containsKey(sum)) {
				templength= i-hm.get(sum);
				if(templength>length) {
					length=templength;
				}
			}else {
				hm.put(sum, i);
			}
		}
		return length;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//int arr[]= {1,2,3,6,7,8};
//ArrayList<Integer>ans=longestConsecutiveIncreasingSequence(arr);
//System.out.println(ans);
int arr1[]= {6,3,-1,2,-4,3,1,-2,2,0};
System.out.println(lengthOfLongestSubsetWithZeroSum(arr1));
	}

}
