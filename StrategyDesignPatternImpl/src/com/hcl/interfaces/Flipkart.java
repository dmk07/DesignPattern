package com.hcl.interfaces;

import java.util.Arrays;
import java.util.Random;

public final class Flipkart {

	private Courier courier;

	// setter method
	public void setCourier(Courier courier) {
		System.out.println("Flipkart.setCourier()");
		this.courier = courier;
	}

	// bussiness method
	public String shopping(String items[], double prices[]) {
		System.out.println("Flipkart.shopping()");

		double amount = 0;
		for (double price : prices) {
			amount = amount + price;
		}
		// generate order id
		int orderid = new Random().nextInt(1000000);

		String status = courier.deliver(orderid);

		// display shopping details
		return "OrderId:"+orderid+""+Arrays.toString(items) + ":Total Bill: " + amount;

	}

}
