package day5;

interface NewObject<T>{
	T getObgect(T o);
}

interface NewArray<T>{
	T []getArray(int size);
}
public class LamdaDemo4 {
	public static void main(String[] args) {
		
		NewObject<String> s;
		
		NewArray<Integer> i;
		
		
		s = str -> new String(str);
		s=String::new;
		String str = s.getObgect("hello");
		
		i = size -> new Integer[size];  
		
		
		
		
		
	}
}
