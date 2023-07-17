package com.hcl.factory;

import com.hcl.comps.Customer;
import com.hcl.comps.Employee;
import com.hcl.comps.Person;
import com.hcl.comps.Student;

public class PersonFactory {


	public static Person getFactory(String type)
	{
		Person person =null;
		
		if(type.equalsIgnoreCase("student"))
		{
			return person=new Student();
		}
		else if(type.equalsIgnoreCase("employee"))
		{
			return person=new Employee();
		}
		else if(type.equalsIgnoreCase("customer"))
		{
			return person=new Customer();
		}
		else
			throw new IllegalArgumentException();	
	}
	
}
