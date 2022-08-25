import java.util.ArrayList;
import java.util.List;

public class PhoneSeller implements Phone {

    private List<Phone> phones = new ArrayList<Phone>();


    public void soldPhone() {
        for (Phone phone : phones) {
            phone.soldPhone();
        }
    }

    public void addPhone(Phone phone) {
        phones.add(phone);
    }

    public void removePhone(Phone phone) {
        phones.remove(phone);
    }
}
