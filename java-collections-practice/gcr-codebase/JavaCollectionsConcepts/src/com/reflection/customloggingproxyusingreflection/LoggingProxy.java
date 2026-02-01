package com.reflection.customloggingproxyusingreflection;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class LoggingProxy implements InvocationHandler 
{
	private Object target;

    public LoggingProxy(Object target) 
    {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable 
    {
    	// Log before method call
        System.out.println("Method called: " + method.getName());

        // Call original method
        return method.invoke(target, args);
    }
}
