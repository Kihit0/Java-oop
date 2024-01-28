package shop;

import java.util.ArrayList;
import java.util.List;

public class Category {
    private String name;
    private List<Item> items = new ArrayList<>();

    public Category(String name, List<Item> item) {
        this.name = name;
        this.items.addAll(item);
    }

    public String getName() {
        return name;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setItems(List<Item> items) {
        this.items.addAll(items);
    }

    public void removeItem(int id){
        this.items.remove(id);
    }

    @Override
    public String toString() {

        return String.format("Category name: %s, Items: %s", name, items.toString());
    }

}
