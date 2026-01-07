package petpal;

public class Cat extends Pet {

    public Cat(String name, int age) 
    {
        super(name, "Cat", age);
    }

    @Override
    public void feed() 
    {
        decreaseHunger(15);
        System.out.println(name + " is eating cat food.");
    }

    @Override
    public void play() 
    {
        decreaseEnergy(10);
        increaseMood(15);
        System.out.println(name + " is playing with a ball.");
    }

    @Override
    public void sleep() 
    {
        increaseEnergy(30);
        System.out.println(name + " is sleeping lazily.");
    }

    @Override
    public void makeSound() 
    {
        System.out.println(name + " says: Meow Meow!");
    }
}
