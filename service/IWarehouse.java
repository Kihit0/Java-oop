package homework.warehouse.service;

import homework.warehouse.entity.Product;

public interface IWarehouse {
    void addProduct(Product product);
    void deleteProduct(Integer id);
    Product delivery(Integer id, Integer amount);
}
