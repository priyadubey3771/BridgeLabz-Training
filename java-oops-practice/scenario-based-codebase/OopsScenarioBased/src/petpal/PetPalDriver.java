package petpal;

public class PetPalDriver {
  public static void main(String[] args) {

        Pet pet1 = new Dog("Buddy", 3);
        Pet pet2 = new Cat("Whiskers", 2);
        Pet pet3 = new Bird("Tweety", 1);

        Pet[] pets = { pet1, pet2, pet3 };
        for (Pet pet : pets)
        {
            System.out.println(" ");
            pet.makeSound();
            pet.feed();
            pet.play();
            pet.sleep();
            pet.displayStatus();
        }
    }
}
