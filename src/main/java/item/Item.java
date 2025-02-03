package item;

public class Item {
    //String, int, float, double, => type
    private String name;
    private int price;

    // constructor가 아무것도 없는걸로 정의되어있음.


    //command + n
    // 은닉화를 위해 getter, setter


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
