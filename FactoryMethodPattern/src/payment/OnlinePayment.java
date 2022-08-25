package payment;

import product.Product;

public class OnlinePayment implements PaymentMethod {

    @Override
    public void makePayment(final Product product) {
        System.out.println(String.format("online payment for %s : %s ", product.getName(), product.getPrice()));
    }
}
