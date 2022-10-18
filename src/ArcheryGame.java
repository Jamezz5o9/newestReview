import java.security.SecureRandom;

public class ArcheryGame {
    private static SecureRandom random = new SecureRandom();
    private static int[] players = new int[3];
    private static int[] winner = new int[3];
    private static int result;
    private static int max = Integer.MIN_VALUE;
    private static int min = Integer.MAX_VALUE;
    private static int[][] displayBoard = new int[3][3];
    public static void main(String[] args) {
        playArchery();
        outputResult();
        displayWinner();
    }

    private static void displayWinner() {
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
        secondPosition();
        thirdPosition();
    }

    private static void secondPosition() {
        if(winner[0] != min && winner[0] != max){
            System.out.println("Player 1 came second this Archery competition");
        } else if (winner[1] != min && winner[1] != max) {
            System.out.println("Player 2 came second this Archery competition");
        } else{
            System.out.println("Player 3 came second this Archery competition");
        }
    }

    private static void thirdPosition() {
        if(min == winner[0]){
            System.out.println("Player 1 came last in this Archery competition");
        } else if (min == winner[1]) {
            System.out.println("Player 2 came last in this Archery competition");
        } else{
            System.out.println("Player 3 came last in this Archery competition");
        }
    }

    private static void firstPosition() {
        if(max == winner[0]){
            System.out.println("Player 1 is the winner of this Archery competition");
        } else if (max == winner[1]) {
            System.out.println("Player 2 is the winner of this Archery competition");
        } else{
            System.out.println("Player 3 is the winner of this Archery competition");
        }
    }

    private static void outputResult() {
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
    }

    private static void playArchery() {
     for(int i = 0; i < players.length; i++){
         for(int j = 0; j < 3; j++){
             result = random.nextInt(11);
             displayBoard[i][j] = result;
         }
     }
    }
}
