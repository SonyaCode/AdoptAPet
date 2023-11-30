import java.util.Scanner;

public class AdoptAPet {
    // instance variables
    private String name;
    private int typeOfPet;
    private int loveBar;
    private int hunger;
    private int energy;
    private int fun;
    private int hygiene;



    // constructors
    public AdoptAPet(String name, int typeOfPet) {
        this.name = name;
        this.typeOfPet = typeOfPet;
        loveBar = 10;
        hunger = 25;
        energy = 25;
        fun = 25;
        hygiene = 25;
    }


    // randomly choose a pet for player and default name "Max"
    public AdoptAPet() {
        name = "Max";
        typeOfPet = (int) (Math.random() * 10) + 1;
        loveBar = 10;
        hunger = 25;
        energy = 25;
        fun = 25;
        hygiene = 25;
    }


    public void feed() {
        hunger += 30;
        loveBar += 5;
        hygiene -= 10;
    }

    public void play() {
        fun += 20;
        energy -= 10;
        hunger -= 5;
        hygiene -= 15;
        loveBar += 10;
    }

    public void rest() {
        energy += 30;
        hunger -= 5;
    }

    public void bath() {
        hygiene += 50;
        fun -= 20;
        loveBar += 5;
    }

    public void pet() {
        loveBar += 5;
    }



    // getter methods
    public String getName() {
        return name;
    }


    public String getTypeOfPet() {
        if (typeOfPet == 1) {
            return "Dog";
        } else if (typeOfPet == 2) { // cat
            return "Cat";
        } else if (typeOfPet == 3) { // bunny
            return "Bunny";
        } else if (typeOfPet == 4) { // bird
            return "Bird";
        } else if (typeOfPet == 5) { // ducky
            return "Duck";
        } else if (typeOfPet == 6) { // goldfish
            return "Goldfish";
        } else if (typeOfPet == 7) { // dolphin
            return "Dolphin";
        } else if (typeOfPet == 8) { // panda
            return "Panda";
        } else if (typeOfPet == 9) {
            return "Deer";
        } else {
            return "Frog";
        }

    }



    public int getLoveBar() {
        return loveBar;
    }


    public int getHunger() {
        return hunger;
    }


    public int getEnergy() {
        return energy;
    }


    public int getFun() {
        return fun;
    }


    public int getHygiene() {
        return hygiene;
    }



    // change name
    public void setName(String newName) {
        name = newName;
    }


    public String loveBarAsHeart() {
        // 81 - 100 -> 5 hearts
        if (loveBar >= 81) {
            return "❤\uFE0F❤\uFE0F❤\uFE0F❤\uFE0F❤\uFE0F";

            // 61 - 80 -> 4 hearts
        } else if (loveBar >= 61) {
            return "❤\uFE0F❤\uFE0F❤\uFE0F❤\uFE0F\uD83E\uDE76";

            // 41 - 60 -> 3 hearts
        } else if (loveBar >= 41) {
            return "❤\uFE0F❤\uFE0F❤\uFE0F\uD83E\uDE76\uD83E\uDE76";

            // 21 - 40 -> 2 hearts
        } else if (loveBar >= 21) {
            return "❤\uFE0F❤\uFE0F\uD83E\uDE76\uD83E\uDE76\uD83E\uDE76";

            // 1 - 20 -> 1 heart
        } else if (loveBar >= 1) {
            return "❤\uFE0F\uD83E\uDE76\uD83E\uDE76\uD83E\uDE76\uD83E\uDE76";

            // 0 -> no heart
        } else {
            return "\uD83E\uDE76\uD83E\uDE76\uD83E\uDE76\uD83E\uDE76\uD83E\uDE76";
        }
    }


    public String toString() {
        String decoration = "---------------------------";
        String returnName = name + "'s Necessities";
        String returnType = "Type: " + getTypeOfPet();
        String returnHunger = "Hunger: " + hunger + "%";
        String returnEnergy = "Energy: " + energy + "%";
        String returnFun = "Fun: " + fun + "%";
        String returnHygiene = "Hygiene: " + hygiene + "%";
        String returnLoveBar = "Love bar: " + loveBarAsHeart() + " (" + loveBar + "%)";
        return returnName + "\n" + returnType + "\n" + returnHunger + "\n" + returnEnergy + "\n" + returnFun + "\n" + returnHygiene + "\n" + returnLoveBar;
    }



