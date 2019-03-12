package testPackage;

import java.util.ArrayList;

public class wrapperExample {

	public static void main(String[] args) {
		
		int a = 100;
		
		Integer i= Integer.valueOf(a); // converting int into INTEGER explicitly
	
		Integer j= a; //autoboxing, now compiler will write Integer.valueOf(a) internally
		
		System.out.println(a+" "+i+" "+j);

		
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		arrayList.add(100);
		int k = arrayList.get(0); //unboxing happens when we use get() method
		
		System.out.println(k);
	}

}
