public class Plus{
	public static void main(String[] args) {
		int 	n = 0;
		int 	w = 12345;
		int		i;
		// int 	a;
		// w = w/10;

		// do{
		// 	i = w%10;			
		// 	n += i;
		// 	w = w/10;
		// }while(w < 0);
		// n = n + w;
		do{
			i = w%10;
			n +=i;
			w = w/10;
		}while(w != 0);
		System.out.println(n);

		int		a;
		int		b;
		int		c;
		a = 5;
		b = (a ++) + (a ++);
		a = 5;
		c = (++ a) + (++ a);
		System.out.print(b + " " + c);
	}
}