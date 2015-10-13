class MyDate{
	public int day;
	public int month;
	public int year;

	public String getDate(){
		return day + "/" + month + "/" + year;
	}
	public int setDate(int a,int b,int c){
		if((a > 0 && a <=31)&&( b > 0 && b <=12)){
			day = a;
			month = b;
			year = c;
			return 0;
		}else{
			return -1;
		}
	}
}
public class UseMyDate{
	public static void main(String[] args) {
		MyDate t = new MyDate();
		if(t.setDate(2,11,2011) == 0){
			System.out.println(t.getDate());
		}
	}
}