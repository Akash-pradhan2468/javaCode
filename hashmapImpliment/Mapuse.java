package hashmapImpliment;

public class Mapuse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Map<String,Integer>a=new Map<>();
for(int i=0;i<20;i++) {
	a.insert("abc"+i,i );
	System.out.println(a.loadfactor());
}
	System.out.println(a.remove("abc2"));
	System.out.println(a.remove("abc4"));
	
	for(int i=0;i<20;i++) {
		System.out.println("abc"+i+" :"+ a.getvalue("abc"+i));
	}
	}

}
