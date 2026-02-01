package com.reflection.methodexecutiontiming;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class TimeInvocationHandler implements InvocationHandler 
{
	private Object target;

    public TimeInvocationHandler(Object target) 
    {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        long start = System.currentTimeMillis();
        Object result = method.invoke(target, args);
        long end = System.currentTimeMillis();
        System.out.println("Execution time of " + method.getName() + ": " + (end - start) + " ms");

        return result;
    }
}