    public void printPet() {
        // color palette for the pets
        final String YELLOW = "\u001B[33m";
        final String BLUE =  "\u001B[34m";
        final String GREEN = "\u001B[32m";
        final String BLACK = "\u001B[30m";
        final String WHITE_BG = "\u001B[47m";
        final String RESET = "\u001B[0m";


        // print out different animal depending on the typeOfPet
        if (typeOfPet == 1) { // dog
            System.out.println(YELLOW + "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣀⣤⣤⣤⣤⣤⣤⣤⣤⣀⣀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⣀⣀⣠⣴⠾⠛⠉⠉⠉⠀⠀⠀⠀⠀⠉⠉⠉⠛⠷⣶⣼⣿⣉⣁⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⣠⡾⠛⠉⠛⠟⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⡏⠉⠙⠛⢶⣄⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⢠⣾⠟⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠰⣿⣧⠀⠀⠀⠀\n" +
                    "⠀⠀⢠⣿⠃⠀⠀⠀⠀⠀⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⠀⠀⠀⠈⢿⡇⠀⠀⠀\n" +
                    "⠀⠀⠹⣿⡎⠀⠀⠀⣠⡾⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⠀⠀⠀⠀⠀⢻⡆⠀⠀⣆⣿⡇⠀⠀⠀\n" +
                    "⠀⠀⠀⣿⡀⠀⡀⠀⣿⠁⠀⢠⣾⣿⡿⠆⠀⠀⠀⠀⠀⠀⢀⣾⣿⡿⠆⠀⠀⠀⢈⣿⠀⣄⣾⡿⠁⠀⠀⠀\n" +
                    "⠀⠀⠀⠘⣿⣧⣇⢀⣇⠀⠀⠘⣿⣿⣷⡆⠀⠀⠀⠀⠀⠀⠈⢿⣿⣷⠖⠀⠀⠀⢸⣿⣷⠿⠋⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠉⠙⠻⣿⣆⡀⠀⠀⠉⠉⠀⠀⠀⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠠⣸⣿⠁⣀⣀⣀⠀⠀⠀⠀\n" +
                    "⠀⢀⣠⡶⠾⠛⠓⠶⣿⡟⠀⠀⠀⠀⠀⠀⠠⣾⣿⣿⣦⠀⠀⠀⠀⠀⠀⠀⠀⠀⢻⣿⠟⠋⠉⠛⠻⣦⡀⠀\n" +
                    "⢀⣾⠋⠀⠀⠀⠀⠀⠘⣿⣠⣄⡀⠀⠀⠀⠀⠛⠿⠟⠁⠀⠀⠀⠀⠀⡀⡀⠀⣴⣾⡏⠀⠀⠀⠀⠀⠈⣿⡄\n" +
                    "⢸⣯⠀⢠⠀⠀⢀⣄⣠⣿⠿⢿⣷⣤⣦⣀⣤⣤⣤⣤⣀⣀⣀⣼⣆⣼⣷⣿⡾⠿⢿⣧⣀⣦⠀⠀⣤⠀⣸⡧\n" +
                    "⠘⠿⣷⣾⣷⣤⠾⠿⠛⠁⠀⠀⠀⠁⠀⠉⠉⠀⠀⠀⠈⠉⠉⠉⠉⠉⠁⠀⠀⠀⠀⠉⠛⠻⠷⠾⠿⠟⠛⠁\n" + RESET);


        } else if (typeOfPet == 2) { // cat
            System.out.println(YELLOW + "    /\\_____/\\\n" +
                    "   /  o   o  \\\n" +
                    "  ( ==  ^  == )\n" +
                    "   )         (\n" +
                    "  (           )\n" +
                    " ( (  )   (  ) )\n" +
                    "(__(__)___(__)__)\n" + RESET);


        } else if (typeOfPet == 3) { // bunny
            System.out.println("⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡤⢤⡀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⢠⡤⣀⣀⠀⠀⠀⠀⢸⠁⠀⠱⡄⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⢇⠀⠈⠉⠲⢄⠀⠘⡆⠀⠀⢹⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠈⠳⣄⠀⠀⠀⠙⢦⣣⠀⠀⠀⡇⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠑⢤⡀⠀⠀⠙⠆⠀⠀⠳⠤⣀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⣀⡤⠤⠤⠤⠤⣉⢲⡄⠀⠀⠀⠀⠀⠀⡈⠳⡀\n" +
                    "⠀⡔⠒⢤⡠⠊⠁⠀⠀⠀⠀⠀⠀⠙⠀⠀⠀⠀⠀⠀⠸⠿⠀ ⢱\n" +
                    "⠈⡇⠀⠀⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀  ⢸\n" +
                    "⠀⠘⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ ⣠⠃\n" +
                    "⠀⠀⠈⣳⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠤⣤⠤⠴⠊⠁⠀\n" +
                    "⢠⠖⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡀⠀⠀⠀⠀⠈⠑⡆⠀⠀⠀\n" +
                    "⠸⣄⠀⠀⣀⠤⠒⠢⠤⠤⠤⠖⠊⠉⠑⠢⢄⣀⣀⣀⠇⠀⠀⠀\n" +
                    "⠀⠈⠉⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n");


        } else if (typeOfPet == 4) { // bird
            System.out.println(YELLOW + "⠀⠀⠀⠀⠀⠀⢀⣠⠴⠒⠒⠒⠒⠒⠶⠦⠤⠴⠒⠚⠉⣰⠟⠁⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⢀⡞⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠒⡿⠃⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⢠⡿⣤⣄⠀⠀⠀⠀⠀⢀⣤⣄⠀⠀⠀⣰⠞⠁⠀⠀⠀⢠⣤⠀⠀⠀⠀\n" +
                    "⠀⠀⢠⡟⠸⣿⡿⢀⠤⢄⠀⠐⣷⣿⣿⡷⠀⠀⢻⠀⠀⠀⢀⡴⠋⠘⡇⠀⠀⠀\n" +
                    "⠀⠀⢸⠈⠲⡬⢠⡏⠀⢀⡷⠀⠨⣭⠭⠖⣇⠀⣾⠀⠀⡴⠋⠀⠀⠀⣧⠀⠀⠀\n" +
                    "⠀⠀⢸⣷⠞⠁⠀⠳⠖⠋⠀⠀⠀⠙⠶⠶⠃⡼⢿⣠⠎⠀⠀⠀⠀⠀⣿⠀⠀⠀\n" +
                    "⠀⠀⢸⣇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡾⠃⠀⠀⠀⠀⠀⠀⡟⠀⠀⠀\n" +
                    "⠀⠀⡼⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠹⡄⠀⠀⠀⠀⠀⢠⠃⠀⠀⠄\n" +
                    "⢀⣰⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠐⠉⠉⠉⠉⠲⢄⡀⢀⣠⡷⠀⠀⢠\n" +
                    "⢸⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠓⠧⠤⢾⢀⠏\n" +
                    "⢸⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢨⠏⠀\n" +
                    "⢸⠀⡆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⣇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⡏⠀⠀\n" +
                    "⠈⢷⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠢⡀⠀⠀⠀⠀⠀⠀⢀⣤⡏⠀⠀⠀\n" +
                    "⠀⠈⣧⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⠑⠲⠶⠶⠖⠊⠁⣴⠇⠀⠀⠀\n" +
                    "⠀⠀⠘⢧⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⣾⠁⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠈⠻⢦⣀⠀⠀⠀⠀⠀⠀⣠⣎⡀⡀⠀⠀⣀⣰⢶⠶⠚⠁⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⣰⠛⠉⡙⠛⢛⣷⠖⠒⢖⣾⠟⢛⠛⠺⣿⣏⠁\n" + RESET);


        } else if (typeOfPet == 5) { // ducky
            System.out.println("⬜⬜\uD83D\uDFE8\uD83D\uDFE8⬜\n" +
                    "⬜⬜\uD83D\uDFE8\uD83D\uDD33\uD83D\uDFE7\n" +
                    "\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE8⬜\n" +
                    "\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE8\uD83D\uDFE8⬜\n" +
                    "⬜\uD83D\uDFE7\uD83D\uDFE7⬜⬜\n");


        } else if (typeOfPet == 6) { // goldfish
            System.out.println(BLUE +
                    "─▄▀░◌░░░░░░░▀▄\n" +
                    "▐░░◌░▄▀██▄█░░░▌\n" +
                    "▐░░░▀████▀▄░░░▌\n" +
                    "═▀▄▄▄▄▄▄▄▄▄▄▄▀═\n" + RESET);


        } else if (typeOfPet == 7) { // dolphin
            System.out.println(BLUE + "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⡴⠖⠛⠉⠉⣉⣽⠂⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣀⣀⣀⣴⡟⠁⠀⠀⠀⠀⣰⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⣀⡤⠶⠛⠋⠉⠉⠉⠉⠉⠉⠛⠶⣦⣄⡀⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⣠⠴⠋⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠛⢿⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⢀⡞⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⡠⢦⣀⠀⠀⠀⠀⣀⠀⠙⢷⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⡞⠀⠀⠀⢾⠆⠀⠀⠀⠀⡀⠀⠈⠀⠀⠈⠉⠉⢛⣩⡿⠇⠀⠀⠙⣷⡀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⢸⠀⠀⢀⣤⠞⠀⠀⠀⢀⠀⠓⠢⠤⠤⠴⠶⠖⠛⠋⠁⠀⠀⠀⠀⠀⠈⢿⡄⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⢸⣠⢔⡿⠁⠀⠀⢀⣰⡯⠀⠒⠒⡖⠒⠒⠒⠢⠤⣄⡀⠀⠀⠀⠀⠀⠀⠈⣷⡀⠀⠀⠀⠀⠀\n" +
                    "⢀⡞⢡⠎⠀⣀⡤⠞⠉⠈⢳⣄⠀⠀⠈⠢⣄⠀⠀⠀⠀⠉⠳⢦⡀⠀⠀⠀⠀⠸⣧⠀⠀⠀⠀⠀\n" +
                    "⢸⡴⢃⡴⠋⠁⠀⠀⠀⠀⠀⠙⠳⢤⣤⣀⣬⡽⠆⠀⠀⠀⠀⠀⠹⣦⠀⠀⠀⠀⣿⡀⠀⠀⠀⠀\n" +
                    "⠈⠛⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⢷⡄⠀⠀⢸⡇⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⣧⠀⠀⢸⡇⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢹⡆⠀⣼⠁⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣴⡾⠃⠀⠻⠷⣦⣄⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣰⠟⠁⠀⠀⠀⠀⠀⠈⠹⣷⡀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⢀⣠⣤⠶⠶⠶⢦⣤⣄⠸⣧\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⡟⠉⠀⠀⠀⠀⠀⠀⠙⢿⣿\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠻⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿\n" + RESET);


        } else if (typeOfPet == 8) { // panda
            System.out.println(BLACK + WHITE_BG +
                    "⠀⠀⠀⠀⢰⣿⡿⠗⠀⠠⠄⡀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⡜⠁⠀⠀⠀⠀⠀⠈⠑⢶⣶⡄\n" +
                    "⢀⣶⣦⣸⠀⢼⣟⡇⠀⠀⢀⣀⠀⠘⡿⠃\n" +
                    "⠀⢿⣿⣿⣄⠒⠀⠠⢶⡂⢫⣿⢇⢀⠃⠀\n" +
                    "⠀⠈⠻⣿⣿⣿⣶⣤⣀⣀⣀⣂⡠⠊⠀⠀\n" +
                    "⠀⠀⠀⠃⠀⠀⠉⠙⠛⠿⣿⣿⣧⠀⠀⠀\n" +
                    "⠀⠀⠘⡀⠀⠀⠀⠀⠀⠀⠘⣿⣿⡇⠀⠀\n" +
                    "⠀⠀⠀⣷⣄⡀⠀⠀⠀⢀⣴⡟⠿⠃⠀⠀\n" +
                    "⠀⠀⠀⢻⣿⣿⠉⠉⢹⣿⣿⠁⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠉⠁⠀⠀⠀⠉⠁⠀⠀\n" + RESET);


        } else if (typeOfPet == 9) { //deer
            System.out.println(YELLOW + "⠀⠀⢀⠞⠀⠀⠀⠀⠀⠀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⡌⡇⡀⠴⠖⠀⠀⠀⠙⡖⡀⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⢀⠡⠀⡔⠁⠀⠀⠀⠀⠀⢸⠙⡍⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⡏⢣⢕⡜⣄⡠⠤⢄⡀⢤⡣⠺⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⢡⠘⡄⠉⠀⠀⠀⠀⠀⠀⢀⣱⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠑⠫⠀⡎⡭⣢⠀⠀⣜⡗⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⡆⠱⣏⢻⡇⠀⣿⠇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⣅⠦⡀⠉⠑⣄⣻⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⢰⠁⠀⠈⢳⢦⡘⣦⣋⡠⠄⠒⠀⠀⠒⠒⠒⠒⠒⠀⠒⢄⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⡆⠀⠀⠀⢠⠂⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠑⠠⡀⠀\n" +
                    "⠀⠀⢈⡇⠀⠀⠀⠸⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠑⠄\n" +
                    "⠀⠀⠘⡰⠀⠀⠀⢂⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸\n" +
                    "⠀⡀⠤⠑⢣⠀⠀⠈⢆⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⠂\n" +
                    "⣏⠠⠤⣀⡀⢧⠤⠐⠈⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⠎⠀\n" +
                    "⠈⠉⠉⠀⠸⡅⠀⠀⠠⠤⣀⣀⣠⠔⠓⠒⠒⠒⠤⠤⠤⠄⠐⠀⠒⠒⠛⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠈⠉⠀⠉⠁⠀⠀\n" + RESET);


        } else if (typeOfPet == 10) { // frog
            System.out.println(GREEN + "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⣀⡤⠤⢶⢒⣚⣛⡛⠓⠲⢤⡀⠀⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⣴⣿⣛⣲⠶⠤⣤⡤⠖⠋⠉⣀⡤⠖⠋⠉⠉⠉⠉⠙⠶⡀⠙⣆⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⢀⣼⣿⣿⣿⣿⣿⢽⡆⠀⠀⣠⡴⠛⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠙⣆⠸⡆⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⣾⣿⣹⣿⣿⣿⣟⡾⠁⣠⠞⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⡆⣇⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⣿⠂⠙⠦⠼⠛⠋⠀⣾⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⡷⡟⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⢠⡟⠀⠀⠀⠀⠀⠀⠀⢿⡄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⡇⡇⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⢠⡟⠀⠀⠀⠀⠀⠀⠀⠀⠀⠹⣦⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡾⠁⢿⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⣠⡟⠀⠀⢠⣄⡀⠀⠀⠀⠀⠀⠀⠈⠙⠲⢤⣀⣀⣀⠀⠀⠀⣀⣀⣠⠶⠛⠁⠀⡟⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⣰⠿⠀⠀⣰⣾⠇⠉⠳⣄⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠉⠉⠉⠉⠉⠁⠀⠀⠀⠀⣼⢁⣤⣦⡀⠀⠀\n" +
                    "⠀⠀⣰⠃⠀⠀⠐⠿⢿⣄⣀⠀⠈⠇⠀⠀⠀⠀⠀⠀⠀⢀⣀⡤⠤⠶⠒⠒⠒⠲⠤⣄⣸⡿⠋⢛⣿⣷⠀⠀\n" +
                    "⠀⣸⠃⠀⠀⠀⠀⠀⠀⠀⠈⠙⠀⠀⠀⠀⠀⢀⣠⠴⠚⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠻⣧⠴⠚⠉⠁⠀⠀\n" +
                    "⣸⠃⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢀⡴⠋⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠘⢦⡀⠀⠀⠀⠀\n" +
                    "⠇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣴⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠹⡄⠀⠀⠀\n" +
                    "⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣼⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠸⡄⠀⠀\n" +
                    "⣇⠀⠀⠀⠀⠀⠋⠉⠉⠉⠓⠦⣞⠁⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣿⠀⠀\n" +
                    "⠘⣇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠈⢳⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣸⠀⠀\n" +
                    "⠀⠈⢷⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢳⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⡟⠋⠉\n" +
                    "⠀⠀⠀⠉⠳⣄⠀⠀⠀⠀⠀⠀⠀⠀⠈⠧⣤⣀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣠⣶⣋⣀⣀⡤\n" +
                    "⠀⠀⠀⠀⠀⠀⠙⠒⠦⣄⣀⡀⠀⠀⠀⠀⢠⣿⡛⠒⠲⠦⠤⠤⠤⠤⠤⠶⠒⠒⠒⠊⠉⠁⠀⠀⠀⠀⠀⠀\n" +
                    "⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠉⠉⠉⠉⠉⠉⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀\n" + RESET);
        }


    }



