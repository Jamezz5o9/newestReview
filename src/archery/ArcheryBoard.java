package archery;

public class ArcheryBoard {
    private int[][] displayResult;
    public void displayResult(){
        for(int i = 0; i < displayResult.length; i++){
            for(int j = 0; j < displayResult[i].length; j++){
                System.out.println(displayResult[i][j]);
            }
        }
    }
}
