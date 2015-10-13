class Bird{
	int i;
	public Bird(int j){
		i = j;
	}
}
public class DefaultBird{
	public static void main(String[] args) {
		Bird bd = new Bird(5);
		System.out.println(bd.i);
	}
}