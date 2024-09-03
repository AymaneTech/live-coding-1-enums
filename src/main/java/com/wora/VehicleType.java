package com.wora;

public enum VehicleType implements Drivable, Identifiable, Insurable {

    CAR(4, "Gasoline") {
        @Override
        public void insure() {
            System.out.println("Car insurance is being processed");
        }

        @Override
        public void drive() {
            System.out.println("Driving a car with " + this.getFuelType() + " fuel.");
        }
    },

    MOTORCYCLE(2, "Gasoline") {
        @Override
        public void insure() {
            System.out.println("Motorcycle car insurance is being processed.");
        }

        @Override
        public void drive() {
            System.out.println("Riding a motorcycle with " + this.getFuelType() + " fuel.");
        }
    },

    ELECTRIC_CAR(4, "Electric") {
        @Override
        public void insure() {
            System.out.println("Electric car insurance is being processed.");
        }

        @Override
        public void drive() {
            System.out.println("Driving an electric car with " + this.getFuelType() + " fuel.");
        }
    };

    private final Integer numberOfWheels;
    private final String fuelType;

    VehicleType(Integer numberOfWheels, String fuelType) {
        this.numberOfWheels = numberOfWheels;
        this.fuelType = fuelType;
    }

    public Integer getNumberOfWheels() {
        return numberOfWheels;
    }

    public String getFuelType() {
        return fuelType;
    }

    @Override
    public String getIdentifier() {
        return this.name() + "@" + this.ordinal();
    }
}

interface Identifiable {
    String getIdentifier();
}

interface Insurable {
    void insure();
}

interface Drivable {
    void drive();
}