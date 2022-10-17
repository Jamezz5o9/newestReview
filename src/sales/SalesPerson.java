package sales;

import java.math.BigDecimal;

public class SalesPerson {
    private final int WEEKLY_PAY = 200;
    private final double COMMISSION_RATE = 0.09;
    private double earnings;
   private Item items;
    private Item[] soldItems;

    public Item[] getSoldItems() {
        return soldItems;
    }
    public void setSoldItems(Item[] soldItems) {
        this.soldItems = soldItems;
    }
    public void calculateEarnings(){
        double initialEarnings = BigDecimal.ZERO.doubleValue();
        for(int i = 0; i < getSoldItems().length; i++){
             initialEarnings += soldItems[i].getValue();
        }
        earnings = (initialEarnings * COMMISSION_RATE) + WEEKLY_PAY;
    }

    public double getEarnings() {
        return earnings;
    }
}
