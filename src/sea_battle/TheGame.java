package sea_battle;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class TheGame {
    public static void main(String[] args){
        Player playerOne = new Player();
        Player robotOne = new Player();
        System.out.println("Здравствуйте, для старта введите свое имя:");
        Scanner scanner = new Scanner(System.in);
        robotOne.setName("Робот");
        playerOne.setName(scanner.nextLine());
        System.out.println("Отлично, " + playerOne.getName() + " теперь мы можем приступать!");
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException ie) {
            Thread.currentThread().interrupt();
        }
        Area playerArea = new Area();
        Area robotArea = new Area();
        robotArea.createOwnerArea();
        playerArea.createOwnerArea();

        System.out.println("Ниже представленны два поля, вверхнее- ваше, нижнее- робота.");
        System.out.println(playerOne.getName());
        playerArea.showOwnerArea();
        System.out.println(robotOne.getName());
        robotArea.showOwnerArea();

        playerArea.setOwnerArea(playerArea.setShip(1,1,1, 3, playerArea.getOwnerArea()));
        playerArea.showOwnerArea();
    }
}
