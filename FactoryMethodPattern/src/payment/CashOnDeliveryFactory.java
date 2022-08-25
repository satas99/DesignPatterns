package payment;

public class CashOnDeliveryFactory implements PaymentMethodFactory {
    @Override
    public PaymentMethod create() {
        return new CashOnDelivery();
    }
}
