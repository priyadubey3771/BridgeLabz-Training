package com.collections.queueinterface.circularbuffersimulation;

public class Driver {
  public static void main(String[] args) {

     // create circular buffer of size 3
     CircularBuffer buffer = new CircularBuffer(3);

     // insert elements
     buffer.insert(1);
     buffer.insert(2);
     buffer.insert(3);
     buffer.display();

     // insert when buffer is full (overwrites oldest)
     buffer.insert(4);
     buffer.display();
     
 }
}
