package polling;

import java.util.Scanner;

public class Polling {
    private static Scanner input = new Scanner(System.in);
    private static String[] issues = {"political", "poverty", "education","mental","financial"};
    private static int[][] responses = new int[5][10];
    private static int numberOfPeople;
    public static void main(String[] args) {
        rateIssue();
        output();
    }

    private static void output() {
        System.out.printf("%-30s%s%24s%n", "CAUSES", "INDIVIDUAL RATINGS", "AVG");
        System.out.println("--------------------------------------------------------------------------");
        double avg = 0;
        double sum = 0;
        for(int i = 0; i < responses.length; i++){
            System.out.printf("%-15s", issues[i]);
            for(int j = 0; j < responses[i].length; j++){
                System.out.printf("%5d", responses[i][j]);
                sum += responses[i][j];
                avg = sum / numberOfPeople;
            }
            System.out.printf("%8.2f", avg);
            sum = 0;
            System.out.println();
        }
    }

    private static void rateIssue() {
        System.out.println("Enter the number of people that want to respond to this survey");
        numberOfPeople = input.nextInt();
        for(int i = 0; i < numberOfPeople; i++){
            for(int j = 0; j < issues.length; j++){
                System.out.println("Enter rating between 1 - 10 for" + " " + issues[j] + " " + "issue");
                int issueRating = input.nextInt();
                responses[j][i] = issueRating;
            }
        }
    }


}

