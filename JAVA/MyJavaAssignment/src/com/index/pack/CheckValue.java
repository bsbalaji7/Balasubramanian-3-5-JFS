package com.index.pack;

public class CheckValue {

	public static int getValue(int input){
		int value = 0;
		if(input > 1) {
			value = input*10;
		}
		return value;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getValue(88));
	}

}
