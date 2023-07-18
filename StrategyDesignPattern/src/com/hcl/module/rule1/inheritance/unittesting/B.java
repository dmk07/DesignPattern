package com.hcl.module.rule1.inheritance.unittesting;

public class B extends A{

	// while unit testing when we test B clcass methods 
	//then we should test A class methods 
	// this is so much burdon on programmer
	
	
	public int m3()
	{
		return 10000;
	}

	public int m4()
	{
		return 100000;
	}
}
