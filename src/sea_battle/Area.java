package sea_battle;

import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.concurrent.ThreadLocalRandom;
public class Area extends Rules{
    protected int[][] playerArea = new int[12][12];
    @Getter
    private HashMap<Integer, Integer> amountOfShips = new HashMap<>();
    public void initAmountOfShips(){
        this.amountOfShips.put(1, 4);
        this.amountOfShips.put(2, 3);
        this.amountOfShips.put(3, 2);
        this.amountOfShips.put(4, 1);
    }
    public void generatePlayerArea(){
//      Заполняю нулями
        for(int y = 1; y < 11; y++){
            for(int x = 1; x < 11; x++) {
                this.playerArea[y][x] = 0;
            }
        }
//        Заполняю границу
        for(int x = 0; x < 12; x++){
            this.playerArea[0][x] = x;
        }
        for(int x = 0; x < 12; x++){
            this.playerArea[11][x] = x;
        }
        for(int x = 0; x < 12; x++){
            this.playerArea[x][0] = x;
        }
        for(int x = 0; x < 12; x++){
            this.playerArea[x][11] = x;
        }
//        Заполняю углы
        this.playerArea[0][0] = 5;
        this.playerArea[0][11] = 5;
        this.playerArea[11][0] = 5;
        this.playerArea[11][11] = 5;
        this.playerArea[0][10] = 0;
        this.playerArea[10][0] = 0;
        this.playerArea[11][10] = 0;
        this.playerArea[10][11] = 0;
    }
    public void feelPlayerArea() {
        int verticalId = ThreadLocalRandom.current().nextInt(0, 2);
        int size = ThreadLocalRandom.current().nextInt(1, 5);
        for (int y = 1; y < 11; y++) {
            for (int x = 1; x < 11; x++) {
                if (canSet(this.playerArea, x, y, verticalId, size) & this.amountOfShips.get(size) != 0) {
                    if (verticalId == 0) {
                        for (int cord = 0; cord < size; cord++) {
                            this.playerArea[y][x + cord] = 1;
                        }
                    } else {
                        for (int cord = 0; cord < size; cord++) {
                            this.playerArea[y + cord][x] = 1;
                        }
                    }
                    this.amountOfShips.put(size, this.amountOfShips.get(size) - 1);
                }
                verticalId = ThreadLocalRandom.current().nextInt(0, 2);
                size = ThreadLocalRandom.current().nextInt(1, 5);
            }
        }
    if(this.amountOfShips.get(1) + this.amountOfShips.get(2) + this.amountOfShips.get(3) + this.amountOfShips.get(4) != 0){
        feelPlayerArea();
    }
    }
    public void showPlayerArea(int[][] playerArea){
        for(int y = 0; y < 12; y ++){
            for(int x = 0; x < 12; x ++){
                System.out.print(playerArea[y][x]);
                System.out.print("  ");
            }
            System.out.println();
        }
    }
}
