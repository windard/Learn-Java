import java.io.*;
import java.util.*;
import java.util.concurrent.*;

public class homework{
	public static void main(String[] args) {
		String	begin = "C:\\Users\\dell\\Desktop\\2048\\js";
		rabbit r = new rabbit(begin);
		tortoise t = new tortoise(begin);
		r.start();
		t.start();
		while(true){
			if ( Thread.activeCount() == 2 ){
				if(r.isAlive()){
					System.out.println("Tortoise Faster");
				}else{
					System.out.println("Rabbit Faster");
				}
				break;
			}
		}
	}
}

class tortoise extends Thread{
	String begin;
	public tortoise(String begin){
		this.begin = begin;
	}

	@Override
	public void run(){
		ArrayList<String> files1 = aboutFile.findAll(begin);
		File t1; 
		for (String f1 :files1 ) {
			t1 = new File(f1);
			try{
				FileInputStream in = new FileInputStream(t1);
				for (int i=0;i<1024 ;i++ ) {
					// in.read();
					// int b;
					// if((b=in.read())!=-1)
					// 	System.out.print(b);
				}
				System.out.print("I am Tortoise");
				in.close();				
			}catch(Exception e){
				e.printStackTrace();
			}
			System.out.println();
		}
	}
}

class rabbit extends Thread{
	String begin;
	public rabbit(String begin){
		this.begin = begin;
	}

	@Override
	public void run(){
		ArrayList<String> files2 = aboutFile.findAll(begin);
		File t2;
		for (String f2:files2 ) {
			t2 = new File(f2);
			// t2.getPath();
			// t2.length();
			// t2.lastModified();
			// System.out.println(t2.getPath());
			// System.out.println(t2.length());
			// System.out.println(t2.lastModified());
			System.out.println("I am Rabbit");
			try{
				TimeUnit.SECONDS.sleep(1);
			}catch(Exception e){
				e.printStackTrace();
			}
		}
	}	
}

class aboutFile{
	static ArrayList<String> result = new ArrayList<String>();

	public static ArrayList<String> findAll(String begin){
		File beginFile = new File(begin);
		File[] fileList = beginFile.listFiles(); 
		for (File i :fileList ) {
			if(i.isFile()){
				result.add(i.getAbsolutePath());
			}else{
				findAll(i.getAbsolutePath());
			}
		}
		return result;		
	}
}