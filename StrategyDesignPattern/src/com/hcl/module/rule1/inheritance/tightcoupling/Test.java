package com.hcl.module.rule1.inheritance.tightcoupling;

public class Test {
// in this application we facing tight coupling between compos classes.
// means that we should create obje tighly in target class everytime
// when every dependent class is added in app
// this application is followed first two rules and third one is just 
// open for extention but closed for modification
// by declaring classes final we can achieve third rule

	public static void main(String[] args) {
	
		Flipkart cart=new Flipkart();
	String str=	cart.shopping(new String[] {"Shoe","Shirt"},new float[] {101f,32f});
		
		System.out.println(str);
	System.out.println("-------------------------");	
	String status=	cart.shopping(new String[] {"airbuds","chappal"},new float[] {233f,4433f});
		System.out.print(status);
		
	}

}
