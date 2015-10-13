public class NewArrayOfStringDemo() {
	public static void main(String[] args) {
		String[]  anArray = {"String one","String two","String three"};
		for(String s : anArray){
			System.out.println(s.toLowerCase());
		}
	}
}