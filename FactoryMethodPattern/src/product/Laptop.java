package product;

import java.math.BigDecimal;

public class Laptop implements Product {

    private final BigDecimal price;
    private final String brand;
    private final String model;

    public Laptop(final BigDecimal price, final String brand, final String model) {
        this.price = price;
        this.brand = brand;
        this.model = model;
    }

    public BigDecimal getPrice() {
        return price;
    }

    @Override
    public String getName() {
        return String.format("%s %s", brand, model);
    }
}
