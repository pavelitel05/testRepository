package sea_battle;

import lombok.Getter;
import lombok.Setter;

public class Area {
    @Getter
    @Setter
    private int[][] ownerArea = new int[10][10];
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
            System.out.println("");
        }
    }
}
