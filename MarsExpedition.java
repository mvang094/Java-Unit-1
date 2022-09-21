import java.util.*;

public class MarsExpedition
{
    public MarsExpedition()
    {
        String name, excited, weapon, vehicleChoice, vehicle;
        int teamSize;
        Scanner input = new Scanner(System.in);
        System.out.print("Expedition prep program starting\n" +
                        "Booting up\n" + "...\n" + "...\n" +
                        "Ready!");
        System.out.println("Hello User! What is your name? ");
        name = input.nextLine();

        System.out.println("Hello " + name + "-Welcome to the Expedition Prep Program.\n"
                            + " Are you reading to head out into the new world? Type Y or N");
        excited = input.nextLine();

        if (excited.equalsIgnoreCase("y"))
            System.out.println("I knew you would say that! You are team leader for a reason");
        else
            System.out.println("Too bad. You are a team leader so you have to go!");

        System.out.println("How many people do you want on your expedition team?");
        teamSize = input.nextInt();
        input.nextLine();

        if (teamSize > 2)
        {
            System.out.println("Too many! Only two more can go");
            teamSize = 2;
        }
        else if (teamSize < 2)
        {
            System.out.println("Not enough people. We need you and 2 more people");
            teamSize = 2;
        }
        else
            System.out.println("That's a perfect sized team. Good Job");

        System.out.println("You're allowed to bring one weapon with you. What will you bring?");
        weapon = input.nextLine();

        System.out.println(weapon + " is a nice choice");

        System.out.println("You will have the choice of 3 vehicles. Which one will you choose? A, B, or C? :\n" +
                "A. Mars Rover\n" +
                "B. Chevy Silverado\n" +
                "C. Honda Civic");
        vehicleChoice = input.nextLine();

        if (vehicleChoice.equalsIgnoreCase("a"))
            vehicle = "Mars Rover";
        else if (vehicleChoice.equalsIgnoreCase("b"))
            vehicle = "Chevy Silverado";
        else if (vehicleChoice.equalsIgnoreCase("c"))
            vehicle = "Honda Civic";
        else
            vehicle = "their feet";

        System.out.println("Your expedition team is ready! It is lead by " +name+ " with " +
                            teamSize + " teammates\n" +
                            "to explore the surface of Mars with a " + weapon +
                            " and a " + vehicle + ".\nExploration team heads out in \n" +
                            "5.....\n4....\n3...\n2..\n1.\n GO! GO! GO!");
    }
}
