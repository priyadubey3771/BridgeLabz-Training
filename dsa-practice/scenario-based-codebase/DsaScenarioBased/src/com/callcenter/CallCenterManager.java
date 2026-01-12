package com.callcenter;

import java.util.*;

//manages call queues and customer call data
public class CallCenterManager {
	
	//queue for normal customers
	private Queue<Customer> normalqueue = new LinkedList<>();
	
	// priority queue for VIP customers
	private PriorityQueue<Customer> vipqueue = new PriorityQueue<>(new VIPComparator());
	
	// HashMap to store monthly call count
	private HashMap<String, Integer> callCountMap = new HashMap<>();
	
	//Receive a call
	public void receiveCall(Customer customer)
	{
		//updating call count
		callCountMap.put(customer.customerId, callCountMap.getOrDefault(customer.customerId, 0)+1);
	
	// VIP or not and adding to queue
	if(customer.isVIP)
	{
		vipqueue.offer(customer);
		System.out.println("VIP call added");
	}
	else
	{
		normalqueue.offer(customer);
		System.out.println("Normal call added");
	}
}

	// handle next call
	public void handleNextCall() 
	{
	   if(!vipqueue.isEmpty())
	   {
		   Customer c = vipqueue.poll();
		   System.out.println("Handling VIP customer:" + c.name);
		   
	   }
	   else if(!normalqueue.isEmpty())
	   {
		   Customer c = normalqueue.poll();
		   System.out.println("Handling normal customer:"+ c.name);
	   }
	   
	}
	
	// displaying monthly call counts
	public void displayCallCounts()
	{
		System.out.println("\n Monthly call count:");
		for(String id: callCountMap.keySet())
		{
			System.out.println("Customer ID:" + id + "-> calls - " + callCountMap.get(id));
		}
		
	}
}	
	

