import java.util.*;

class MyArrayList <String> {
	private static int DEFAULT_CAPACITY = 10;
	private int size;
	private String[] data;
	public MyArrayList(){
		data =(String[]) new Object[DEFAULT_CAPACITY];
	}
	public MyArrayList(int capacity){
		data =(String[]) new Object[capacity];
	} 
	public void trimToSize(){
		if(size != data.length){
			String[] newData =(String[]) new Object[data.length];
			System.arraycopy(data,0,newData,0,data.length);
			data = newData;
		}
	}
	private void enlargeListSize(int minCapacity){
		int current = data.length;
		if(minCapacity>current){
			String[] newData =(String[]) new Object[Math.max(current*2,minCapacity)];
			System.arraycopy(data,0,newData,0,size);
			data = newData;
		}
	}
	public int size(){
		return size;
	}
	public boolean isEmpty(){
		return size == 0;
	}
	public boolean contains(String e){
		return indexOf(e)!=-1;
	}
	public int indexOf(String e){
		for(int i=0;i<size;i++){
			if(e.equals(data[i]))
				return i;
		}
		return -1;

	}
	public int lastIndexOf(String e){
		for(int i=size-1;i>=0;i--){
			if(e.equals(data[i]))
				return i;
		}
		return -1;
	}
	public String get(int index){
		if(index>=size){
			System.out.println("Error:IndexOutOfBoundsException");
		}
		return data[index];
	}
	public String set(int index,String e){
		if(index>=size){
			System.out.println("Error:IndexOutOfBoundsException");
		}
		String result = data[index];
		data[index] = e;
		return result;
	}
	public boolean add(String e){
		if(size == data.length){
			enlargeListSize(size+1);
		}
		data[size++] = e;
		return true;

	}
	public void add(int index,String e){
		if(index>=size){
			System.out.println("Error:IndexOutOfBoundsException");
		}
		if(size == data.length){
			enlargeListSize(size+1);
		}
		if(index != size){
			System.arraycopy(data,index,data,index+1,size-index);
		}
		data[index]=e;
		size ++;
	}
	public String remove(int index){
		if(index>=size){
			System.out.println("Error:IndexOutOfBoundsException");
		}
		String result = data[index];
		if(index != --size){
			System.arraycopy(data,index+1,data,index,size-index);
		}
		data[size]=null;
		return result;
	}
	public void clear(){
		if(size > 0){
			Arrays.fill(data,0,size,null);
			size=0;
		}
	}
}

public class work2_2{
	public static void main(String[] args) {
		MyArrayList<String> array1 = new MyArrayList<String>();
		array1.add("This is first");
		array1.add("90");
		array1.add("hello");
		array1.add("world");
		for (int i=0;i<array1.size();i++ ) {
			System.out.print(array1.get(i)+"  ");
		}
	}
}