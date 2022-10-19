package archery;

import java.security.SecureRandom;

public class Player {
    private String name;
    private int age;
    private int result;
    private static SecureRandom random = new SecureRandom();

    public Player(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void playArchery(ArcheryBoard archeryBoard) {
        int[][] display = archeryBoard.getDisplayBoard();
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                result =  random.nextInt(11);
                display[i][j] = result;
            }
        }

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getResult() {
        return result;
    }
}
