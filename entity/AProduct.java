package homework.warehouse.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public abstract class AProduct {
    protected String name;
    protected  String price;
    protected  Integer quantity;
    protected Integer id;

    public abstract void decreaseQuantity(Integer amount);
    public abstract void increaseQuantity(Integer amount);
}
