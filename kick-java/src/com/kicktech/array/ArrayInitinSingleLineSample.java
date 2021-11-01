package com.kicktech.array;

public class ArrayInitinSingleLineSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1D
		int[] x= {10,20,30};
		char[] ch= {'a','e','i','o','u'};
		String[] s= {"hai","hello"};
		
		int[][] xx= {{10,20},{30,40,50}};
		
		int[][][] xxx= {{{10,20,30}},{{70,80},{90,100,101}}};
		System.out.println(xxx[0][1][2]);//60
		System.out.println(xxx[1][0][1]);//80
		System.out.println(xxx[2][0][0]);//Runtime error:ArrayIndexOutof bounds exception
		System.out.println(xxx[1][2][0]);//Runtime error:ArrayIndexOutof bounds exception
		System.out.println(xxx[1][1][1]);//100
		System.out.println(xxx[2][1][0]);//Runtime error:ArrayIndexOutof bounds exception
		
		/*
		 * int[] x; x= {10,20,30};
		 * compile error
		 */

	}

}
