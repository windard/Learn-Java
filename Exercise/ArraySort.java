import java.util.Arrays;
public	class ArraySort{
	public static void main(String[] args) {
		int[]   	a = {1,3,6,3,7,4,9,5,45,23,64,25,58,24,7};
		int[]		b = new int[a.length];

		System.arraycopy(a,0,b,0,a.length);

		System.out.print("Before Sort :");
		for(int i : a){
			System.out.print(i + " ");
		}	
		Arrays.sort(a);
		Arrays.sort(b,0,5);
		System.out.print("\nAfter Sort :");
		for(int i : a){
			System.out.print(i + " "); 
		}
		System.out.print("\nPart Of Sort :");
		for(int i : b){
			System.out.print(i + " ");
		}

		// find a letter in an array
		int 		find = Arrays.binarySearch(a,2);		//can't find 2,because it's 23 not 2,so it will return -1.
		System.out.print("\nFirst letter '2' is No." + (find+1));

		//compare two array  weather same
		boolean 	flag = Arrays.equals(a,b);
		System.out.print("\nIs Array a and Array b Same ?" + ((flag)?" Yes":" No"));
	}
}