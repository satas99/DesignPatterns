public final class House {
    private final String city;//required
    private final String district;//required
    private final int numberOfRooms;//optional
    private final int numberOfBathrooms;//optional
    private final int storey;//optional

    public House(HouseBuilder builder) {
        this.city = builder.city;
        this.district = builder.district;
        this.numberOfRooms = builder.numberOfRooms;
        this.numberOfBathrooms = builder.numberOfBathrooms;
        this.storey = builder.storey;
    }

    @Override
    public String toString() {
        return "House{" +
                "city='" + city + '\'' +
                ", district='" + district + '\'' +
                ", numberOfRooms=" + numberOfRooms +
                ", numberOfBathrooms=" + numberOfBathrooms +
                ", storey=" + storey +
                '}';
    }

    public String getCity() {
        return city;
    }

    public String getDistrict() {
        return district;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public int getNumberOfBathrooms() {
        return numberOfBathrooms;
    }

    public int getStorey() {
        return storey;
    }

    public static class HouseBuilder {
        private final String city;
        private final String district;
        private int numberOfRooms;
        private int numberOfBathrooms;
        private int storey;

        public HouseBuilder(final String city, final String district) {
            this.city = city;
            this.district = district;

        }

        public HouseBuilder numberOfRooms(final int numberOfRooms) {
            this.numberOfRooms = numberOfRooms;
            return this;
        }

        public HouseBuilder storey(final int storey) {
            this.storey = storey;
            return this;
        }

        public HouseBuilder numberOfBathrooms(final int numberOfBathrooms) {
            this.numberOfBathrooms = numberOfBathrooms;
            return this;
        }

        public House build() {
            return new House(this);
        }
    }

}
