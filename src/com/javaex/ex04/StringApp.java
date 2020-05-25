package com.javaex.ex04;

public class StringApp {

	public static void main(String[] args) {
		
		String s01 = new String("hi");
		String s02 = new String("hi");
		
		System.out.print("s01, s02 주소: ");
		System.out.println(s01 == s02);
		System.out.println(s01.hashCode());	// hashCode는 주소가 아니다.
		System.out.println(s02.hashCode());	
		
		String s03 = "hi";
		String s04 = "hi";
		
		System.out.print("s03, s04 주소: ");
		System.out.println(s03 == s04);
		System.out.println(s03.hashCode());	// hashCode는 주소가 아니다.
		System.out.println(s04.hashCode());	
		
		
	}
	
}
