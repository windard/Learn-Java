import java.io.*;
import java.util.*;

public class work3_2{
	public static void main(String[] args) {

        Scanner s = new Scanner(System.in); 
        System.out.println("Where you want to find"); 
        String begindir = s.nextLine();
        System.out.println("The file after time:");
        String inputtime = s.nextLine();		

		// String begindir = "C:\\Users\\dell\\Desktop\\python";
		// String inputtime = "2015:11:31:12:45:29";
		
		myfile f = new myfile(begindir);
		ArrayList<String> find = f.findall(inputtime);
		for (int i=0;i<find.size();i++ ) {
			System.out.println(find.get(i));
		}
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

	public ArrayList<String> findall(String inputtime){
		ArrayList<String> result = new ArrayList<String>();
		ArrayList<String> find = new ArrayList<String>();
		result =  showall(this.begindir);
		int[] l = new int[6];
		l = stringtoint(inputtime);
		for (int j=0;j<result.size() ;j++ ) {
			int[]  t = new int[6]; 
			t = gettime(result.get(j));
			if(compare(l,t)){
				find.add(result.get(j));
			}
		}
		return find;
	}

	private int[] gettime(String filename){
		File f = new File(filename);
		Date t = new Date(f.lastModified());
		String[] m = t.toString().split(" "); 
		int[]   n = new int[6];
		n[0] = Integer.parseInt(m[5]);
		if(m[1].equals("Jan")){
			n[1] = 1;
		}else if(m[1].equals("Feb")){
			n[1] = 2;
		}else if(m[1].equals("Mar")){
			n[1] = 3;
		}else if(m[1].equals("Apr")){
			n[1] = 4;
		}else if(m[1].equals("May")){
			n[1] = 5;			
		}else if(m[1].equals("Jun")){
			n[1] = 6;			
		}else if(m[1].equals("Jul")){
			n[1] = 7;			
		}else if(m[1].equals("Aug")){
			n[1] = 8;			
		}else if(m[1].equals("Sep")){
			n[1] = 9;			
		}else if(m[1].equals("Oct")){
			n[1] = 10;			
		}else if(m[1].equals("Nov")){
			n[1] = 11;			
		}else if(m[1].equals("Dec")){
			n[1] = 12;			
		}
		n[2] = Integer.parseInt(m[2]);
		n[3] = Integer.parseInt(m[3].split(":")[0]);
		n[4] = Integer.parseInt(m[3].split(":")[1]);
		n[5] = Integer.parseInt(m[3].split(":")[2]);
		return n;
	}

	private int[] stringtoint(String time){
		String[] l = time.split(":");
		int[]    t = new int[6] ;
		for (int i=0;i<l.length ;i++ ) {
			t[i] = Integer.parseInt(l[i]);
		}	
		return t;
	}

	private boolean compare(int[] l,int[] n){
		if(l[0]<n[0]){
			return true;
		}else if(l[0]>n[0]){
			return false;
		}else{
			if(l[1]<n[1]){
				return true;
			}else if(l[1]>n[1]){
				return false;
			}else{
				if(l[2]<n[2]){
					return true;
				}else if(l[2]>n[2]){
					return false;
				}else{
					if(l[3]<n[3]){
						return true;
					}else if(l[3]>n[3]){
						return false;
					}else{
						if(l[4]<n[4]){
							return true;
						}else if(l[4]>n[4]){
							return false;
						}else{
							if(l[5]<n[5]){
								return true;
							}else if(l[5]>n[5]){
								return false;
							}else{
								return false;
							}							
						}						
					}					
				}				
			}
		}
	}
}
