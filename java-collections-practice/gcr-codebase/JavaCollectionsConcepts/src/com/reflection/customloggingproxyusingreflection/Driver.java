package com.reflection.customloggingproxyusingreflection;

import java.lang.reflect.Proxy;

public class Driver {
  public static void main(String[] args) {

        Greeting original = new GreetingImpl();

        // Create dynamic proxy
        Greeting proxy = (Greeting) Proxy.newProxyInstance(Greeting.class.getClassLoader(),new Class[] { Greeting.class }, new LoggingProxy(original));

        // Call method through proxy
        proxy.sayHello("Priya");
    }
}
