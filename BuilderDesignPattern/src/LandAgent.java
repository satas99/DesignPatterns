public class LandAgent {
    public static void main(String[] args) {
        House house = new House.HouseBuilder("Elazig", "Merkez")
                .numberOfBathrooms(4)
                .build();
        System.out.println(house);

    }
}

