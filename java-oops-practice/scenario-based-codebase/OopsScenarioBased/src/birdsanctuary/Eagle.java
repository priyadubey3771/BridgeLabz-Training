package birdsanctuary;

class Eagle extends Bird implements Flyable {

    public Eagle(String id, String name) 
    {
        super(id, name, "Eagle");
    }

    @Override
    public void eat() 
    {
        System.out.println(" | Eats meat");
    }

    @Override
    public void fly() 
    {
        System.out.println(" → Can fly high");
    }
}
