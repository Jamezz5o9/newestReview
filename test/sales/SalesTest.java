package sales;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class SalesTest {
    private SalesPerson ola;
    private Item samsung;
    private Item nokia;
    private Item motorolla;
    private Item iPhone;
    private Item[] itemSold = new Item[5];


    @BeforeEach
    void setUp(){
        samsung = new Item();
        nokia = new Item();
        motorolla = new Item();
        iPhone = new Item();
        ola = new SalesPerson();
        ola.setSoldItems(itemSold);

    }
    @Test
    void weCanGetSoldItemsBySalesPerson(){
       samsung.setValue(5000);
       nokia.setValue(1000);
       motorolla.setValue(2000);
       iPhone.setValue(10_000);
       assertEquals(5000, samsung.getValue());
    }
    @Test
    void checkTheLengthOfItemSold(){
        assertEquals(5, ola.getSoldItems().length);
    }
    @Test
    void calculateEarnings(){
        itemSold[0] = iPhone;
        assertEquals(iPhone, ola.getSoldItems()[0]);

        iPhone.setValue(5000);
        samsung.setValue(5000);
        nokia.setValue(1000);
        motorolla.setValue(2000);
        itemSold = new Item[]{iPhone, samsung, nokia, motorolla};
        ola.setSoldItems(itemSold);
        ola.calculateEarnings();
        assertEquals(1370, ola.getEarnings());
    }



}
