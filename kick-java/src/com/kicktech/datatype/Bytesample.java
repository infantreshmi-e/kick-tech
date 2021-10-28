package com.kicktech.datatype;

public class Bytesample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte num1=10;
		byte num2 = 127;
		//byte num3=128;CompileError:possible loss of precision found int required byte.
		//byte num4=10.5;CompileError:possible loss of precision found double required byte.
		//byte num5=true;CompileError:Incompatabile type found boolean required byte.
		//byte num6="durga";CompileError:Incompatabile type found java.lang.String required byte.
		System.out.println(num1+":"+num2);
	}

}
