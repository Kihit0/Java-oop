package helpers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import shop.Category;
import shop.Item;
import user.User;

public class Fill {

    private static void fillItem(List<Item> itemsTechnical, List<Item> itemsPhone) {

        itemsTechnical.addAll(Arrays.asList(
                new Item("Laptop", 1000, 9.2),
                new Item("PC", 800, 8.8),
                new Item("PS", 500, 8.9)));

        itemsPhone.addAll(Arrays.asList(
                new Item("Xiaomi", 100, 9.5),
                new Item("Samsung", 300, 8.3),
                new Item("Apple", 1000, 9.5)));

    }

    private static void fillCategory(List<Category> categories, List<Item> itemsTechnical, List<Item> itemsPhone) {

        categories.addAll(Arrays.asList(
                new Category("Technical", itemsTechnical),
                new Category("Phone", itemsPhone)));

    }

    private static void fillUser(List<User> users) {

        users.addAll(Arrays.asList(
                new User("User12333", "password1233", new ArrayList<>()),
                new User("User123111", "password14141", new ArrayList<>()),
                new User("User12", "qwerty", new ArrayList<>())));

    }

    protected static void init(
            List<Category> categories,
            List<Item> itemsTechnical,
            List<Item> itemsPhone,
            List<User> users) {
        fillItem(itemsTechnical, itemsPhone);
        fillCategory(categories, itemsTechnical, itemsPhone);
        fillUser(users);
    }
}
