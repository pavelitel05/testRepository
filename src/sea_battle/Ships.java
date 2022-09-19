package sea_battle;

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
}
