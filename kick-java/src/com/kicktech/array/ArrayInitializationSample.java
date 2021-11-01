package com.kicktech.array;

public class ArrayInitializationSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] x=new int[3];
		System.out.println(x);//x is reference value.if we print reference value
		//internally toString() method called.[I@3e24e4--->className@Hashcode will be the output
		System.out.println(x[0]);
		//every array element initialized default value 0
		
		int[][] x1=new int[2][3];
		System.out.println(x1);//[[I@er4567 refernce of 2D
		System.out.println(x1[0]);//[I@345dfg refernce of 1D
		System.out.println(x1[0][0]);//0
		
		int[][] x2=new int[2][];
		System.out.println(x2);//[[I@45rcvv refernce of 2D
		System.out.println(x2[0]);//null bcz we didnot specify next level array 
		System.out.println(x2[0][0]);//null pointer exception
		
		int[] x3=new int[6];//default value of int 0 is assigned
		//we can override the default value here
		x3[0]=200;
		x3[1]=201;
		x3[2]=202;
		x3[3]=203;
		x3[4]=204;
		x3[5]=204;
		x3[6]=204;//Run time exception Array index out of bounds exception--valid range 0 to 5
		x3[-6]=90;//Run time exception Array index out of bounds exception--valid range 0 to 5
		//x3[2.5]=99;//compile always check valid int or not(with sign and without sign)Compile Error
		//possible loss precision found double required int
		//index value should be int(not consider + or -)

	}

}
