package com.javaex.ex03;

public class Rectangle {

	private int width;
	private int height;
	
	private int resultR;
	private int resultP;
	
	Rectangle(){
		
	}
	
	Rectangle(int width, int height){
		this.width = width;
		this.height = height;
	}
	
	@Override
	public boolean equals(Object obj) {
		Rectangle p = (Rectangle)obj;
		this.resultR = this.width * this.height;
		this.resultP = p.width * p.height;
		
		if (this.resultR == this.resultP) {
			return true;
		} else {
			return false;
		}
			
//		if (this.width == p.width && this.height == p.height) {
//			return true;
//		} else {
//			return false;
//		}
		
		
		
		
		
	}
	
}
