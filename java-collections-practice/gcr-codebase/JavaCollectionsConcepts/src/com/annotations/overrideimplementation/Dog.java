package com.annotations.overrideimplementation;

public class Dog extends Animal{

	@Override
	public void makeSound() 
	{
		System.out.println("Dog Barks!") ;
	}
}