package day12;

class c{
	void test(){
		System.out.println("c test");
	}
}

class d extends c{
	void test(){
		System.out.println("d test");
	}
}


class a{
	a(String a){
		System.out.println(a);
	}
}
class b extends a{


	b(String b, String a){
		super(a);
		System.out.println(b);
	}
}

public class test {
	
	
	
	void cal(int x,int y){
		System.out.println("cal void");
	}
	
	int cal(int x,int y, int z){
		System.out.println("cal int");
		return 1;
	}

	public static void main(String[] args) {
		test test = new test();
		test.cal(0, 0);
		test.cal(0, 0, 0);
		
		b b = new b("b","a");
		
		d d = new d();
		d.test();
	}

}
