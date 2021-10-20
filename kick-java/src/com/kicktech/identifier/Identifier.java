package com.kicktech.identifier;

public class Identifier {

	public static void main(String[] args) {
		int num=90;
		
		//1.allowed characters in identifier
		int aAzZ$_123 = 88;
		
		//2.identifier cant start with digit
		int total123=890;
		// int 123total=900; (compile time error)
		
		//3.case sensitive identifiers
		int number=99;
		int Number=99;
		int NUMBER=99;
		
		
		//4.No limit for identifier length
		int dfcgvhbnjjhbbgfsasxdcfvgbhnjhbgvfcdxszxdcfvghbnhbgvfcdxcfgvhbgvfcgvbhvgfcvbshbdvgsxs = 789;
		
		//5.cannot use reserved word as identifier
		
		// int if=90; (compile time error)
		
		//6.can use predefined class name and interface name as identifiers
		
		int String=90;
		int Runnable=900;
		
		System.out.println(num+":"+aAzZ$_123+":"+total123+":"+number+":"+Number+":"+NUMBER+":"+dfcgvhbnjjhbbgfsasxdcfvgbhnjhbgvfcdxszxdcfvghbnhbgvfcdxcfgvhbgvfcgvbhvgfcvbshbdvgsxs+":"+String+":"+Runnable);

	}

}
