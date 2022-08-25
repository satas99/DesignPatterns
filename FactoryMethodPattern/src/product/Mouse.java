package product;

import java.math.BigDecimal;

public class Mouse implements Product {

    public final BigDecimal price;
    public final String brand;

    public Mouse(final BigDecimal price, final String brand) {
        this.price = price;
        this.brand = brand;
    }

    @Override
    public String getName() {
        return String.format("%s Mouse", brand);
    }

    public BigDecimal getPrice() {
        return price;
    }
}
