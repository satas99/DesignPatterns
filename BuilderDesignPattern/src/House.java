public final class House {
    private final String city;//required
    private final String district;//required
    private final boolean hasPark;//optional
    private final boolean hasTerrace;//optional
    private final boolean hasPool;//optional

    public House(HouseBuilder builder) {
        this.city = builder.city;
        this.district = builder.district;
        this.hasPark = builder.hasPark;
        this.hasTerrace = builder.hasTerrace;
        this.hasPool = builder.hasPool;
    }

    @Override
    public String toString() {
        return "House{" +
                "city='" + city + '\'' +
                ", district='" + district + '\'' +
                ", park=" + hasPark +
                ", terrace=" + hasTerrace +
                ", pool=" + hasPool +
                '}';
    }

    public boolean isHasPark() {
        return hasPark;
    }

    public boolean isHasTerrace() {
        return hasTerrace;
    }

    public String getCity() {
        return city;
    }

    public String getDistrict() {
        return district;
    }


    public boolean getPool() {
        return hasPool;
    }

    public static class HouseBuilder {
        private final String city;
        private final String district;
        private boolean hasPark;
        private boolean hasTerrace;
        private boolean hasPool;

        public HouseBuilder(final String city, final String district) {
            this.city = city;
            this.district = district;

        }

        public HouseBuilder park(final boolean hasPark) {
            this.hasPark = hasPark;
            return this;
        }

        public HouseBuilder pool(final boolean hasPool) {
            this.hasPool = hasPool;
            return this;
        }

        public HouseBuilder terrace(final boolean hasTerrace) {
            this.hasTerrace = hasTerrace;
            return this;
        }

        public House build() {
            return new House(this);
        }
    }

}
