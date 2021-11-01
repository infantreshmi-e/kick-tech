package com.kicktech.array;

public class ArrayDeclarationSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x[]=new int [10000];
		//1D
		int[] x1;//valid
		int []x2;
 		int x3[];
		
		//int[6] x; invalid.at time of declaration we should not give the size of an array
		
		//2D
		int[][] x4;
 		int  [][]x5;
 		int x6[][];
 		int[] []x7;
 		int[] x8[];
 		int []x9[];
 		
 		int[] a,b; //valid  a 1D,b 1D
 		int[] a1[],b1;//valid  a 2D,b 1D
 		int[] a2[],b2[];//valid a 2D, 2D
 		int[] []a3,b3;//valid a 2D,b 2D(space ignored by compiler int [][] a33,b3)
 		int [] []a4,b4[];//valid a 2D,b 3D
 		//int[] []a5,[]b5;invalid If you want to declare dimension before the variable the facility only allow for first variable//Compile Error
 		//int[] []a6,[]b6,[]c7;invalid If you want to declare dimension before the variable the facility only allow for first variable//Compile Error
 		
 		//3D
 		int[][][] a7;
 		int [][][]a8;
 		int a9[][][];
 		int[] [][]a10;
 		int [] a11[][];
 		int [] []a12[];
 		int[][] []a13;
 		int[][] a14[];
 		int [][]a15[];
 		int []a16[][];
	}

}
