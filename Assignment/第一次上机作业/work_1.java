public class work_1{
	public static void main(String[] args) {
		double 		area;
		double 		perimeter;
		Rectangle rec = new Rectangle();
		rec.setWidth(10);
		rec.setHeight(20);
		area = rec.getArea();
		perimeter = rec.getPerimeter();
		System.out.println(area);
		System.out.println(perimeter);
	}
}

class Rectangle{
	double 		width;
	double 		height;
	public Rectangle(){
		width = 0;
		height = 0;
	}
	public void setWidth(double w){
		width = w;
	}
	public void setHeight(double h){
		height = h;
	}
	public double getArea(){
		return width*height;
	}
	public double getPerimeter(){
		return 2*(width + height);
	} 
}
