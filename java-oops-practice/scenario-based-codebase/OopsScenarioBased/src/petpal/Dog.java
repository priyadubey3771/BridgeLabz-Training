package petpal;

public class Dog extends Pet {

    public Dog(String name, int age) 
    {
        super(name, "Dog", age);
    }

    @Override
    public void feed() 
    {
        decreaseHunger(20);
        increaseEnergy(10);
        System.out.println(name + " is eating dog food.");
    }

    @Override
    public void play() 
    {
        decreaseEnergy(15);
        increaseMood(20);
        increaseHunger(10);
        System.out.println(name + " is playing fetch.");
    }

    @Override
    public void sleep() 
    {
        increaseEnergy(25);
        System.out.println(name + " is sleeping peacefully.");
    }

    @Override
    public void makeSound() 
    {
        System.out.println(name + " says: Woof Woof!");
    }
}
