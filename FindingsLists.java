import java.util.*;

public class FindingsLists
{
    public static void main (String[] args) throws InterruptedException
    {
        Thread.sleep(500); //Stops the terminal for half a second

        String fossilChoice;

        System.out.println("Welcome back from the your expedition! Time to catalog everything you've found");
        System.out.println("Rock Data Downloaded");

        Scanner input = new Scanner(System.in);
        ArrayList<String> rockList = new ArrayList<>();
        //Create a HashMap that allows the fossilDirectory to have 2 attributes i.e. name and description
        HashMap<String, String> fossilDirectory = new HashMap<>();
        HashSet<String> suppliesBrought = new HashSet<>();
        HashSet<String> suppliesUsed = new HashSet<>();

        rockList.add("weird rock");
        rockList.add("funky rock");
        rockList.add("smooth rock");
        rockList.add("not a rock");

        System.out.println(rockList);
        System.out.println("Wait....the last one is not a rock! Let's remove it");

        rockList.remove("not a rock");

        System.out.println(rockList);
        System.out.println("Perfect");

        Thread.sleep(500);

        System.out.println("Fossil Data Downloaded");
        fossilDirectory.put("Bird Fossil", "The fossil was capable of flight");
        fossilDirectory.put("Fish Fossil", "The fossil is vaguely fish shaped, which implies there was once water");
        fossilDirectory.put("Tooth Fossil", "The tooth from an unknown fossil");

        System.out.println("Which of the fossils would you like to learn more about (Spelling and Spacing are important");
        fossilChoice = input.nextLine();

        if (fossilChoice.equalsIgnoreCase("Bird Fossil"))
        {
            System.out.println("Fossil: " + fossilChoice + "\nDescription: " +
                                fossilDirectory.get(fossilChoice));
        }
        else if (fossilChoice.equalsIgnoreCase("Fish Fossil"))
        {
            System.out.println("Fossil: " + fossilChoice + "\nDescription: " +
                    fossilDirectory.get(fossilChoice));
        }
        else if (fossilChoice.equalsIgnoreCase("Tooth Fossil"))
        {
            System.out.println("Fossil: " + fossilChoice + "\nDescription: " +
                    fossilDirectory.get(fossilChoice));
        }
        else
        {
            System.out.println("Please check your typing and try and again. The choices are: \n" +
                            "Bird Fossil, Fish Fossil, Tooth Fossil");
        }

        Thread.sleep(500);

        suppliesBrought.add("Food");
        suppliesBrought.add("Water");
        suppliesBrought.add("Medicine");
        suppliesUsed.add("Food");
        suppliesUsed.add("Water");

        System.out.println("Medicine");
    }
}
