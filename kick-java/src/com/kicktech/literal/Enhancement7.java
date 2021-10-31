package com.kicktech.literal;

public class Enhancement7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=0B1111;
		System.out.println(x);//output 15(binary of 1111=15)
		
		double d=1_23_456.7_8_9;
		double d1=123_456.7_8_9;
		
		double d2=1_233_4_5__6.7_8_9;
		double d3=1___2__3_4_5_6.7_8_9;
		
		//double d4=_1_23_4_5__6.7_8_9;invalid.bcz  only between the digits only should use _
		
		//double d5=1___2__3_4_5_6_.7_8_9; invalid.bcz  only between the digits only should use _
		
		//double d6=1___2__3_4_5_6_.7_8_9_; invalid.bcz  only between the digits only should use _
		

	}

}
