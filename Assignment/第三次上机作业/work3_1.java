import java.io.*;
import java.util.*;

public class work3_1{
	public static void main(String[] args) {

        Scanner s = new Scanner(System.in); 
        System.out.println("Where you want to find"); 
        String begindir = s.nextLine();
        System.out.println("The file you find is:");
        String findname = s.nextLine();

		// String begindir = "C:\\Users\\dell\\Desktop\\holiday-project";
		// String findname = "css";
		
		myfile f = new myfile(begindir);
		ArrayList<String> find = f.findall(findname);
		for (int i=0;i<find.size();i++ ) {
			System.out.println(find.get(i));
		}
		System.out.println(find.size());

	}
}

class myfile{
	private String begindir;
	public myfile(String begindir){
		this.begindir = begindir;
	}

	private ArrayList<String> showall(String begindir){
		File f = new File(begindir);
		File[] list = f.listFiles();
		ArrayList<String> result1 = new ArrayList<String>();
		ArrayList<String> result2 = new ArrayList<String>();
		for (File i :list ) {
			if(i.isFile()){
				result1.add(i.getAbsolutePath());
			}else{
				result2 = showall(i.getAbsolutePath());
				result1.addAll(result2);
			}
		}
		return result1;
	}

	public ArrayList<String> findall(String findname){
		ArrayList<String> result = new ArrayList<String>();
		ArrayList<String> find = new ArrayList<String>();
		result =  showall(this.begindir);
		for (int i=0;i<result.size() ;i++ ) {
			String fullname = result.get(i);
			String token = fullname.substring(fullname.lastIndexOf(".")+1);
			if(token.equals(findname)){
				find.add(fullname);
			}
		}
		return find;
	}

}