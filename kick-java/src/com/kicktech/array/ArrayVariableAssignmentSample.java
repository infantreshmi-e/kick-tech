package com.kicktech.array;

public class ArrayVariableAssignmentSample {
	public static void main(String[]args) {
		//case1
		int[] a= {10,20,30};
		char[] ch= {'a','e','i'};
		int[] b=a;
		//int[] c=ch;//invalid Compile Error:Incompatible type found char[] required int[]
		String[] s= {"a","b","c"};
		Object[] o=s;
		
		//case2
		int[] aa= {10,20,30,40};
		int[] bb= {50,60};
		aa=bb;
		bb=aa;
		// whenever assigning one array to another array only reference variable changed

		//case3
		int[][] aaa=new  int[3][];
		//aaa[0]=new int[4][3];//Compile Error incompatible types found int[][] required int[]
		//dimension to be matched when assign one array to another array
		
		//aaa[0]=10;//Compile Error incompatabile types found int require int[]
		aaa[0]=new int[3];//valid
		
		
		//common questions
		/*1
		 * for(int i=0;i<=args.length;i++) { System.out.println(args[i]); }
		 * RE:Array index bounds of exception
		 * if passing A B C ---> out put A B C AIOOBE
		 * if passing A B------> out put A B AIOOBE
		 * If passing empty cmd---> out put AIOOBE
		 * if passing 3 variables args.length=3 it expects a[0],a[1],a[2],a[3] 4 varibles.
		 * so we are getting AIOOBE
		 * 
		 */
		//2
		String[] args1= {"x","y","z"};
		args=args1;
		for(String s1:args) {
			System.out.println(s1);
			
		}
			//already ccmd we are passing A B C,A B ,empty combinations
		//args-->  A B C
		//args1-->x y z
		//args=args1; here args pointed to x y z
		//so out put will bwe x y z only for all 3 cases
		
		//3
		int[][] cc=new int[4][3];
		cc[0]= new int[4];// one object created(reassign existing one)
		cc[1]=new int[2];//one object created(reassign existing one)
		cc=new int[3][2];// 4 objects created as a rray. gc to old a array
		//total how many objects created?12
		//total how many objects eligible for GC?7
		
	}

}
