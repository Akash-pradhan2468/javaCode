package exam;



public class Q11 {
	public static int fun(int a,int b){
		if(b==0)return a;
		else return fun(a+a,b/2);
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(fun(4,3));
	}

}
