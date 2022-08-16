import java.util.Scanner;

class Screens {
    void IntroScreen() {
        System.out.println("The Last Of Us is a Zombie game where you are the last person alive\n" +
                "trying to survive the zombie outbreak, which includes Runners,\n" +
                "Clickers, and Bloaters.\n");
        System.out.println("*Hint* try to get as much health packs (+) as you can before the zombies\n" +
                " attack and watch out for Bloaters (B) they are slow but deadly!");
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        System.out.println("        ######## THE LAST OF US... ########");
        System.out.println("                      .....");
        System.out.println("                     C C  /");
        System.out.println("                    /<   /");
        System.out.println("     ___ __________/_#__=o");
        System.out.println("    /(- /(\\_\\________    \\");
        System.out.println("    \\ ) \\ )_      \\o      \\");
        System.out.println("    /|\\ /|\\       |'      |");
        System.out.println("                  |      _|");
        System.out.println("                  /o    __\\");
        System.out.println("                 / '     |");
        System.out.println("                / /      |");
        System.out.println("               /_/\\______|");
        System.out.println("              (   _(    <");
        System.out.println("               \\    \\    \\");
        System.out.println("                \\    \\    |");
        System.out.println("                 \\____\\____\\");
        System.out.println("                  ____\\_\\__\\_\\");
        System.out.println("                 /`   /`     o\\");
        System.out.println("                |___ |________|..");
        System.out.println();
        System.out.println();
        System.out.println("Press <Enter> IF YOU DARE...");
        scanner.nextLine();
    }
    void WinningScreen() {
        System.out.println("CONGRATULATIONS!");
        System.out.println();
        System.out.println("|\\     /|(  ___  )|\\   /|  (  ____ \\|\\    /| ( ____ )|\\    /|\\__   __/|\\     /|(  ____ \\(  __  \\ ( ) ");
        System.out.println("( \\   / )| (   ) || )  ( |  | (    \\/| )  ( || (    )|| )   ( |   ) (   | )   ( || (    \\/| (  \\  ) | |   ");
        System.out.println("\\ (_) / | |   | || |   | |  | (_____ | |   | || (____)|| |   | |   | |   | |   | || (__    | |   ) || |       ");
        System.out.println(" \\   /  | |   | || |   | |  (_____  )| |   | ||     __)( (   ) )   | |   ( (   ) )|  __)   | |   | || |       ");
        System.out.println("   ) (   | |   | || |   | |        ) || |   | || ( \\ (    \\ \\_/ /    | |    \\ \\_/ / | (      | |   ) |(_)  ");
        System.out.println("   | |   | (___) || (___) | /\\____) || (___) || )  \\ \\__  \\   /  ___) (___  \\   /  | (____/\\| (__/  ) _  ");
        System.out.println("  \\_/   (_______)(_______)  \\_______)(_______)|/   \\__/    \\_/   \\_______/   \\_/   (_______/(______/ (_) ");

    }
    void LosingScreen() {

        System.out.println(" .----------------.  .----------------.  .----------------.  .----------------.   .----------------.  .----------------.  .----------------.  .----------------.");
        System.out.println("| .--------------. || .--------------. || .--------------. || .--------------. | | .--------------. || .--------------. || .--------------. || .--------------. |");
        System.out.println("| |    ______    | || |      __      | || | ____    ____ | || |  _________   | | | |     ____     | || | ____   ____  | || |  _________   | || |  _______     | |");
        System.out.println("| |  .' ___  |   | || |     /  \\     | || ||_   \\  /   _|| || | |_   ___  |  | | | |   .'    `.   | || ||_  _| |_  _| | || | |_   ___  |  | || | |_   __ \\    | |");
        System.out.println("| | \\ `.___]  _| | || | _/ /    \\ \\_ | || | _| |_\\/_| |_ | || |  _| |___/ |  | | | |  \\  `--'  /  | || |    \\ ' /     | || |  _| |___/ |  | || |  _| | \\ \\_  | |");
        System.out.println("| |  `._____.'   | || ||____|  |____|| || ||_____||_____|| || | |_________|  | | | |   `.____.'   | || |     \\_/      | || | |_________|  | || | |____| |___| | |");
        System.out.println("| |              | || |              | || |              | || |              | | | |              | || |              | || |              | || |              | |");
        System.out.println("| '--------------' || '--------------' || '--------------' || '--------------' | | '--------------' || '--------------' || '--------------' || '--------------' |");
        System.out.println("'----------------'  '----------------'  '----------------'  '----------------'   '----------------'  '----------------'  '----------------'  '----------------'");

    }
}
