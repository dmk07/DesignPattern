package com.hcl.interfaces;

public final class FlipkartFactory {

	
	public static Flipkart getCourier(String type) throws Exception
	{
		System.out.println("FlipkartFactory.getCourier()");
		Flipkart f=new Flipkart();			
		Courier courier=null;
		
		if(type.equalsIgnoreCase("DTDC"))
		{
		
			courier=new DTDC();			
		}else if(type.equalsIgnoreCase("Bluedart"))
		{
			courier=new Bluedart();
		}else if(type.equalsIgnoreCase("DFL"))
		{
			courier =new DFL();
		}else if(type.equalsIgnoreCase("Fedx"))
		{
			courier=new Fedx();
		}
		else
			throw new Exception("Invalid input");
		
		f.setCourier(courier);
		return f;
	}	
}
