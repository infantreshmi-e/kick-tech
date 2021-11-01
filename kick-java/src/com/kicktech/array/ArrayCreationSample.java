package com.kicktech.array;

public class ArrayCreationSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a=new int[3];// a is a reference variable in this array
		System.out.println(a.getClass().getName());//output [I
		byte[] b=new byte[3];
		boolean[] bb=new boolean[4];
		System.out.println(bb.getClass().getName());
		
		//int[] x=new int[];//invalid.CE.at the time of creation,compulsory should give the size to be JVM reserved the 
		//memory
		
		int[] xx=new int[6];//valid size specified at creation
		
		int[] x = new int[0];//valid legal to have the 0 size array
		
		int[] x1=new int[-3];//no Compile time error but runtime error:Negative Array size Exception
		
		int[] x2=new int[10];
		int[] x3=new int['a'];// a's corresponding unicode 97 char to int accepted
		byte b1=20;
		int[] x4=new int[b1];
		short s1=230;
		int[] x5=new int[s1];
		//int[] x6=new int[10l];//Compile Error possible loss of precision found long required int
		
		int[] x6=new int[2147483647];//max ofArray-int range is the max size of array
		//int[] x7=new int[2147483648];Compile Error:integer number too large
		//int[] x7=new  int[];//invalid base size we have to specify
		int[] x8=new int[8];
		//int[][] x9=new  int[][];//invalid atleat  base size we have to specify
		int[][] x10=new int [3][];
		//int[][] x11=new int[][4];//invalid  base size is mandatory rather than supplementary size
		int[][] x12=new int[3][4];
		int[][][] x13=new int[3][4][5];
		int[][][] x14=new int[3][4][];
		//int[][][] x15=new int[3][][5];//invalid without specify 2 nd dimension value how you can specify 3rd one
		//int[][][] x16=new int[][4][5];//invalid without specify is one  dimension value how you can specify 2nd and 3rd one

	}

}