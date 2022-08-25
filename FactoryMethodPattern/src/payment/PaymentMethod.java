package payment;

import product.Product;

public interface PaymentMethod {
    void makePayment(Product product);
}
