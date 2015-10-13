public class ArrayDemo{
	public static void main(String[] args) {
		String[]			s = new String[5];
		int[]				d = new int[6];

		for (int i = 0;i < 5;i++){					//This is bad
			s[i] = i + "";
		}
		for (int i = 0;i < 6;i++){					//This is bad too
			d[i] = i * 8;
		}
		for (int i = 0;i < s.length;i++){
			System.out.print("s[" + i + "]=" + s[i] + " "); 	//This is great
		}
		System.out.println("");						//Print an <br>
		for (int i = 0;i < d.length;i++){
			System.out.print("d[" + i + "]=" + d[i] + " ");		//This is great too
		}
	}
}
