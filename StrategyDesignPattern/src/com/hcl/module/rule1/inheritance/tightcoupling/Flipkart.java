package com.hcl.module.rule1.inheritance.tightcoupling;

public class Flipkart {
	
	private int oid=101;
	private DTDC dtd=new DTDC();
	private Bludart brt=new Bludart();
	
	public String shopping(String items[] , float prices[])
	{
	  // business logic
		
		System.out.println(items[0]+" "+prices[0]);
		System.out.println(items[1]+" "+prices[1]);
		
		
		
		dtd.deliver(oid);
		return "Order Placed! It will be delivered by courier services";
	}

}
