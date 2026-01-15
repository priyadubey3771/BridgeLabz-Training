package birdsanctuary;

class Kiwi extends Bird {

    public Kiwi(String id, String name) 
    {
        super(id, name, "Kiwi");
    }

    @Override
    public void eat() 
    {
        System.out.println(" | Eats insects");
    }
}
