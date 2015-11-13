import java.util.*;

public class work2_1{
	public static void main(String[] args) {
		Likelist str = new Likelist();
		str.add("+U+n+c---+e+r+t---+a-+i-+n+t+y---+-+r+u--+l+e+s---");
	}
}
class Likelist{
	public void add(String dell ){
		LinkedList<String> desk = new LinkedList<String>();
		char[] own;
		int flag=0;
		int num=-1;
		own = dell.toCharArray();
		for (char i : own) {
			if(flag==0){
				if(i == '-'){
					System.out.println(desk.get(num));
					desk.remove(num);
					num--;
				}else if(i == '+'){
					flag = 1;
				}
			}else if(flag==1){
				desk.add(String.valueOf(i));
				num++;
				flag = 0;
			}			
		}
		System.out.println(desk);
	}
}