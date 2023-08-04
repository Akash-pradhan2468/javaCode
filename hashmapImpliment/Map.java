package hashmapImpliment;
import java.util.ArrayList;
public class Map<k,v> {
ArrayList<MapNode<k,v>> bucket;
int count;
int numBucket;
	public Map() {
		bucket=new ArrayList<>();
		numBucket=5;
		for(int i=0;i<numBucket;i++) {
			bucket.add(null);
		}
	}
	public int getbucketIndex(k key) {
		int hc=key.hashCode();
		int index=hc%numBucket;
		return index;
	}
	public v getvalue(k key) {
		int bucketIndex=getbucketIndex(key);
		MapNode<k,v>head=bucket.get(bucketIndex);
		while(head!=null) {
			if(head.key.equals(key)) {
				return head.value;
			}
			head=head.next;
		}
		return null;
	}
	public int size() {
		return numBucket;
	}
	public v remove(k key) {
		int bucketIndex=getbucketIndex(key);
		MapNode<k, v> head=bucket.get(bucketIndex);
		MapNode<k,v>pre=null;
		while(head!=null) {
			if(head.key.equals(key)) {
				if(pre!=null) {
					pre.next=head.next;
					
					
				}else {
					bucket.set(bucketIndex, head.next);
					
				}
				count--;
				return head.value;
				
			}
			pre=head;
			head=head.next;
		}
		return null;
	}
	private void rehash() {
		ArrayList<MapNode<k, v>>temp=bucket;
		bucket=new ArrayList<>();
		for(int i=0;i<2*numBucket;i++) {
			bucket.add(null);
		}
		count=0;
		numBucket=2*numBucket;
		for(int i=0;i<temp.size();i++) {
			MapNode<k,v>head=temp.get(i);
			while(head!=null) {
				k key=head.key;
				v valiue=head.value;
				insert(key, valiue);
				head=head.next;
				count++;
			}
		}
	}
	public double loadfactor() {
	double a=(1.0*count)/numBucket;
	return a;
	}
	public  void insert(k key,v value) {
		int bucketIndex=getbucketIndex(key);
		MapNode<k,v>head=bucket.get(bucketIndex);
		while(head!=null) {
			if(head.value.equals(value)) {
				head.value=value;
				return;
			}
			head=head.next;
		}
		head=bucket.get(bucketIndex);
		MapNode<k, v> newNode= new MapNode<>(key,value);
		newNode.next=head;
		bucket.set(bucketIndex, newNode);
		count++;
		double loadfactor=(1.0*count)/numBucket;
		if(loadfactor>0.7) {
			rehash();
		}
	}
}
