package user;

import java.util.List;

import shop.Item;

public class User {
    private String login;
    private String password;
    private Basket basket;

    public User(String login, String password, List<Item> item) {
        this.login = login;
        this.password = password;
        this.basket = new Basket(item);
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public Basket getBasket() {
        return basket;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setBasket(Basket basket) {
        this.basket = basket;
    }

    @Override
    public String toString() {

        return String.format("Login: %s, Password: %s, Basket: %s", login, password, basket.toString());
    }
}
