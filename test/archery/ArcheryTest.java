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
    }
    @Test
    void thatPlayerClassExist(){
        assertNotNull(player1);
        assertNotNull(player2);
        assertNotNull(player3);
    }
    @Test
    void playerPlayGameThreeTimes(){
        for(int i = 0; i < 3; i++){
            player1.playArchery();
            player2.playArchery();
            player3.playArchery();
        }
     }
//     archeryBoard.display();
}
