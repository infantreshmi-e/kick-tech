package com.kicktech.literal;

public class IntToLongSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=10;
		long lx=10l;
		//int xl=10l;//invalid long 8 bytes can't sit into int 4 bytes
		//Compile Error possible loss of precision found long required int
		long lxx=10;//valid 4 byte int can be sit with 8 byte long memeory
		

	}

}
