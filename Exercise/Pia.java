public class Pia{
	public static void main(String[] args) {
		float			i;
		float			a,c;
		float 			b = 0;
		float 			r;

		for(i = 1;i < 10000;i ++){
			a = ( 2 * i ) - 1;
			if(i%2 == 0){
				c = 1/a;
				b -= c; 
			}else{
				c = 1/a;
				b += c; 
			}
		}
		r = 4 * b;
		System.out.println("The Result is :" + r);
	}
}