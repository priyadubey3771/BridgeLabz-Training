package com.exceptionhandling.exceptionpropagationinmethods;

class ExceptionPropagation
{
    void method1()
    {
    	// Throws ArithmeticException
        int result = 10 / 0;   
    }

    void method2()
    {
        method1(); 
    }
}
