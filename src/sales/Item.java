package sales;

public class Item {
    private double value;
    public Item(){}

    public Item(double i) {
        value = i;
    }

    public double getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
