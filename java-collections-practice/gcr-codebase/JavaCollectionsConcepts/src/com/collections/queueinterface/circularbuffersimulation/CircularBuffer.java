package com.collections.queueinterface.circularbuffersimulation;

//Circular buffer implementation using array-based queue
class CircularBuffer {

 private int[] buffer;    
 private int front;        
 private int rear;         
 private int size;       
 private int capacity;     

 // constructor
 public CircularBuffer(int capacity) 
 {
     this.capacity = capacity;
     buffer = new int[capacity];
     front = 0;
     rear = 0;
     size = 0;
 }

 // insert element into circular buffer
 public void insert(int value) 
 {

     // if buffer is full, overwrite the oldest element
     if (size == capacity) 
     {
         front = (front + 1) % capacity; // Move front forward
         size--;
     }

     // insert new element at rear
     buffer[rear] = value;
     rear = (rear + 1) % capacity;
     size++;
 }

 // display elements in buffer order
 public void display() 
 {
	 System.out.print("Buffer: [");

     for (int i = 0; i < size; i++) 
     {
         int index = (front + i) % capacity;
         System.out.print(buffer[index]);

         if (i < size - 1) 
         {
             System.out.print(", ");
         }
     }

     System.out.println("]");
 }
}
