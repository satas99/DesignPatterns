public class IPhone implements Phone {

    private String modelName;
    private Integer storage;
    private String color;

    public IPhone(final String modelName, final Integer storage, final String color) {
        this.modelName = modelName;
        this.storage = storage;
        this.color = color;
    }

    public void soldPhone() {
        System.out.println(getClass().getSimpleName() + modelName +" "+storage +" GB"+" sold");
    }
}
