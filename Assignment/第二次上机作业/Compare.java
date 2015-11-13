import java.util.*;


public class Compare{
	public static void main(String[] args) {
		MyArrayList<String> array1 = new MyArrayList<String>();
		ArrayList<String>   array2 = new ArrayList<String>();

		Date dOld = new Date();
		long lOld = dOld.getTime();      
 		array1.add("This is first");
		array1.add("90");
		array1.add("hello");
		array1.add("world");
		Date dNew = new Date();
		long lNew = dNew.getTime();			

		Date eOld = new Date();
		long fOld = eOld.getTime();  
 		array2.add("This is first");
		array2.add("90");
		array2.add("hello");
		array2.add("world");	
		Date eNew = new Date();
		long gNew = eNew.getTime();			
		System.out.println("First Compare ,MyArrayList Cost:"+(lNew - lOld));
		System.out.println("First Compare ,ArrayList Cost:"+(gNew - fOld));

		Date hNew = new Date();
		long jNew = hNew.getTime();  		
		for (int i=0;i<array1.size();i++ ) {
			System.out.print(array1.get(i)+"  ");
		}	
		System.out.println();

		Date mNew = new Date();
		long nNew = mNew.getTime();  		
		for (int j=0;j<array2.size();j++ ) {
			System.out.print(array2.get(j)+"  ");
		}				
		System.out.println();
		
		System.out.println("Second Compare ,MyArrayList Cost:"+(jNew - lOld));
		System.out.println("Second Compare ,ArrayList Cost:"+(nNew - fOld));
	}
}