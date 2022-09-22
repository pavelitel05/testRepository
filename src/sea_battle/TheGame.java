package sea_battle;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;
public class TheGame {
    public static void main(String[] args){
        System.out.println("Welcome to Sea Battle\nEnter first player name:");
        Scanner input = new Scanner(System.in);
        Player playerOne = new Player();
        Player playerTwo = new Player();
        playerOne.setName(input.nextLine());
        System.out.println("Enter second player name:");
        playerTwo.setName(input.nextLine());
        System.out.println("Hello, " + playerOne.getName() + " and " + playerTwo.getName() + ", enter \"Rules\" to read them, if not necessary, leave the input field blank.");
        Rules.printRules(input.nextLine());
//        player_1
        playerOne.generatePlayerArea();
        playerOne.generateCurrentPlayerArea();
        playerOne.initAmountOfShips();
        playerOne.feelPlayerArea();
//        player_2
        playerTwo.generatePlayerArea();
        playerTwo.generateCurrentPlayerArea();
        playerTwo.initAmountOfShips();
        playerTwo.feelPlayerArea();
        System.out.println("Were generated areas for both players");
        System.out.println(playerOne.getName() + " your turn");
        while(playerOne.getDestroyedParts() != 0 | playerTwo.getDestroyedParts() != 0){
            playerOne.turn(input.nextLine());
            playerTwo.turn(input.nextLine());
        }
    }
}
