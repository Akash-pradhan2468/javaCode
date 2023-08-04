package recursion;

public class TowrOfHanie {
	public static void tower(int n,String src,String helper,String des) {
		if(n==1) {
			System.out.println("Transfer disk "+n+" From "+src+" To "+des);
			return;
		}
		tower(n-1,src,des,helper);
		System.out.println("Transfer disk "+n+" From "+src+" To "+des);
		tower(n-1,helper,src,des);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
tower(3,"a","b","c");
	}

}
