public class ArrayInit{
	public static void main(String[] args) {
		int[] 			a = new int[] {1,4,6,7,8,2,4,6,13,35,57,8,4,34};

		System.out.println("This array's length :" + a.length);

		for(int i : a){
			System.out.print(i + " ");
		}
	}
}
