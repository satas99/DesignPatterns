public class LandAgent {
    public static void main(String[] args) {
        House house = new House.HouseBuilder("Elazig", "Merkez")
                .terrace(true)
                .build();
        System.out.println(house);

    }
}

