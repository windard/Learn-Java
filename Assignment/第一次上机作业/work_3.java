public class work_3{
	public static void main(String[] args) {
		boolean i,j;
		Rectangle a = new Rectangle();
		Rectangle b = new Rectangle();
		a.setAll(5,5,1,1);
		b.setAll(1,1,2,2);
		i = a.bPointIn(b.point);
		j = a.bRectangle(b);
		System.out.println(i);
		System.out.println(j);
	}
}

class Rectangle{
	double 		width;
	double 		height;
	Point 		point;
	public Rectangle(){
		width = 0;
		height = 0;
		point = new Point(); 
		point.x = 0;
		point.y = 0;
	}
	public void setAll(double w,double h,double i,double j){
		width = w;
		height = h;
		point.x = i;
		point.y = j;
	}
	public boolean bPointIn(Point p){
		boolean flag = true;
		if((p.x >= point.x)&&(p.x <= point.x + width)){
			if((p.y >= point.y)&&(p.y <= point.y + height)){
				flag = true;
			}else{
				flag = false;
			}
		}else{
			flag = false;
		}
		return flag;
	} 
	public boolean bRectangle(Rectangle r){
		boolean flag = true;
		if((r.point.x >= point.x)&&(r.point.x <= point.x + width)){
			if((r.point.y >= point.y)&&(r.point.y <= point.y + height)){
				if(r.point.x + r.width <= point.x + width){
					if(r.point.y + r.height <= point.y + height){
						flag = true;
					}
				}else{
					flag = false;
				}
			}else{	
				flag = false;
			}
		}else{
			flag = false;
		}
		return flag;
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