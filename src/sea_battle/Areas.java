package sea_battle;

public class Areas {
//    Реализация через строку
//    private String ownerArea;
//    public void createOwnerArea() {
//        String ownerArea;
//        ownerArea = "0 0 0 0 0 0 0 0 0 0\n" +
//                    "0 0 0 0 0 0 0 0 0 0\n" +
//                    "0 0 0 0 0 0 0 0 0 0\n" +
//                    "0 0 0 0 0 0 0 0 0 0\n" +
//                    "0 0 0 0 0 0 0 0 0 0\n" +
//                    "0 0 0 0 0 0 0 0 0 0\n" +
//                    "0 0 0 0 0 0 0 0 0 0\n" +
//                    "0 0 0 0 0 0 0 0 0 0\n" +
//                    "0 0 0 0 0 0 0 0 0 0\n" +
//                    "0 0 0 0 0 0 0 0 0 0\n";
//        this.ownerArea = ownerArea;
//    }
//
//    public String getOwnerArea() {
//        return ownerArea;
//    }
//    public void setOwnerArea(String ownerArea){
//        this.ownerArea = ownerArea;
//    }
//    public void showOwnerArea(){
//        for(int i = 0; i < 10){
//
//        }
//    }


//    Реализация через двумерынй массив
    public int[][] getOwnerArea() {
        return ownerArea;
    }
    public void setOwnerArea(int[][] ownerArea){
        this.ownerArea = ownerArea;
    }

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
