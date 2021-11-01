package com.kicktech.array;

public class LengthDifferSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] x=new int[6];
		//System.out.println(x.length()); Compile error cannot find symbol method length() location class LengthDifferSample
		System.out.println(x.length);//6
		/*
		 * String s="Reshmi"; System.out.println(s.length);//
		 * length variable not applicable length method only applicable
		 * Compile error cannot find symbol variable length location class LengthDifferSample
		 */		
		String s="Reshmi";
		System.out.println(s.length());//5
		
		String[] s1= {"a","aa","aaa"};
		System.out.println(s1.length);//3
		//System.out.println(s1.length());//Compile Error cannot find symbol method length location class LengthDifferSample
		//System.out.println(s1[0].length);//Compile Error cannot find symbol variable length location class LengthDifferSample
		System.out.println(s1[0].length());//1
		
		int[][] xx1=new int[6][3];
		System.out.println(xx1.length);//6 should consider base size only
		System.out.println(xx1[0].length);//3
		System.out.println(xx1[0].length+xx1[1].length+xx1[2].length+xx1[3].length+xx1[4].length
				+xx1[5].length);
	}

}
