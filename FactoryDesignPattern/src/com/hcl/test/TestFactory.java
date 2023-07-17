package com.hcl.test;

import com.hcl.comps.Person;
import com.hcl.factory.PersonFactory;

public class TestFactory {

	public static void main(String[] args) {

		Person person = PersonFactory.getFactory("student");

		person.dotask();

		Person person1 = PersonFactory.getFactory("employee");

		person1.dotask();

		Person person2 = PersonFactory.getFactory("customer");

		person2.dotask();

	}

}
