/*
Raymean Burns 05/12/21
Zombie game that outputs player and enemies.
 */

import java.util.*;

public class game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Screens screen = new Screens();
        screen.IntroScreen();



        Player Z = new Player('Z', "Ray");
        ArrayList<Enemy> Enemies = new ArrayList<>();
        Enemies.add(new Enemy("Runner"));
        Enemies.add(new Enemy("Runner"));
        Enemies.add(new Enemy("Runner"));
        Enemies.add(new Enemy("Runner"));
        Enemies.add(new Enemy("Runner"));
        Enemies.add(new Enemy("Runner"));
        Enemies.add(new Enemy("Runner"));
        Enemies.add(new Enemy("Runner"));
        Enemies.add(new Enemy("Runner"));
        Enemies.add(new Enemy("Runner"));
        Enemies.add(new Enemy("Runner"));
        Enemies.add(new Enemy("Runner"));
        Enemies.add(new Enemy("Clicker"));
        Enemies.add(new Enemy("Clicker"));
        Enemies.add(new Enemy("Clicker"));
        Enemies.add(new Enemy("Clicker"));
        Enemies.add(new Enemy("Clicker"));
        Enemies.add(new Enemy("Bloater"));
        Enemies.add(new Enemy("Bloater"));

        String Message = "";
        String Choice = "";
        while(!Choice.equals("q") && Z.hp > 0 && Enemies.size() >0) {
            Z.PrintWorld();
            System.out.println(Z.name + " HP = " + Z.hp + " Attack = " + Z.attack + " Message = " + Message);
            Message = "";
            System.out.println("Move=asdw   Quit=q  Enter command: ");
            Choice = scanner.nextLine();
            if (Choice.equals("d") || Choice.equals("D"))
                Z.moveRight();
            if (Choice.equals("w") || Choice.equals("W"))
                Z.moveUp();
            if (Choice.equals("s") || Choice.equals("S"))
                Z.moveDown();
            if (Choice.equals("a") || Choice.equals("A"))
                Z.moveLeft();

            for (int i=0; i<Enemies.size(); i++) {
                if ((Enemies.get(i).yPos == Z.yPos && (Enemies.get(i).xPos == Z.xPos+1)) || // player is to the left
                    (Enemies.get(i).yPos == Z.yPos && (Enemies.get(i).xPos == Z.xPos-1)) ||  // player is to the right
                    (Enemies.get(i).xPos == Z.xPos && (Enemies.get(i).yPos == Z.yPos+1)) ||  // player is above
                    (Enemies.get(i).xPos == Z.xPos && (Enemies.get(i).yPos == Z.yPos-1)))    // player is below
                {
                    Message += "You are being attacked by a " + Enemies.get(i).type + "... RUN! ";
                    Enemies.get(i).hp -= Z.attack;    // Player attacks Enemy
                    Z.hp -= Enemies.get(i).attack;    // Enemy attacks Player

                    if (Enemies.get(i).hp <= 0) { // Enemy dies
                        Z.World[Enemies.get(i).xPos][Enemies.get(i).yPos] = ' ';
                        Enemies.remove(i);
                    }
                }
            }
            for (int i=0; i<Enemies.size(); i++) {
                if (Math.abs(Enemies.get(i).xPos - Z.xPos) <= Enemies.get(i).range &&
                    Math.abs(Enemies.get(i).yPos - Z.yPos) <= Enemies.get(i).range) {
                    if (Enemies.get(i).xPos > Z.xPos)
                        Enemies.get(i).moveLeft();
                    else
                        Enemies.get(i).moveRight();
                    if (Enemies.get(i).yPos > Z.yPos)
                        Enemies.get(i).moveUp();
                    else
                        Enemies.get(i).moveDown();
                    }
                    else {
                        int R = (int)(Math.random() * 4) + 1;
                        if (R == 1)
                            Enemies.get(i).moveUp();
                        if (R == 2)
                            Enemies.get(i).moveDown();
                        if (R == 3)
                            Enemies.get(i).moveLeft();
                        else Enemies.get(i).moveRight();
                    }
                }
        } // End game loop
            if (Z.hp <=0) {
                screen.LosingScreen();
            }
            else if (Enemies.size() == 0) {
                screen.WinningScreen();
            }
    } // End main
}
