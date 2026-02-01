package com.reflection.methodexecutiontiming;
import java.lang.reflect.Proxy;

public class Driver {
   public static void main(String[] args) {

        Task original = new TaskImpl();

        Task proxy = (Task) Proxy.newProxyInstance(Task.class.getClassLoader(),new Class[] { Task.class },new TimeInvocationHandler(original));

        proxy.performTask();
        
    }
}
