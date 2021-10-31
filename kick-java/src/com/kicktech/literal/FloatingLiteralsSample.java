package com.kicktech.literal;

public class FloatingLiteralsSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//float f=123.4567//Compile Error possible loss of precision found double required float.
				//8 bytes double value  cant sit into 4 bytes float value.
		float f =123.456f; //valid
		double d =123.456;//valid ny default all floating values are double
		double d1 = 123.456d;//valid only.But default compiler consider the double type.
		//So this declaration not required.
		//float f = 123.456d;//Compile Error: possible loss of precision.found double required float
		double num1= 123.456;//decimal literal only
		double num2=0123.456;//decimal literal only.prefix 0 consider decimal form.
		//output = 123.456
		//double num3=0x123.456;//Compile Error:malformed floating point literal
		
		//double num4=0786;//invalid.because thisis not floating point literal.
		//So it is integral form.prefix 0 is octal form .8 is not allowed in octal form.
		//Compile Error:integer number too large.
		double num5 =0xface;
		//oxface is integral with hexa decimal form.weca assign integal to double variable.
		
		double num6=0786.0;//valid
		//double num7=0xface.0;//invalid
		double num8=0777;//valid we can assign integral literal directly to floating point variable
		//int num9=10.0;//can't assign floating point literals to integral types.
		//Compile Error:possible loss of precision found double required int
		
		double num10=1.2e3;//1.2*10pow3=1200.0 we can specify 
		//float ff = 1.2e3;//invalid .double to float is can't
		//Compile Error Possible loss of precision found double require float.
		float fff = 1.2e3f;//double to float conversion by using suffix 'f'.
		
	}

}
