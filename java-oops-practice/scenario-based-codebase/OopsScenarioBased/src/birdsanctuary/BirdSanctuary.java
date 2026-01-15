package birdsanctuary;

import java.util.ArrayList;
class BirdSanctuary {

    private ArrayList<Bird> birds = new ArrayList<>();

    public void addBird(Bird bird) 
    {
        birds.add(bird);
        System.out.println("Bird added successfully.");
    }

    public void displayAllBirds() 
    {
        for (Bird bird : birds) 
        {
            bird.displayInfo();
            bird.eat();

            if (bird instanceof Flyable) 
            {
                ((Flyable) bird).fly();
            }
            if (bird instanceof Swimmable) 
            {
                ((Swimmable) bird).swim();
            }
            System.out.println();
        }
    }

    public void displayFlyingBirds() 
    {
        for (Bird bird : birds) 
        {
            if (bird instanceof Flyable) 
            {
                bird.displayInfo();
                System.out.println();
            }
        }
    }

    public void displaySwimmingBirds() 
    {
        for (Bird bird : birds) 
        {
            if (bird instanceof Swimmable) 
            {
                bird.displayInfo();
                System.out.println();
            }
        }
    }

    public void displayBothFlyAndSwim() 
    {
        for (Bird bird : birds) 
        {
            if (bird instanceof Flyable && bird instanceof Swimmable) 
            {
                bird.displayInfo();
                System.out.println();
            }
        }
    }

    public void removeBirdById(String id) 
    {
        birds.removeIf(b -> b.getId().equals(id));
        System.out.println("Bird removed if ID existed.");
    }

    public void sanctuaryReport() 
    {
        int fly = 0, swim = 0, both = 0, neither = 0;

        for (Bird bird : birds) 
        {
            boolean canFly = bird instanceof Flyable;
            boolean canSwim = bird instanceof Swimmable;

            if (canFly && canSwim) both++;
            else if (canFly) fly++;
            else if (canSwim) swim++;
            else neither++;
        }

        System.out.println("\n--- Sanctuary Report ---");
        System.out.println("Flyable Birds   : " + fly);
        System.out.println("Swimmable Birds : " + swim);
        System.out.println("Both            : " + both);
        System.out.println("Neither         : " + neither);
    }
}
