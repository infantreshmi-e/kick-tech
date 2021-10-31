package com.kicktech.literal;

import java.io.File;

public class CharLiteralSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch1='a';//declaration
		//char ch2=a;//invalid no quotes here.Compiler  Error;cannot find symbol a location class CharLiteralSample
		//char ch3="a";//invalid this is string only
		//Compile Error incombatible types found String required char
		//char ch4='ab';//invalid after a compiler need single quote to be closed
		//Compiler Error:unclosed char literal
		//Compiler Error:unclosed char literal
		//Compiler Error:not a statement
		
		char ch5=67;//decimal literal
		char ch6=0xface;//hexa decimal literal
		char ch7=0777;//octal literal
		char ch8=65535;
		//char ch8=65536;//invalid range exceed Compiler error:possible lossof precision found int require char
		char ch9=1917;
		//if the corresponding character not available then the output is ?
		//if the corresponding font not available in keyboard,then the output is ?
		
		
		char ch10='\u0061';// output a
		//a= 97=convert  into hexa decimal = 61
		
		char ch11='\u0062';
		//b= 98=convert  into hexa decimal = 62
		
		char ch12='\n';
		char ch13='\t';
		//char ch14='\m'; Compile Error: Illegal escape character
		
		System.out.println("this is \' single quote symbol");
		//System.out.println("this is " single quote symbol"); Error
		System.out.println("this is \" single quote symbol");
		//System.out.println("this is \ charcater"); error
		System.out.println("this is \\ charcater");
		
	//	File f = new File("D:\reshmi_resume\java"); //Error no \d escape charceter
		//need to treat as symbol
		File f = new File("D:\\reshmi_resume\\java");
		
		//char ch15=65536;//invalid out of range of charcter
		//char ch16=0XBeer;//invalid r symbol invalid hexa
		
		//char ch17=\uface;//invalid single quote missing
		char ch18='\ubeef';
		//char ch19='\m';//invalid escape character
		//char ch20='\iface';// invalid \i invalid start
		
	}

}
