package sea_battle;

import lombok.Getter;
import lombok.Setter;
import java.util.Scanner;

public class Player extends Area{
    @Getter
    @Setter
    private String name;
    Scanner input = new Scanner(System.in);
    public void turn(String xy){
        int x = Character.digit(xy.charAt(0), 10);
        int y = Character.digit(xy.charAt(1), 10);
        if(this.playerArea[y][x] == 1){
            this.currentPlayerArea[y][x] = 1;
            this.setDestroyedParts(this.getDestroyedParts() - 1);
            showPlayerArea(this.currentPlayerArea);
            System.out.println("One more shot!");
            turn(input.nextLine());
        }else{
            this.currentPlayerArea[y][x] = 3;
            showPlayerArea(this.currentPlayerArea);
            System.out.println("Miss, another Player's turn");
        }

    }
}
