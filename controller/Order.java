package homework.warehouse.controller;

import homework.warehouse.entity.Product;
import homework.warehouse.service.Warehouse;
import homework.warehouse.view.View;

public class Order {
    private final Warehouse warehouse = new Warehouse();
    private  final View view = new View();

    private void fill(){
        warehouse.addProduct(new Product("PC", "500$", 10, 1));
        warehouse.addProduct(new Product("PS", "500$", 10, 2));
        warehouse.addProduct(new Product("Laptop", "500$", 10, 3));
    }

    public void init(){
        fill();
        processOrder(warehouse.getProducts().get(1), 10);
    }

    public void processOrder(Product product, Integer amount){
        view.view(warehouse.delivery(product.getId(), amount));
    }

}
