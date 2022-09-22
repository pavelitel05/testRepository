package sea_battle;

import java.util.Locale;

public class Rules {
    public static void printRules(String command) {
        if(command.equals("Rules")){
            System.out.println("Where will be rules");
        }
    }
    public boolean canSet(int[][] playerArea, int x, int y, int verticalID, int size){
        boolean canSet = true;
        if(verticalID == 0){
            if(x + size < 11) {
                for (int cord = -1; cord < size + 1; cord++) {
                    if ((playerArea[y][x + cord] != 1 | (y == 0 & x + cord == 1) | (y == 1 & x + cord == 11) | (y == 11 & x + cord == 0) | (y == 11 & x + cord == 1)) & (playerArea[y - 1][x + cord] != 1 | (y - 1 == 0 & x + cord == 1) | (y -1 == 1 & x + cord == 11) | (y - 1 == 11 & x + cord == 0) | (y - 1 == 11 & x + cord == 1)) & (playerArea[y + 1][x + cord] != 1 | (y + 1 == 0 & x + cord == 1) | (y + 1 == 1 & x + cord == 11) | (y + 1 == 11 & x + cord == 0) | (y + 1 == 11 & x + cord == 1))) {
                        continue;
                    } else {
                        canSet = false;
                        break;
                    }
                }
            }else{
                canSet = false;
                return canSet;
            }
        }else{
            if(y + size < 11) {
                for (int cord = -1; cord < size + 1; cord++) {
                    if ((playerArea[y + cord][x] != 1 | (y + cord == 0 & x == 1) | (y + cord == 1 & x == 11) | (y + cord == 11 & x == 0) | (y + cord == 11 & x == 1)) & (playerArea[y + cord][x + 1] != 1 | (y + cord == 0 & x + 1 == 1) | (y + cord == 1 & x + 1 == 11) | (y + cord == 11 & x + 1 == 0) | (y + cord == 11  & x + 1 == 1)) & (playerArea[y + cord][x - 1] != 1 | (y + cord == 0 & x - 1 == 1) | (y + cord == 1 & x - 1 == 11) | (y + cord == 11 & x - 1 == 0) | (y + cord == 11 & x - 1 == 1))) {
                        continue;
                    } else {
                        canSet = false;
                        break;
                    }
                }
            }else{
                canSet = false;
                return canSet;
            }
        }
        return canSet;
    }
}
