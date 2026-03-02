package com.index.pack;

public class EcommerceDiscount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		double product = 6000;
		double discount = 0;
		
		if(product > 5000) {
			discount = product * 0.10;
		}
		
		System.out.println(discount);
	}

}
