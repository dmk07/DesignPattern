package com.hcl.interfaces;

public final class Fedx implements Courier {

	@Override
	public String deliver(int orderId) {
	
		return "Product will be delivered by Fedx Services..";
	}

}
