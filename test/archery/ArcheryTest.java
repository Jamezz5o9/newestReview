package archery;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ArcheryTest {
    private Player player1;
    private Player player2;
    private Player player3;

    private ArcheryBoard archeryBoard;

    @BeforeEach
    void setUp(){
        player1 = new Player("James", 20);
        player2 = new Player("Favour", 15);
        player3 = new Player("Temitope", 30);
        archeryBoard = new ArcheryBoard();
    }
    @Test
    void thatPlayerClassExist(){
        assertNotNull(player1);
        assertNotNull(player2);
        assertNotNull(player3);
    }
    @Test
    void playerPlayGameThreeTimes(){
        player1.playArchery(archeryBoard);
        player2.playArchery(archeryBoard);
        player3.playArchery(archeryBoard);

        archeryBoard.displayResult();

    }

     @Test
     void pointIsGeneratedWhenPlayerPlaysGame(){
        player1.playArchery(archeryBoard);
        assertEquals(20, player1.getAge());
        assertEquals(2, player1.getResult());
     }
}
