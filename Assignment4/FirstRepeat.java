package Assignment4;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
public class FirstRepeat {
    public static int firstRepeated(int[] arr, int n) {
        // Your code here
    	n=-1;
    	HashMap<Integer,Integer>hm=new HashMap<>();
    	for(int i=0;i<arr.length;i++) {
    		if(hm.containsKey(arr[i])) {
    			int a=hm.get(arr[i]);
    			hm.put(arr[i], a+1);
    		}else {
    			hm.put(arr[i], 1);
    		}
    	}
    	for(int i=0;i<arr.length;i++) {
    		if(hm.get(arr[i])>1) {
    			n=arr[i];
    			break;
    		}
    	}
    	return n;
    }
    public static int[] removeDuplicate(int arr[]) {
    	HashSet<Integer>hs=new HashSet<>();
    	int a=hs.size();
    	ArrayList<Integer>al=new ArrayList<>();
    	for(int i=0;i<arr.length;i++) {
    		hs.add(arr[i]);
    		if(hs.size()>a) {
    			al.add(arr[i]);
    			a++;
    		}
    	}
    	int arr1[]=new int[hs.size()];
    	for(int i=0;i<arr1.length;i++) {
    		arr1[i]=al.get(i);
    	}
    	return arr1;
    }
    public static void print(int arr[]) {
    	for(int i=0;i<arr.length;i++) {
    		System.out.print(arr[i]+" ");
    	}
    	System.out.println();
    }
   public static  int MissingNumber(int array[], int n) {
        // Your Code Here
	   int sum=0;
	   for(int i=0;i<array.length;i++) {
		   sum=sum+array[i];
	   }
	   int total=(n*(n+1))/2;
	   return total-sum;
    }
   public static int findMissingNumber2(int arr[]) {
	   int missing=0;
	   for(int i=0;i<arr.length;i++) {
		 missing=  missing^arr[i];
	   }
	   return missing;
   }
   public static void minMaxMissing(int arr[]) {
	   int max=arr[0];
	   int min=arr[0];
	   HashMap<Integer,Integer>hm=new HashMap<>();
	   
	   for(int i=0;i<arr.length;i++) {
		   if(arr[i]>max) {
			   max=arr[i];
		   }else if(arr[i]<min) {
			   min=arr[i];
		   }
		   hm.put(arr[i], 1); 
	   }
	   for(int i=min+1;i<max;i++) {
		   if(!hm.containsKey(i)) {
			   System.out.print(i+" ");
		   }
	   }
	   System.out.println();
   }
   public static  int findSingle(int N, int arr[]){
       // code here
	   int a=0;
	   for(int i=0;i<arr.length;i++) {
		   a=a^arr[i];
	   }
	   return a;
   }
   public static int[] twoOddNum(int Arr[], int N)
   {
       // code here
	   int first=0;
	   int second=0;
	   int arrayXor=0;
	   for(int i=0;i<Arr.length;i++) {
		   arrayXor=arrayXor^Arr[i];
	   }
	   int differ=arrayXor&(~(arrayXor-1));
	   for(int i=0;i<Arr.length;i++) {
		   if((differ&Arr[i])!=0) {
			   first=first^Arr[i];
		   }else {
			   second=second^Arr[i];		   }
	   }
	  
	   int arr[]=new int[2];
	   		if(first<second) {
	   				arr[0]=first;
	   				arr[1]=second;
	   			}else {
	   				arr[0]=second;
	   				arr[1]=first;
	   			}
	   
	    
	   
	   return arr;
   }
   public static void sumOfDistint(int arr[]) {
	 Arrays.sort(arr);
	   int sum=arr[0];
	   for(int i=1;i<arr.length;i++) {
		  if(arr[i]!=arr[i-1]) {
			  sum=sum+arr[i];
		  } 
	   }
	   System.out.println("Sum is "+sum);
   }
   public static void pairsumClosetToZero(int arr[]) {
	   Arrays.sort(arr);
	   int st=0;
	   int end=arr.length-1;
	   int left=0;
	   int right=arr.length;
	   int differ=Math.abs(arr[st]+arr[end]);
	   	while(st<end) {
	   		int sum=arr[st]+arr[end];
	   		if(sum==0) {
	   			System.out.println("Pair is "+arr[st]+" "+arr[end]);
	   		}else if(sum<0) {
	   			if(differ<Math.abs(arr[st]+arr[end])) {
	   				left=st;
	   				right=end;
	   				differ=Math.abs(arr[st]+arr[end]);
	   			}
	   			st++;
	   		}else {
	   			if(differ<Math.abs(arr[st]+arr[end])) {
	   				left=st;
	   				right=end;
	   				differ=Math.abs(arr[st]+arr[end]);
	   			}
	   			end--;
	   		}
	   	}
	   	System.out.println("Pair is "+arr[left]+" "+arr[right]);
			   
   }
 public static   boolean hasArrayTwoCandidates(int arr[], int n, int x) {
       // code here
	 Arrays.sort(arr);
	 int st=0;
	 int end=arr.length-1;
	 while(st<end){
		 int sum=arr[st]+arr[end];
		 if(sum==x) {
			 return true;
		 }else if(sum<x) {
			 st++;
		 }else {
			 end--;
		 }
	 }
	 return false;
   }
 public static void sumValueDifferenArray(int arr1[],int arr2[],int x) {
	 Arrays.sort(arr1);
	 Arrays.sort(arr2);
	 int st=0;
	 int end=arr2.length-1;
	 int flag=0;
	 while(st<=arr1.length-1&&end>=0) {
		 int sum=arr1[st]+arr2[end];
		 if(sum==x) {
			 System.out.println(arr1[st]+"  "+arr2[end]);
			 st++;
			 end--;
			 flag=1;
		 }else if(sum<x) {
			 st++;
		 }else {
			 end--;
		 }
	 }
	 if(flag==0) {
	 System.out.println("Not present");
	 }
	  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//int arr[]= {1,2,3,4,5,3,5};
//int arr2[]= {1,2,3,4,5,7,8,9};
//int arr3[]= {5,6,7,8,10,13,14,16,17,19,20};
//int arr4[]= {4,2,4,6,2,3,3,1};
//System.out.println(firstRepeated(arr, 0));
//int arr2[]=removeDuplicate(arr);
//print(arr2);
//System.out.println(findMissingNumber2(arr2));
//minMaxMissing(arr3);
//int arr6[]= {24, 14 ,14 ,24, 24, 24, 5, 24, 24, 24, 24 ,14 ,24 ,24};
//int arr5[]=twoOddNum(arr6, 0);
//print(arr5);
//		int arr6[]= {1,2,1,2,3,4,5,6};
//		sumOfDistint(arr6);
//		int arr7[]= {-38,-24,-17,-13,30,39,41,48};
//		pairsumClosetToZero(arr7);
//		for(int i=0;i<10;i++) {
//			if(i==8||i==6) {
//				if(i==8) {
//					break;
//				}else {
//					break;
//				}
//			}
//			System.out.println(i);
//		}
//	}
		int arr7[]= {1,2,3,4,5};
		int arr8[]= {6,7,8,9};
		sumValueDifferenArray(arr7, arr8, 12);

	}
	}
