package com.hcl.interfaces;

public class Test {

	public static void main(String[] args) throws Exception {

		
		System.out.println("Test.main()");

		Flipkart factory = FlipkartFactory.getCourier("DTDC");

	String status=	factory.shopping(new String[] { "shirt", "pant" }, new double[] { 3000.0, 5000.0 });

		System.out.println(status);
		
		
		
	}

}
