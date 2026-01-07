package petpal;

import java.util.Random;
//Base class for all pets
public abstract class Pet implements IInteractable {

    protected String name;
    protected String type;
    protected int age;

    // Encapsulated internal states
    private int hunger;  
    private int energy;   
    private int mood;     

    // Constructor with random default values
    public Pet(String name, String type, int age)
    {
        this.name = name;
        this.type = type;
        this.age = age;

        Random rand = new Random();
        this.hunger = rand.nextInt(50);
        this.energy = rand.nextInt(50) + 50;
        this.mood = rand.nextInt(50) + 30;
    }

    // Protected methods to modify internal state
    protected void increaseEnergy(int value) 
    {
        energy = Math.min(100, energy + value);
    }

    protected void decreaseEnergy(int value) 
    {
        energy = Math.max(0, energy - value);
    }

    protected void decreaseHunger(int value)
    {
        hunger = Math.max(0, hunger - value);
    }

    protected void increaseHunger(int value)
    {
        hunger = Math.min(100, hunger + value);
    }

    protected void increaseMood(int value) 
    {
        mood = Math.min(100, mood + value);
    }

    // Displaying pet status
    public void displayStatus() 
    {
        System.out.println(type + " Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Hunger: " + hunger);
        System.out.println("Energy: " + energy);
        System.out.println("Mood: " + mood);
    }

    public abstract void makeSound();
}
