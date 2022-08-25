public class CompositeExample {
    public static void main(String[] args) {
        Phone samsung = new Samsung("A12",64,"red");
        Phone IPhone = new IPhone("XR",128,"blue");

        PhoneSeller phoneSeller = new PhoneSeller();
        phoneSeller.addPhone(IPhone);
        phoneSeller.addPhone(samsung);
        phoneSeller.soldPhone();
    }
}
