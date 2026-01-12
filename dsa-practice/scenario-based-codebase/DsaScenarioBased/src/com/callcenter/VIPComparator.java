package com.callcenter;

import java.util.Comparator;
public class VIPComparator implements Comparator<Customer> 
{
	
	@Override
	public int compare(Customer c1, Customer c2)
	{
		return (c1.customerId.compareTo(c2.customerId));
	}

}