    public void randomEvent() {
        // random number from 1 to 10
        // each number represent a specific event
        Scanner scan = new Scanner(System.in);
        int randomNum = (int) (Math.random() * 11) + 1;
        if (randomNum == 1) {
            System.out.println("Your friend visited your house. Your friend played with " + name + ".");
            System.out.println("Fun increased by 5%.");
            fun += 5;
        } else if (randomNum == 2) {
            System.out.println(name + " saw a cockroach on the wall. It tried to catch it.");
            System.out.println("Fun increased by 10%. Hygiene decreased by 10%.");
            fun += 10;
            hygiene -= 10;
        } else if (randomNum == 3) {
            System.out.println(name + " tried to get on the shelf and it fell.");
            System.out.println("Energy decreased by 5%. Fun decreased by 5%. Hygiene decreased by 5%.");
            energy -= 5;
            fun -= 5;
            hygiene -= 5;
        } else if (randomNum == 4) {
            System.out.println("You went on a walk with " + name);
            System.out.println("Fun increased by 20%. Hygiene decreased by 15%. Energy decreased by 20%. Love bar increased by 10%.");
            fun += 20;
            hygiene -= 15;
            energy -= 20;
            loveBar += 10;
        } else if (randomNum == 5) {
            System.out.println(name + " broke your keyboard.");
            fun += 10;
            System.out.println("What will you do?\n[1] Scold " + name + "\n[2] Forgive " + name);
            int playerAction = scan.nextInt();

            if (playerAction == 1) {
                System.out.println(name + " gets upset with you!\nLove bar decreases by 10%.");
                loveBar -= 10;
            } else {
                System.out.println(name + " is happy!\nLove bar increases by 3%.");
                loveBar += 3;
            }

        } else if (randomNum == 6) {
            System.out.print("Say something to your pet: ");
            String playerDialogue = scan.nextLine();
            playerDialogue = playerDialogue.toLowerCase();

            if (playerDialogue.indexOf(name.toLowerCase()) != -1) {
                System.out.println("You called " + name + "'s name. Love bar increases by 5%.");
                loveBar += 5;
            }
            if (typeOfPet == 1 && playerDialogue.indexOf("woof") != -1) {
                System.out.println(name + " appreciates your attempt to speak in dog language.\nLove bar increases by 2%.");
                loveBar += 2;
            } else if (typeOfPet == 2 && playerDialogue.indexOf("meow") != -1) {
                System.out.println(name + " appreciates your attempt to speak in cat language.\nLove bar increases by 2%.");
                loveBar += 2;
            } else if (typeOfPet == 4 && playerDialogue.indexOf("chirp") != -1) {
                System.out.println(name + " appreciates your attempt to speak in bird language.\nLove bar increases by 2%.");
                loveBar += 2;
            } else if (typeOfPet == 5 && playerDialogue.indexOf("quack") != -1) {
                System.out.println(name + " appreciates your attempt to speak in duck language.\nLove bar increases by 2%.");
                loveBar += 2;
            } else if (typeOfPet == 6 && playerDialogue.indexOf("blub") != -1) {
                System.out.println(name + " appreciates your attempt to speak in goldfish language.\nLove bar increases by 2%.");
                loveBar += 2;
            } else if (typeOfPet == 10 && playerDialogue.indexOf("ribbit") != -1) {
                System.out.println(name + " appreciates your attempt to speak in frog language.\nLove bar increases by 2%.");
                loveBar += 2;
            } else {
                if (playerDialogue.length() > 20) {
                    System.out.println(name + " thinks you are annoying.\nLove bar decreases by 2%.");
                    loveBar -= 5;
                }
            }

        } else if (randomNum == 7) {
            System.out.println("Your music was too loud. " + name + " didn't like it.\nLove bar decreased by 5%.");
            loveBar -= 5;
        } else if (randomNum == 8) {
            System.out.println(name + " became sick.");
            System.out.println("Hunger decreased by 5%. Energy decreased by 10%. Fun decreased by 5%. Hygiene decreased by 15%.");
            hunger -= 5;
            energy -= 10;
            fun -= 5;
            hygiene -= 15;
        } else if (randomNum == 9) {
            System.out.println(name + " stole your food!");
            System.out.println("Hunger increased by 10%. Fun increased by 5%. Energy decreased by 5%.");
            hunger += 10;
            fun += 5;
            energy -= 5;
        } else if (randomNum == 10) {
            System.out.println(name + " played with your slippers and made a hole on it.");
            System.out.println("Fun increased by 15%. Energy decreased by 5%. Hygiene decreased by 3%.");
            fun += 15;
            energy -= 5;
            hygiene -= 3;
        } else {
            System.out.println("Nothing happened.");
        }

    }

}
