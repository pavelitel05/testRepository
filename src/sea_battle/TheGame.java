package sea_battle;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class TheGame {
    public static void main(String[] args){
        Players player_1 = new Players();
        Players robot_1 = new Players();
        System.out.println("Здравствуйте, для старта введите свое имя:");
        Scanner scanner = new Scanner(System.in);
        robot_1.setName("Робот");
        player_1.setName(scanner.nextLine());
        System.out.println("Отлично, " + player_1.getName() + " теперь мы можем приступать!");
        try {
            TimeUncdit.SECONDS.sleep(2);
        } catch (InterruptedException ie) {
            Thread.currentThread().interrupt();
        }

        Areas playerArea = new Areas();
        Areas robotArea = new Areas();
        robotArea.createOwnerArea();
        playerArea.createOwnerArea();

        System.out.println("Ниже представленны два поля, вверхнее- ваше, нижнее- робота.");
        System.out.println(player_1.getName());
        playerArea.showOwnerArea();
        System.out.println("");
        System.out.println(robot_1.getName());
        robotArea.showOwnerArea();
    }
}
