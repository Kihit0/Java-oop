package homework.warehouse.entity;
public class Product extends AProduct {

    public Product(String name, String price, Integer quantity, Integer id) {
        super(name, price, quantity, id);
    }

    @Override
    public void decreaseQuantity(Integer amount) {
        this.quantity  -= amount;
    }

    @Override
    public void increaseQuantity(Integer amount) {
        this.quantity += amount;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price='" + price + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
