package payment;

public class OnlinePaymentFactory implements PaymentMethodFactory {

    @Override
    public PaymentMethod create() {
        return new OnlinePayment();
    }
}
