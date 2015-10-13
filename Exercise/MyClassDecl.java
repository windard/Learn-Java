public class MyClassDecl{
	public static void main(String[] args) {
		triangle t = new triangle();
		t.erase();
	}
}
abstract class Shape{
	void erase(){
		System.out.println("ERASE");
	}
	void move(){
		System.out.println("MOVE");
	}
	void getcolor(){
		System.out.println("GETCOLOR");
	}

}
final class triangle extends Shape{
	
}
class cricle extends Shape{
	
}