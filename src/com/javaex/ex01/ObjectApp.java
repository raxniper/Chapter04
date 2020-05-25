package com.javaex.ex01;

public class ObjectApp {

	public static void main(String[] args) {
		
		Object obj = new Object();	// input memory
		
		// print to class information
		System.out.println("#obj.getClass()");
		System.out.println(obj.getClass());
		
		// print to class addr value
		System.out.println("\n#obj.hashCode()");
		System.out.println(obj.hashCode());
		
		Object obj01 = new Object();
		Object obj02 = new Object();
		Object obj03 = new Object();
		
		System.out.println("\n#obj01.hashCode()");
		System.out.println(obj01.hashCode());
		
		System.out.println("\n#obj02.hashCode()");
		System.out.println(obj02.hashCode());
		
		System.out.println("\n#obj03.hashCode()");
		System.out.println(obj03.hashCode());
		
		// print to toString()
		System.out.println("\n#obj.toString()");
		System.out.println(obj.toString());
		
		// print to same instance
		System.out.println("\n#obj.equals(obj)");
		System.out.println(obj.equals(obj));
	}

}
