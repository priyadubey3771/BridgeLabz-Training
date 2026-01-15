package birdsanctuary;

class Duck extends Bird implements Flyable, Swimmable {

    public Duck(String id, String name) 
    {
        super(id, name, "Duck");
    }

    @Override
    public void eat() 
    {
        System.out.println(" | Eats grains");
    }

    @Override
    public void fly() 
    {
        System.out.println(" → Can fly");
    }

    @Override
    public void swim() 
    {
        System.out.println(" → Can swim");
    }
}
