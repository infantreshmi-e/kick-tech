package com.kicktech.array;

public class ArrayElementAssignSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//case1
		int[] a=new int[5];
		a[0]=1;
		a[1]='a';
		byte by=20;
		a[2]=by;
		short s=30;
		a[3]=s;
		//a[4]=50l;compile Error:PLP found long required int
		
		//case2 I
		Object[] o=new Object[10];
		o[0]=new Object();
		o[1]=new String("Reshmi");
		o[2]=new Integer(10);
		
		//case2 II
		Number[] n=new Number[10];
		n[0]=new Integer(10);
		n[1]=new Double(10.5);
		//n[2]=new String("Reshmi");//String is not child classof number 
		//CE: Incompatible types found java.lang.String required java.lang.Number
		
		
		//case3
		Runnable[] r=new Runnable[10];
		//runnable type array obejct we can create.but interface object we cant create
		r[0]=new Thread();
		//r[1]=new String("Reshmi");
		//CE: Incompatible types found java.lang.String required java.lang.Runnable

	}

}
