package birdsanctuary;

import java.util.Scanner;
public class Driver {
  public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BirdSanctuary sanctuary = new BirdSanctuary();

    while (true) 
    {
        System.out.println("\nWelcome to EcoWing Bird Sanctuary");
        System.out.println("1. Add Bird");
        System.out.println("2. Display All Birds");
        System.out.println("3. Display All Flying Birds");
        System.out.println("4. Display All Swimming Birds");
        System.out.println("5. Display Both Flying & Swimming Birds");
        System.out.println("6. Delete Bird by ID");
        System.out.println("7. Sanctuary Report");
        System.out.println("8. Exit");
        System.out.print("Enter choice: ");

        int choice = sc.nextInt();
        sc.nextLine();

        switch (choice) 
        {
            case 1:
                System.out.print("Enter ID: ");
                String id = sc.nextLine();
                System.out.print("Enter Name: ");
                String name = sc.nextLine();
                System.out.print("Enter Type (Eagle/Duck/Penguin/Kiwi): ");
                String type = sc.nextLine();

                if (type.equalsIgnoreCase("Eagle"))
                {
                    sanctuary.addBird(new Eagle(id, name));
                }
                else if(type.equalsIgnoreCase("Duck"))
                {
                    sanctuary.addBird(new Duck(id, name));
                }
                else if(type.equalsIgnoreCase("Penguin"))
                {
                    sanctuary.addBird(new Penguin(id, name));
                }
                else if(type.equalsIgnoreCase("Kiwi"))
                {
                    sanctuary.addBird(new Kiwi(id, name));
                }
                else
                {
                    System.out.println("Invalid bird type!");
                }
                break;

            case 2:
                sanctuary.displayAllBirds();
                break;

            case 3:
                sanctuary.displayFlyingBirds();
                break;

            case 4:
                sanctuary.displaySwimmingBirds();
                break;

            case 5:
                sanctuary.displayBothFlyAndSwim();
                break;

            case 6:
                System.out.print("Enter Bird ID to delete: ");
                sanctuary.removeBirdById(sc.nextLine());
                break;

            case 7:
                sanctuary.sanctuaryReport();
                break;

            case 8:
                System.out.println("Exiting Sanctuary System...");
                sc.close();
                return;

            default:
                System.out.println("Invalid choice!");
        }
       }
     }
    }
