public class PassTest{
	float ptValue;
	public void changeObjValue(PassTest ref){
		ref.ptValue = 99.0f;
	}
	public static void main(String[] args) {
		PassTest pt = new PassTest();
		pt.ptValue = 101.0f;
		pt.changeObjValue(pt);
		System.out.println("ptValue is : " + pt.ptValue);
	}
}