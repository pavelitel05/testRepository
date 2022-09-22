package sea_battle;

import lombok.Getter;
import lombok.Setter;
import java.util.concurrent.ThreadLocalRandom;
public class Area extends Ships{
    @Getter
    @Setter
    private int[][] ownerArea = new int[10][10];
    public int[][] feelOwnerArea(int[][] ownerArea){
        for(int y = 0; y < 9; y++){
            for(int x = 0; x < 9; x++){
                int sizeFactor = ThreadLocalRandom.current().nextInt(1, 5);
                if(this.amountOfShips.get(sizeFactor) != 0){
                    int vertFactor = ThreadLocalRandom.current().nextInt(0,2);
                    if(isNear(x + 1,y + 1,sizeFactor, vertFactor,ownerArea)){
                        continue;
                    }else{
                        ownerArea = setShip(vertFactor, x + 1, y + 1, sizeFactor, ownerArea);
                        this.amountOfShips.put(sizeFactor, this.amountOfShips.get(sizeFactor) - 1);
                    }
                }
            }
        }
        if(this.amountOfShips.get(1) + this.amountOfShips.get(2) + this.amountOfShips.get(3) + this.amountOfShips.get(4) != 0){
            feelOwnerArea(ownerArea);
        }
        return ownerArea;
    }
    public void createOwnerArea(){
        int[][] ownerArea = new int[10][10];
        for (int i = 0; i < 10; i ++){
            for (int j = 0; j < 10; j ++){
                ownerArea[i][j] = 0;
            }
        }
        this.ownerArea = ownerArea;
  }
    public void showOwnerArea(){
        for (int[] i: ownerArea){
            for (int j: i){
                System.out.print(j);
                System.out.print("  ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
