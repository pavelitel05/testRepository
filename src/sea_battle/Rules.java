package sea_battle;

import lombok.Getter;

import java.util.HashMap;

public class Rules {
    public boolean isNear(int x, int y, int size, int verticalId, int[][] selfArea) {
        x -= 1;
        y -= 1;
        boolean isNearVar = false;
        if (verticalId == 0) {
            for (int i = 0; i < size; i++) {
                if ((y + 1) < 10 && (x + i) < 10 && selfArea[x + i][y + 1] != 1 && selfArea[x + i][y - 1] != 1) {
                    continue;
                } else {
                    isNearVar = true;
                    break;
                }
            }
        } else if (verticalId == 1) {
            for (int i = 0; i < size; i++) {
                if ((x + 1) < 10 && (y + i) < 10 && selfArea[y + i][x + 1] != 1 && selfArea[y + i][x - 1] != 1) {
                    continue;
                } else {
                    isNearVar = true;
                    break;
                }
            }
        }
        return isNearVar;
    }
    @Getter
    protected HashMap<Integer, Integer> amountOfShips = new HashMap<>();
    public void refactorAmountOfShips(int key, int value) {
        this.amountOfShips.put(key, amountOfShips.get(key) + value);
    }
}
