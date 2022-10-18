package archery;

import java.security.SecureRandom;

public class Player {
    private int[][] displayResult;
    private String name;
    private int age;
    private int result;
    private static SecureRandom random = new SecureRandom();

    public Player(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void playArchery() {
       result =  random.nextInt(10);
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
