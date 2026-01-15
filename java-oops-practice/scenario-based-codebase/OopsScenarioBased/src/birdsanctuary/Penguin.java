package birdsanctuary;

class Penguin extends Bird implements Swimmable {

    public Penguin(String id, String name) 
    {
        super(id, name, "Penguin");
    }

    @Override
    public void eat() 
    {
        System.out.println(" | Eats fish");
    }

    @Override
    public void swim() 
    {
        System.out.println(" → Can swim fast");
    }
}
