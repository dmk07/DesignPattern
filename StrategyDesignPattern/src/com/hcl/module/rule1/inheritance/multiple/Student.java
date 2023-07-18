package com.hcl.module.rule1.inheritance.multiple;

public class Student extends College {
	// if we use inheritance in strategy desing pattern then we wiil face
	// problem what all properties and methods will be inherited in child class
	// so This is not better for stratery desing patter

	// multiple inheritnace with classes is not possible

	// limitations
	// 1 no support with multiple inheritance with clases
	// 2. code becomes easy breakable
	// 3. code becomes complex for unit testing
	
	public void m1()
	{
		System.out.println("m1");
	}

}
