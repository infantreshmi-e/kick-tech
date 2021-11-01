package com.kicktech.array;

public class AnonymousArraySample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//anonymous array for one time use(to find sum)
		sum(new int[] {10,20,30,40});
		sum(new int[][] {{10,20},{30,40}});	
		//sum(new int[3] {10,20,30,40});we should not specify the size for anonymous array
		//compile error
		
		int[] aa = new int[] {10,20,30,40};

	}
	//just for using to find the sum we are using a array.one time usage.after sum we  will not use anymore.
	public static void sum(int[] a) {
		int total=0;
		for(int x1:a) {
			total=total+x1;
		}
		System.out.println("The Sum is"+total);
	}
	public static void sum(int[][] a) {
		
	}

}
