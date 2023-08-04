package csw2;

import priorityQueue.PriorityQueue;

public class InbuildPriorityQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,5,7,3,4,2,1};
PriorityQueue<Integer>pq=new PriorityQueue<>();
for(int i=0;i<arr.length;i++) {
	pq.insert(null, i);
}
	}

}
