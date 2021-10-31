package com.kicktech.literal;

public class BooleanLiteralSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean  b= true;//valid
		//boolean c=0;//invalid Compile Error:incompatible types found int require boolean
		//boolean d=True;//invalid compile error:cannot find symbol variable True Location BooleanLiteralSample.class
		//boolean e="true";//invalid Compile Error:incompatible types found java.lang.string required boolean
		/*
		 * int x=0; if(x) { System.out.println("hell0"); }else {
		 * System.out.println("hi"); }
		 * if expects boolean only
		 * Compile Error: incompatible types found int require boolean
		 */
		
		/*
		 * while(1) { System.out.println("hello"); }
		 * while expects boolean values only
		 * Compile error:incompatible types found int require boolean
		 */
	}

}
