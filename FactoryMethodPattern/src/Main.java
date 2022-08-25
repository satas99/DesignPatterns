import payment.OnlinePaymentFactory;
import payment.PaymentMethod;
import payment.PaymentMethodFactory;
import product.Laptop;
import product.Product;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) throws Exception {
        Product product = new Laptop(BigDecimal.valueOf(20000), "Lenovo", "ThinkPad");
        PaymentMethodFactory paymentServiceFactory = new OnlinePaymentFactory();

        PaymentMethod paymentService = paymentServiceFactory.create();
        paymentService.makePayment(product);

    }
}
