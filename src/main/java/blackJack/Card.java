package blackJack;

public class Card {
    private String shape;
    private int num;

    public Card(String shape, int num) {
        this.shape = shape;
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public String getShape() {
        return shape;
    }
}
