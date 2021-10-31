package com.kicktech.literal;

public class IntegralLiteralSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=10;//decimal form
		int y=010;//octal form
		int z=0X10;//hexa decimal
		
		int num1=10;//valid decimal form
		//int num2=0786;//invalid octal form.Octal form prefix with 0 and 8 will not be allowed.Compile Error integer number too large
		int num3=077;//valid octal form
		int num4=0xFace;//valid hexa decimal form
		int num5=0xBeef;//valid hexa decimal form
		//int num6=0xBear;//in valid hexa decimal value 'r'.
		
		System.out.println(x+"..."+y+"...."+z);
		//default JVM always consider decimal form
		//x= 10 because decimal value
		
		//y-->jvm needs to convert from octal  to decimal
		//((10)base8 ->0*8pow0+1*8pow1 = 8
		//y = 8;
		
		//z-->jvm needs to convert from hexa decimal  to decimal
		//10base16 --> 0*16pow0+1*16pow1 = 16
		//z=16
		
		
	}

}
