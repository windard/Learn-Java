public class work_2{
	public static void main(String[] args) {
		double dis;
		Point a = new Point();
		Point b = new Point();
		a.setX(3);
		a.setY(4);
		b.setX(1);
		b.setY(6);
		dis = a.distance(b);
		System.out.println(dis);
	}
}

class Point{
	double 		x;
	double 		y;
	public Point(){
		x = 0;
		y = 0;
	}
	public void setX(double i){
		x = i;
	}
	public void setY(double i){
		y = i;
	}
	public double distance(Point p){
		double i,j;
		i = x - p.x;
		j = y - p.y;
		return Math.sqrt(i*i+j*j);
	}
}