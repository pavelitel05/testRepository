package sea_battle;

import lombok.Getter;

import java.util.HashMap;

public class Ships extends Rules{
    public int[][] setShip(int verticalId, int x, int y, int size, int[][] selfArea){
        x -= 1;
        y -= 1;
        if(verticalId == 0){
            for (int i = 0; i < size; i++){
                selfArea[y][x + i] = 1;
            }
        } else if (verticalId == 1) {
            for (int i = 0; i < size; i++) {
                selfArea[y + i][x] = 1;
            }
        }
        return selfArea;
        }
    @Getter
    protected HashMap<Integer, Integer> amountOfShips = new HashMap<>();
    public void initAmountOfShips(){
        this.amountOfShips.put(1, 4);
        this.amountOfShips.put(2, 3);
        this.amountOfShips.put(3, 2);
        this.amountOfShips.put(4, 1);
    }

    public void refactorAmountOfShips(int key, int value) {
        this.amountOfShips.put(key, amountOfShips.get(key) + value);
    }
}
