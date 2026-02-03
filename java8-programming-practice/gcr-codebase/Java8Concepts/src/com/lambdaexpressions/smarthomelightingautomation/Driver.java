package com.lambdaexpressions.smarthomelightingautomation;

public class Driver {
    public static void main(String[] args) {

        // Motion detected behavior
        LightBehavior motionDetected = () -> System.out.println("Lights ON: Motion detected in the room!");

        // Morning time behavior
        LightBehavior morningTime = () -> System.out.println("Lights ON: Soft warm light for morning!");

        // Night time behavior
        LightBehavior nightTime = () -> System.out.println("Lights ON: Dim light for night!");

        // Voice command behavior
        LightBehavior voiceCommand = () -> System.out.println("Lights ON: Activated via voice command!");

        // Simulate triggers
        triggerLight(motionDetected);
        triggerLight(morningTime);
        triggerLight(nightTime);
        triggerLight(voiceCommand);
    }

    // Method to execute any light behavior
    public static void triggerLight(LightBehavior behavior) 
    {
        behavior.activate();
    }
}
