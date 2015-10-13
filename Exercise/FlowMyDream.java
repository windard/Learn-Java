class A{
	public void A1(){
		System.out.println("Hello");
	}
}

class B extends A{
	public void A1(){
		System.out.println("World");
	}
}

public class  FlowMyDream{
	public static void main(String[] args) {
		B b = new B();
		A a = new A();
		b.A1();
		a.A1();
	}
}