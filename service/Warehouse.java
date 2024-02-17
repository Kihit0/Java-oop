package homework.warehouse.service;

import homework.warehouse.entity.Product;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class Warehouse implements IWarehouse {
    private final List<Product> products;
    public Warehouse() {
        this.products = new ArrayList<>();
    }

    @Override
    public void addProduct(Product product) {
        this.products.add(product);
    }

    @Override
    public void deleteProduct(Integer id) {
        products.removeIf(product -> product.getId().equals(id));
    }

    @Override
    public Product delivery(Integer id, Integer amount) {
        Product result = null;
        for(Product product: products){
            if(product.getId().equals(id) && product.getQuantity() >= amount){
                result = product;
                product.decreaseQuantity(amount);
                if(product.getQuantity() == 0) deleteProduct(id);
            }
        }

        return result;
    }

    @Override
    public String toString() {
        return "Warehouse{" +
                "products=" + products +
                '}';
    }
}
