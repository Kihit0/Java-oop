import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import helpers.Fill;
import shop.*;
import user.Basket;
import user.User;

public class Main extends Fill {
    private static List<Category> categories = new ArrayList<>();
    private static List<User> users = new ArrayList<>();
    private static List<Item> itemsTechnical = new ArrayList<>();
    private static List<Item> itemsPhone = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    private static void showUser() {
        System.out.println("Choice user");
        System.out.println("====================================");
        for (int i = 0; i < users.size(); i++) {
            System.out.printf("%d: %s\n", i, users.get(i).getLogin());
        }
        System.out.println("====================================");
    }

    private static void showItemsWithCategory() {

        for (Category category : categories) {

            System.out.printf("Category: %s\n", category.getName());
            System.out.println("====================================");
            List<Item> items = category.getItems();

            for (Item item : items) {
                System.out.println(item);

            }
            System.out.println("====================================\n");
        }
    }

    private static int showItemsNumbers() {
        int count = 0;
        System.out.println("Choice without items:");
        System.out.println("====================================");
        for (Category category : categories) {
            List<Item> items = category.getItems();

            for (int i = 0; i < items.size(); i++) {
                System.out.printf("%d: %s\n", count, items.get(i));
                count++;
            }
        }

        System.out.println("====================================\n");

        return count;
    }

    private static void showUserWithItems() {
        System.out.println("====================================");
        for (int i = 0; i < users.size(); i++) {
            System.out.printf("%d: %s\n", i, users.get(i));
        }
        System.out.println("====================================");
    }

    private static void buyItem(User user) {
        /* Choice user */
        int count = showItemsNumbers();

        System.out.print("Choice: ");

        int choice = scanner.nextInt();
        if (choice >= count) {
            System.out.println("Wrong choice!");
            while (choice >= count) {
                System.out.print("Choice without items: ");
                choice = scanner.nextInt();
            }
        }

        count = 0;

        for (Category category : categories) {
            List<Item> items = category.getItems();
            for (int i = items.size() - 1; i >= 0; --i) {
                if (count == choice) {
                    category.removeItem(i);
                    Basket buy = new Basket(Arrays.asList(items.get(i)));
                    user.setBasket(buy);

                    break;
                }
                count++;
            }

            if(count == choice) break;

        }

    }

    private static void show() {

        int choice;
        while (true) {
            /* Choice */
            System.out.println("Choice without:");
            System.out.println("1 - Show items");
            System.out.println("2 - Buy items");
            System.out.println("3 - Show user with items");
            System.out.println("0 - End choice");

            System.out.print("Enter: ");
            choice = scanner.nextInt();
            System.out.println();

            if (choice == 0)
                break;

            switch (choice) {
                case 1:
                    showItemsWithCategory();
                    break;
                case 2:
                    showUser();
                    System.out.print("Enter: ");
                    int idLogin = scanner.nextInt();
                    if (idLogin >= users.size()) {
                        while (idLogin >= users.size()) {
                            idLogin = scanner.nextInt();
                        }
                    }
                    buyItem(users.get(idLogin));
                    break;
                case 3:
                    showUserWithItems();
                    break;
                default:
                    break;
            }

        }
    }

    public static void main(String[] args) {
        init(categories, itemsTechnical, itemsPhone, users);
        show();

    }
}