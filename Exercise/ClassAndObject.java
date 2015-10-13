class EmpInfo{
	String name;
	String  designation;
	String  depatment;
	public EmpInfo(String eName,String eDesign,String eDept){
		name = eName;
		designation = eDesign;
		depatment = eDept;
	}
	void print(){
		System.out.println(name + " is a " + designation + " at " + depatment + " . ");
	}
}
public class ClassAndObject{
	public static void main(String[] args) {
		EmpInfo e1 = new EmpInfo("Robert Java","Manager","Coffee shop");
		EmpInfo e2 = new EmpInfo("Tom Steven","Worker","Coffee shop");
		e1.print();
		e2.print();
	}
}