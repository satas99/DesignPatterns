package payment;

import product.Product;

public class CashOnDelivery implements PaymentMethod {

    @Override
    public void makePayment(final Product product) {
        System.out.println(String.format("cash on delivery for %s : %s ", product.getName(), product.getPrice()));
    }
}
