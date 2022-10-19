package archery;

public class ArcheryBoard {
    private int[][] displayBoard = new int[3][3];
    private int max;
    private int min;
    private int[] winner = new int[3];

    public int[][] getDisplayBoard() {
        return displayBoard;
    }
    public void displayResult(){
        System.out.printf("%n%n");
        System.out.printf("%-18s%-18s%-18s%-18s%s%n", "Player Number", "First Chance", "Second Chance", "Third Chance", "Total Score");
        System.out.println("------------------------------------------------------------------------------------");
        int sum = 0;
        for(int i = 0; i < displayBoard.length; i++){
            System.out.printf("player%-18d", i+1);
            for(int j = 0; j < displayBoard[i].length; j++){
                System.out.printf("%-18d", displayBoard[i][j]);
                sum += displayBoard[i][j];
                winner[i] = sum;
            }
            System.out.println(sum);
            sum = 0;
            System.out.println();
        }
      displayWinner();
    }
    private void displayWinner() {
        System.out.println();
        for(int i = 0; i < winner.length; i++){
            if(winner[i] > max){
                max = winner[i];
            }
            if(winner[i] < min){
                min = winner[i];
            }
        }
        firstPosition();
    }
    private void firstPosition() {
        String result = "";
        if(max == winner[0]){
            System.out.println("Player 1 is the winner of this Archery competition");
        } else if (max == winner[1]) {
            System.out.println("Player 2 is the winner of this Archery competition");
        } else{
            System.out.println("Player 3 is the winner of this Archery competition");
        }
    }

}
