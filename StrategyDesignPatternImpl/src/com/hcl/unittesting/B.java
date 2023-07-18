package com.hcl.unittesting;

public class B {

	private A a=new A();
	public int m3()
	{
		int y=a.m1();
		return y+100;
		
	}
	public int m4()
	{
		int x=a.m2();
		return x+100;
	}
	
}
