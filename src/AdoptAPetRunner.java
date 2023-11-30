import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class AdoptAPetRunner {
    public static void main(String[] args) {
        // color palette
        final String RED = "\u001B[31m";
        final String GREEN = "\u001B[32m";
        final String CYAN = "\u001B[36m";
        final String RESET = "\u001B[0m";


        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Adopt A Pet Game!");
        System.out.println("[1] Customize your pet\n[2] Randomly choose your pet");
        int customizeOrRandom = scan.nextInt();
        scan.nextLine();

        // declare the object outside the if-else scope, so it can be accessed outside the scope
        AdoptAPet pet;
        if (customizeOrRandom == 1) {
            // enter the parameters
            System.out.print("Name of your pet: ");
            String name = scan.nextLine();
            System.out.println();
            System.out.println("Here is a list of pets you can choose: ");
            System.out.println("[1] Dog\n[2] Cat\n[3] Bunny\n[4] Bird\n[5] Duck\n[6] Goldfish\n[7] Dolphin\n[8] Panda\n[9] Deer\n[10] Frog");
            System.out.print("Type of pet: ");
            int typeOfPet = scan.nextInt();
            pet = new AdoptAPet(name, typeOfPet);
        } else {
            pet = new AdoptAPet();
        }

        pet.printPet(); // print out what the pet looks like in ASCII art
        System.out.println(CYAN + "---------------------------");
        System.out.println(pet.toString()); // print out the information about the pet object
        System.out.println("---------------------------" + RESET);


        boolean win = false;
        // game loops when all the necessities are above 0
        while ((pet.getLoveBar() > 0 && pet.getHunger() > 0 && pet.getEnergy() > 0 && pet.getFun() > 0 && pet.getHygiene() > 0)) {
            System.out.println("[1] Feed\n[2] Play\n[3] Bath\n[4] Rest\n[5] Pet\n[6] Change name");
            System.out.print("What do you want to do? ");
            int action = scan.nextInt();

            // if player puts invalid input, loop until the player puts a valid input
            while (action <= 0 || action > 6) {
                System.out.println("Invalid input.");
                System.out.println("[1] Feed\n[2] Play\n[3] Bath\n[4] Rest\n[5] Pet");
                System.out.println("What do you want to do? ");
                action = scan.nextInt();
            }
            scan.nextLine(); // so it doesn't skip the next scan.nextLine

            // action to increase the necessities
            if (action == 1) {
                pet.feed();
            } else if (action == 2) {
                pet.play();
            } else if (action == 3) {
                pet.bath();
            } else if (action == 4) {
                pet.rest();
            } else if (action == 5) {
                pet.pet();
            } else if (action == 6) {
                System.out.print("Enter a new name for your pet: ");
                String newName = scan.nextLine();
                pet.setName(newName);
            }


            pet.printPet(); // print out what the pet looks like in ASCII art
            System.out.println(CYAN + "---------------------------");
            System.out.println(pet.toString()); // print out the information about the pet object
            System.out.println("---------------------------" + RESET);


            // check if the player wins or loses
            if (pet.getLoveBar() <= 0 || pet.getHunger() <= 0 || pet.getEnergy() <= 0 || pet.getFun() <= 0 || pet.getHygiene() <= 0) {
                break;
            } else if (pet.getLoveBar() >= 75 && pet.getHunger() >= 75 && pet.getEnergy() >= 75 && pet.getFun() >= 75 && pet.getHygiene() >= 75) {
                System.out.println("You took care of " + pet.getName() + " extremely well.");
                win = true;
                break;
            }

            System.out.println();
            System.out.println(RED + "Generating a random event..." + RESET);


            // an InterruptedException will occur with sleep method
            try {
                Thread.sleep(5000); // wait for 5 seconds
            } catch (InterruptedException error) {
                error.printStackTrace(); // fix the error
            }

            // a random event will happen, and it will increase/decrease the necessities
            pet.randomEvent();

            pet.printPet(); // print out what the pet looks like in ASCII art
            System.out.println(CYAN + "---------------------------");
            System.out.println(pet.toString()); // print out the information about the pet object
            System.out.println("---------------------------" + RESET);


            // check if the player wins
            if (pet.getLoveBar() >= 75 && pet.getHunger() >= 75 && pet.getEnergy() >= 75 && pet.getFun() >= 75 && pet.getHygiene() >= 75) {
                System.out.println("You took care of " + pet.getName() + " extremely well.");
                win = true;
                break;
            }

        }


        if (win == false) {
            if (pet.getLoveBar() <= 0) {
                System.out.println(RED + pet.getName() + " doesn't like you, so it ran away from home, searching for a better owner." + RESET);
            } else if (pet.getHunger() <= 0) {
                System.out.println(RED + pet.getName() + " died due to starvation... \uD83E\uDEA6" + RESET);
            } else if (pet.getEnergy() <= 0) {
                System.out.println(RED + pet.getName() + " died due to exhaustion... \uD83E\uDEA6" + RESET);
            } else if (pet.getFun() <= 0) {
                System.out.println(RED + pet.getName() + " thinks you're boring, so it ran away." + RESET);
            } else if (pet.getHygiene() <= 0) {
                System.out.println(RED + pet.getName() + " died due to a disease... \uD83E\uDEA6" + RESET);
            }
        } else {
            System.out.println(GREEN + "You won the game!" + RESET);
        }

    }
}

