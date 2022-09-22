package sea_battle;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;
public class TheGame {
    public static void main(String[] args){
        System.out.println("Welcome to Sea Battle\nEnter your name:");
        Scanner input = new Scanner(System.in);
        Player playerOne = new Player();
        playerOne.setName(input.nextLine());
        System.out.println("Hello, " + playerOne.getName() + ", enter \"Rules\" to read them, if not necessary, leave the input field blank.");
        Rules.printRules(input.nextLine());
        playerOne.generatePlayerArea();
        playerOne.initAmountOfShips();
//        System.out.println(playerOne.getAmountOfShips());
        playerOne.feelPlayerArea();
        playerOne.showPlayerArea(playerOne.playerArea);
    }
}
//    Exception in thread "main" java.lang.NullPointerException: Cannot invoke "java.lang.Integer.intValue()" because the return value of "java.util.HashMap.get(Object)" is null
