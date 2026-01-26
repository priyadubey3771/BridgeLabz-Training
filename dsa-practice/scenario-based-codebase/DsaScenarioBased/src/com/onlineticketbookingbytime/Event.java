package com.onlineticketbookingbytime;

class Event
{
    int startTime;
    String eventName;
    int height;
    Event left, right;

    Event(int startTime, String eventName)
    {
        this.startTime = startTime;
        this.eventName = eventName;
        this.height = 1;
        left = right = null;
    }

    void display()
    {
        System.out.println("Time: " + startTime + " | Event: " + eventName);
    }
}
