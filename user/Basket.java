package user;

import java.util.ArrayList;
import java.util.List;

import shop.Item;

public class Basket {
    private List<Item> buyItems = new ArrayList<>();

    public Basket(List<Item> item) {
        this.buyItems.addAll(item);
    }

    public List<Item> getBuyItems() {
        return buyItems;
    }

    public void setBuyItems(List<Item> buyItems) {
        this.buyItems = buyItems;
    }

    @Override
    public String toString() {

        return String.format("Buy items: %s", buyItems.toString());
    }
}
