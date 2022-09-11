package sea_battle;

public class Areas {
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
    public int[][] getOwnerArea() {
        return ownerArea;
    }
    public void setOwnerArea(int[][] ownerArea){
        this.ownerArea = ownerArea;
    }
}
