package J8;

class A8{
	int i;
	String b;
	int c=10;
	
	
	public A8(int i, String b) {
		super();
		this.i = i;
		this.b = b;
	}
	
	@Override
	public String toString() {
		return "A8 [i=" + i + ", b=" + b + "]";
	}

	void insert(int i, String b) {
		i=this.i;
		b=this.b;
	}
	void display() {
		System.out.println(i+" "+b);
	}
	
}

public class Meth {
	public static void main(String[] args) {
		A8 a= new A8(1,"dc");
		System.out.println(a);
		int c=15;
		System.out.println(c);
		a.i=1;
		a.b="d";
		a.display();
		
	}
}
