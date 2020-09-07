package VirtualPetApplication;

import java.util.Scanner;

public class VirtualPetApplication {

    public static void main(String[] args) {

        String command = "";
        double randomNumber1to10 = Math.ceil(Math.random() * 10);
        Scanner input = new Scanner(System.in);

        VirtualPet kami = new VirtualPet("hearth kami", "nameless");

        //Name the Game, then warn the user about the consequences of trifling with spirits
        System.out.println("\n\n      ((> Spirit Link <))\n       - the God Forge -\n\n***Spirit Link constitutes a binding contract with Shinkai, the realm of Kami.\nYour thoughts and decisions will have real-world consequences, so be cautious.\n");

        //start of Kami Selection loop
        while (!input.equals("y")) {

            //prompt the player for a kami species
            System.out.println("A Kami is a spirit or god of an object, place, or concept.\n   Common Kami include Hearth Kami and Nature Kami, and are generally easy to get along with. \n   Rare Kami include Curse Kami, Kirrin, Phoenixes, and Dragons. \n     > Rare Kami have peculiar quirks and are more difficult to befriend. \n\nWhat kind of Kami will you look after? ");
            kami.species = input.nextLine().toLowerCase();

            //allow the user to quit immediately
            if (kami.species.equals("quit") || kami.species.equals("escape")) {
                System.out.println("Perhaps it is for the best");
                System.exit(0);
            }

            //continue to prompt user for an accurate kami type, or allow them to quit
            while (!kami.species.equals("hearth kami") && !kami.species.equals("hearth") && !kami.species.equals("nature kami") && !kami.species.equals("nature") && !kami.species.equals("curse kami") && !kami.species.equals("curse") && !kami.species.equals("kirrin") && !kami.species.equals("phoenix") && !kami.species.equals("dragon")) {

                System.out.println("I didn't quite get that, please clarify the nature of your Kami:\n*Hearth Kami      *Nature Kami    *Curse Kami\n*Kirrin      *Phoenix     *Dragon");
                kami.species = input.nextLine().toLowerCase();

                //continue to allow the user to quit
                if (kami.species.equals("quit") || kami.species.equals("escape")) {
                    System.out.println("Perhaps it is for the best");
                    System.exit(0);
                }
            }

            //update the kami species and goal
            kami.updateBio();

            //prompt user for confirmation of their Kami Choice
            System.out.println("The essence of the " + kami.getSpecies() + " is to " + kami.getGoalName() + ". \n     Is this the companion you seek? (Y/N)");
            input.nextLine().toLowerCase();
            if (command.equals("") || command.equals("yes") || command.equals("you bet") || command.equals("sure")){
                //command = "y";
                break;
            }

            //return to top of selection loop
            if (!command.equals("y")) {
                System.out.println("Okay then, finding you the perfect match is our top priority. Lets begin again...");
            }
        }

        System.out.println("\n-----------------------------------------------------------------------------------------------------");
        System.out.println("Once, as a child, the Kami known as Kymereg visited you in a dream. On this day, guided by your dreams, you have arrived at a sacred nexus of power, a crossroads with Shinkai, the realm of spirits.");
        System.out.println("\nOnce per year, on a day sacred to " + kami.getName() + ", a window to Shinkai is opened and you can see and interact with your companion. \nOn this sacred day each year, you renew your bond and sense of purpose. \nWhat shall you do when you meet?\n");

        //MAIN LOOP
        while ((!command.equals("quit")) && (!command.equals("escape"))) {

            //Update the day
            System.out.println("\n~----> Year: " + kami.getLifeTime() + "~---------------------------------------------------------------------------\n ");

            //tell the player about their kami's current action and mood
            System.out.println(kami.name + " the " + kami.species + " is " + kami.getReactionString() + "\nand is feeling " + kami.mood + "\n  ");

            //display stats
            System.out.println("~-------------------------------------------------------------------------------------------------------------------");
            System.out.println("     Hunger: " + kami.getHunger() + "                  Loyalty: " + kami.getLoyalty() + "                Goal Progress: " + kami.getGoalProgress());
            System.out.println("Intelligence: " + kami.getIntelligence() + "              Discipline: " + kami.getDiscipline() + "                 Quintessence: " + kami.getQuintessence());
            System.out.println("~-------------------------------------------------------------------------------------------------------------------");

            //warn about hunger and low Quintessence
            if (kami.getHunger() > 3) {
                System.out.println(kami.getName() + " is hungry. A hungry Kami can cause all sorts of havoc, figure out a way to feed it.");
            }
            if (kami.getQuintessence() < 5) {
                System.out.println("The Quintessence of " + kami.getName() + " is low. If the Quintessence of a kami reaches zero, they will fade to nothing.");
            }

            //display 3 random interaction options
            kami.generateChoices();
            System.out.println("\n" + kami.getInteractionOne() + " = " + kami.getInteractionOneString());
            System.out.println(kami.getInteractionTwo() + " = " + kami.getInteractionTwoString());
            System.out.println(kami.getInteractionThree() + " = " + kami.getInteractionThreeString());


            command = input.nextLine();
            if (!command.equals("quit") && !command.equals("escape")) {
                kami.tick(command);
            }
        }
    }
}