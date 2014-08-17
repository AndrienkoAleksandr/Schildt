package enum_.enum3;

/**
 * Created by USER on 05.06.2014.
 */
public enum Apple {
    Jonathan(10), GoldenDel(15), RedDel, Winesap(9), Cortland(21);
    private int price;
    Apple(int p) {
        price = p;
    }
    Apple () {
        price = -1;
    }
    public int getPrice() {
        return price;
    }
}
