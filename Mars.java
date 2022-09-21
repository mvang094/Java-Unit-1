public class Mars
{
    public static void main (String[] args) throws InterruptedException
    {
        String colonyName = "Kepler";
        String landingLocation = "The Hill";
        int shipPopulation = 300;
        double shipFood = 4000.00;
        boolean landing = true;

        //Landing process takes 2 days
        shipFood = shipFood - 2*(shipPopulation*0.75);
        System.out.println(shipFood);

        //An extra crate of food was found, increasing the food by 50%;
        shipFood += (shipFood*.5);
        System.out.println(shipFood);

        //Five babies are born
        shipPopulation += 5;
        System.out.println(shipPopulation);

        if (landingLocation.equalsIgnoreCase("The Plain"))
            System.out.println("Bbzzz Landing on the Plain");
        else
            System.out.println("ERROR! Flight plan already set. Landing on the Plain");

        //Set landing to whatever LandingCheck is
        landing = LandingCheck(100);

        new GuessingGame();
        new MarsExpedition();
        new FindingsLists();
    }
    public static boolean LandingCheck(int loops)
    {
        try
        {
            for (int i = 0; i < loops; i++)
            {
                if((i%3 == 0) && (i%5 == 0))
                    System.out.println("Keep Center");
                else if(i%5 == 0)
                    System.out.println("Right");
                else if(i%3 == 0)
                    System.out.println("Left");
                else
                    System.out.println("Calculating");
                Thread.sleep(250);
            }
            System.out.println("Landed");
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }

        return false;
    }

}
