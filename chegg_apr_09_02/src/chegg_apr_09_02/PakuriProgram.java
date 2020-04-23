package chegg_apr_09_02;

import java.util.*;

public class PakuriProgram {

    // Created method to display menu 
    public static void menuDisplay() {
        System.out.println("Pakudex Main Menu\n" +
                "-----------------\n" +
                "1. List Pakuri\n2. Show Pakuri\n3. Add Pakuri\n4. Evolve Pakuri\n5. Sort Pakuri\n6. Exit\n");
    }

    public static void main(String[] args) {

        int pakuCapacity = 0; 
        int menuDisplay = 0; 
        boolean isMenuInit = true; // flag to mark if menu can be initialised or not
        String userMenuSelection; // Used for entering Pakuri in the program to search
        Pakudex pakudex; 

        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Pakudex: Tracker Extraordinaire!");

        // loop to display the whole menu
        while (isMenuInit) {
            
            try {
                System.out.print("Enter max capacity of the Pakudex: ");
                pakuCapacity = sc.nextInt();

                if (pakuCapacity < 0) {
                    System.out.println("Please enter a valid size.");
                } else {
                    
                    isMenuInit = false;
                }
            } catch (InputMismatchException e) {
                System.out.println("Please enter a valid size.");
                sc.next();
            }
        }
        isMenuInit = true;

        System.out.println("The Pakudex can hold " + pakuCapacity + " species of Pakuri.\n");
        pakudex = new Pakudex(pakuCapacity); 

        // Another while to actually run and maintain the menu till it is exited by input 6 from user
        while (isMenuInit) {
            menuDisplay();
            // If user enters less than 0 or more than 6 for options, an error message pulls up
            try {
                System.out.print("What would you like to do? ");
                menuDisplay = sc.nextInt();
                if (menuDisplay <= 0 || menuDisplay > 6) {
                    System.out.println("Unrecognized menu selection!\n");
                }
            } catch (InputMismatchException e) {
                // Or if it is a string input for menu options there is also an error
                System.out.println("Unrecognized menu selection!\n");
                sc.next();
            }

            if (menuDisplay == 1) { // Option 1 is to list Pakuri. Lists none if there hasn't been any added yet
                if (pakudex.getSize() == 0) {
                    System.out.println("No Pakuri in Pakudex yet!" + "\n");
                } else { // Loops through and lists in numerical list format
                    System.out.println("Pakuri In Pakudex: ");
                    String[] bulba = pakudex.getSpeciesArray(); // uses getSpeciesArray method from Pakudex to use
                    int i; // Initializing the loop variable was apparently better (I say not)
                    for (i = 0; i < pakudex.getSize(); ++i) {
                        System.out.println((i + 1) + ". " + bulba[i]); // i + 1 since the loop starts at 0
                    }
                    System.out.println();
                }

            } else if (menuDisplay == 2) { // Lists stats of Pakuri. If there isn't said Pakuri then error message pulls up
                System.out.print("Enter the name of the species to display: ");
                userMenuSelection = sc.next();
                if (pakudex.checkIfExist(userMenuSelection) == -1) {
                    System.out.println("Error: No such Pakuri!\n");
                } else { // Lists the stats once successful
                    int[] showPakuStat = pakudex.getStats(userMenuSelection);
                    System.out.println("\nSpecies: " + userMenuSelection);
                    System.out.println("Attack: " + showPakuStat[0]);
                    System.out.println("Defense: " + showPakuStat[1]);
                    System.out.println("Speed: " + showPakuStat[2] + "\n");
                }
            } else if (menuDisplay == 3) {
                // Checks to see if size has reached capacity entered in the beginning yet.
                if (pakudex.getSize() == pakuCapacity) {
                    System.out.println("Error: Pakudex is full!\n");
                } else {
                    System.out.print("Enter the name of the species to add: ");
                    userMenuSelection = sc.next();
                    if (pakudex.addPakuri(userMenuSelection) == true) {
                        System.out.println("Pakuri species " + userMenuSelection + " successfully added!\n");
                    } else { // Cannot add duplicates! Apparently!
                        System.out.println("Error: Pakudex already contains this species!\n");
                    }
                }
            } else if (menuDisplay == 4) { // Option to involve and level up stats
                System.out.print("Enter the name of the species to evolve: ");
                userMenuSelection = sc.next();
                if (pakudex.checkIfExist(userMenuSelection) == -1) { // If it doesn't exist, YEET
                    System.out.println("Error: No such Pakuri!\n");
                } else {
                    pakudex.evolveSpecies(userMenuSelection);
                    System.out.println(userMenuSelection + " has evolved!\n"); // yAYYYY
                }
            } else if (menuDisplay == 5) { // Sorts using bubble sort lexographically
                pakudex.sortPakuri();
                System.out.println("Pakuri have been sorted!\n");
            } else if (menuDisplay == 6) { // Finally exits! yeet yeet
                System.out.println("Thanks for using Pakudex! Bye!");
                break;
            }
        }
    }
}